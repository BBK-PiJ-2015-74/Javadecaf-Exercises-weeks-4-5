
import java.util.Scanner;

public class X06_InsideOutside { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //The program must then determine whether the point falls inside or outside the rectangle.

        Rectangle myRectangle = new Rectangle();
        myRectangle.upLeft = new Point();
        myRectangle.downRight = new Point();
        System.out.println("Give the x of the first point (up left): ");
                // if Groovy add String s = System.console().readLine()

                myRectangle.upLeft.x = input.nextDouble();
            // if Groovy add myRectangle.upLeft.x = Double.parseDouble(s) 

            System.out.println("Give the y of the first point (up left): ");
        myRectangle.upLeft.y = input.nextDouble();
        System.out.println("Give the x of the second point (down right): ");
        myRectangle.downRight.x = input.nextDouble();
        System.out.println("Give the y of the first point (down right): ");
        myRectangle.downRight.y = input.nextDouble();
        Point point3 = new Point();
        System.out.println("Give the x of the third point alone: ");
        point3.x = input.nextDouble(); 
System.out.println("Give the y of the third point alone: ");
        point3.y = input.nextDouble();
        if ((point3.x >= myRectangle.upLeft.x) && (point3.x <= myRectangle.downRight.x) && (point3.y <= myRectangle.upLeft.y) && (point3.y >= myRectangle.downRight.y)) {
            System.out.println ("The point is INSIDE the rectangle");
        } else {
            System.out.println ("The point is OUTSIDE the rectangle");
        }
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