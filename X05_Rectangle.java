
import java.util.Scanner;

public class X05_Rectangle { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Rectangle 

        Rectangle myRectangle = new Rectangle();
        myRectangle.upLeft = new Point();
        myRectangle.downRight = new Point();
        System.out.println("Give the x of the first point: ");
                // if Groovy add String s = System.console().readLine()

                myRectangle.upLeft.x = input.nextDouble();
            // if Groovy add myRectangle.upLeft.x = Double.parseDouble(s) 

            System.out.println("Give the y of the first point: ");
        myRectangle.upLeft.y = input.nextDouble();
        System.out.println("Give the x of the second point: ");
        myRectangle.downRight.x = input.nextDouble();
        System.out.println("Give the y of the first point: ");
        myRectangle.downRight.y = input.nextDouble();
        double height = (myRectangle.downRight.y - myRectangle.upLeft.y);
        double width = (myRectangle.downRight.x - myRectangle.upLeft.x);
        double perimeter = 2*(width + height);
        double area = width*height;
        System.out.println("The perimeter is " + perimeter + " and the area is " + area + ".");
    }
    static class Rectangle {
        Point upLeft;
        Point downRight;
    }
    static class Point {
        double x;
        double y;
    }
}