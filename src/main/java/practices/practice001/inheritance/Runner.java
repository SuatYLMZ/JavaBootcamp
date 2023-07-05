package practices.practice001.inheritance;

public class Runner {
    //Create a method that calculates the area of the circle (use inheritance for math operations)
    public static void main(String[] args) {

        areaOfCircle(5);

    }


    public static void areaOfCircle(double radius) {

        Circle circle = new Circle();
        System.out.println(circle.multiply(circle.numOfPi, circle.findSquare(radius)));

    }
}