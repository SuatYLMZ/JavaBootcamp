package projects.loginPage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {


    List<String> usernames = new ArrayList<>();
    List<String> emails = new ArrayList<>();
    List<String> passwords = new ArrayList<>();

    public void signup() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Name-Surname: ");
        String name = inp.nextLine();

        String username;
        boolean existsUsername;
        do {
            System.out.println("Enter username: ");
            username = inp.nextLine();
            existsUsername = this.usernames.contains(username);
            if (existsUsername) {
                System.out.println("This username is used, try a different username!");
            }
        }while(existsUsername);
        usernames.add(username);

        /*
        : must contain @
        : Must end with gmail.com,hotmail.com or yahoo.com.
        In the username part of the mail (before the @) there can only be upper and lower case letters, numbers or -._ symbols.
         */

        String email;
        boolean isValid;
        boolean existsEmail;

        do {
            System.out.println("Enter email: ");
            email = inp.nextLine();
            isValid = validateEmail(email);
            existsEmail = this.emails.contains(email);
            if (existsEmail) {
                System.out.println("This email is already registered, try a different email!");
                isValid = false;
            }
        } while(!isValid);
        this.emails.add(email);

        String password;
        boolean isValidPas;
        do {
            System.out.println("Enter password: ");
            password = inp.nextLine().trim();
            isValidPas = validatePassword(password);
        }while (!isValidPas);
        this.passwords.add(password);
        System.out.println("Congratulations, "+ username +" you have registered successfully!");
        System.out.println("You can login to the system with your username or email.");
    }

    public void login() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter username or email: ");
        String usernameOrEmail = inp.nextLine();
        boolean isMail = this.emails.contains(usernameOrEmail);
        boolean isUsername = this.usernames.contains(usernameOrEmail);
        int count = 0;
        int index;
        if (isMail || isUsername) {
            boolean isWrong = true;
            while (isWrong) {
                count++;
                System.out.println("Enter your password: ");
                String password = inp.nextLine();

                if (isUsername) index = this.usernames.indexOf(usernameOrEmail);
                else index = this.emails.indexOf(usernameOrEmail);
                if (this.passwords.indexOf(password) == index) {
                    System.out.println("You have logged in to the system successfully!");
                    isWrong = false;
                }
                else {
                    if (count>2) {
                        System.out.println("Your account is blocked, because you failed to enter correct password 3 times!");
                        isWrong = false;
                    } else    System.out.println("Your password in incorrect, please try again...");
                }
            }

        } else {
            System.out.println("No registered user found in the system!");
            System.out.println("If you are a member, please check your information, if you are not, please register!");
        }

    }

    /*
 email validation: must not contain spaces -Done
: must contain @ -Done
: Must end with gmail.com,hotmail.com or yahoo.com.
In the username part of the mail (before the @) there can only be upper and lower case letters, numbers or -._ symbols.

     */
    public boolean validateEmail(String email){
        boolean isValid;
        boolean space = email.contains(" ");
        boolean containsAt = email.contains("@");

        if (space) {
            System.out.println("Email should not contains space!");
            isValid = false;
        } else if (!containsAt) {
            System.out.println("Email must contain @");
            isValid = false;
        } else {
            //This part works as well
//            String []emailPairs = email.split("@");
//            String firstPart = emailPairs[0];
//            String secondPart = emailPairs[1];

            //this code is the same as above code but shorter
            String firstPart = email.split("@")[0];
            String secondPart = email.split("@")[1];

//            if (!usermailname.matches("[A-Za-z0-9-._ ]")) { // checks if a given string matches a specific pattern
//                return false;
//            }

            //here we are replacing all valid characters to check whether invalid characters will be left
            int notValid = firstPart.replaceAll("[0-9a-zA-Z_.-]", "").length();//Burak1_2.3-4#%&  ==> #%&
            boolean checkStart = notValid == 0;

            //here we are checking whether an email ends properly.
            boolean checkEnd = secondPart.equals("gmail.com") ||
                    secondPart.equals("hotmail.com") ||
                    secondPart.equals("yahoo.com");

            // If you have only one action after if-else if or else statements, you can remove {}.
            if (!checkStart) System.out.println("Email cannot contain characters other than upper and lower case letters, numbers or -._ symbols");
            else if (!checkEnd) System.out.println("Email must end with gmail.com, hotmail.com or yahoo.com!");

            isValid = checkStart && checkEnd;
        }

        //after checking the email if email is not valid below statement will be printed.
        if (!isValid) {
            System.out.println("Invalid email, try again...");
        }

        return isValid;
    }
    /*
    password validation:
: must not contain spaces
: must be at least 6 characters
: must contain at least one lowercase letter
: must contain at least one capital letter
: must contain at least one digit
: must contain at least one symbol
     */
    public static boolean validatePassword(String password) {
        boolean isValid = false;
        //Abcd12_%#
        String upperCaseLetter = password.replaceAll("[^A-Z]", ""); //replaces all characters except uppercase Abcd12_%# ==> A
        String lowerCaseLetter = password.replaceAll("[^a-z]", ""); //replaces all characters except lowercase Abcd12_%# ==> bcd
        String digit = password.replaceAll("[\\D]", "");//[^0-9] - replaces all characters except digits Abcd12_%# ==> 12
        String symbol = password.replaceAll("\\P{Punct}", ""); //replaces all characters except symbol Abcd12_%# ==> _%#
        boolean space = password.contains(" "); //This will return true if password contains space otherwise false
        boolean existsUpperCase = upperCaseLetter.length()>0;
        boolean existsLowerCase = lowerCaseLetter.length()>0;
        boolean existsDigit = digit.length()>0;
        boolean existsSymbol = symbol.length()>0;
        boolean passwordLength = password.length()>=6;

        //We will return one of the followings if any of the requirements is false
        if (space)
            System.out.println("Password cannot contain spaces!");
        else if (!passwordLength)
            System.out.println("Password must be at least 6 characters!");// We always focus on negative results so we can get our required result
        else if (!existsUpperCase)
            System.out.println("Password must contain at least one capital letter!");
        else if (!existsLowerCase)
            System.out.println("Password must contain at least one lowercase letter!");
        else if (!existsDigit)
            System.out.println("Password must contains at least one digit!");
        else if (!existsSymbol)
            System.out.println("Password must contain at least one symbol!");
        else isValid=true;
        //isValid = passwordLength && existsUpperCase && existsLowerCase && existsDigit && existsSymbol && !space;

        //If password is invalid we are letting the user know that he can try again.
        if (!isValid) System.out.println("Try again!");
        return isValid;
    }



}