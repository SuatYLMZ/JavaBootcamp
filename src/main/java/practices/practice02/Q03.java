package practices.practice02;

public class Q03 {

    public static void main(String[] args) {

         /*
            String shirtPrice= "$ 12.99";
            String bookPrice= "$ 35.99";
            Type code to find the sum of the shirt and book prices.

     */
        String shirtPrice= "$ 12.99";
        String bookPrice= "$ 35.99";

        String shirt= shirtPrice.replace("$ ", ""); //"12.99"
        String book = bookPrice.replace("$ ", "");  //"35.99"

        double sd= Double.valueOf(shirt);//this will convert the data type of string "shirt" into double data type
        double bd= Double.valueOf(book);

        System.out.println(sd+ bd);

    }

}