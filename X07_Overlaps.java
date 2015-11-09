
import java.util.Scanner;

public class X07_Overlaps { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // and say whether the point is inside both rectangles, inside one of them only, or out of both.

        Rectangle firstRectangle = new Rectangle();
        firstRectangle.downLeft = new Point();
        firstRectangle.upRight = new Point();
        System.out.println("First enter the co-ordinates of the first rectangle.");
        System.out.println("Give the x of the first point (down left): "); 
firstRectangle.downLeft.x = input.nextDouble(); 
System.out.println("Give the y of the first point (down left): ");
        firstRectangle.downLeft.y = input.nextDouble();
        System.out.println("Give the x of the second point (up right): ");
        firstRectangle.upRight.x = input.nextDouble();
        System.out.println("Give the y of the first point (up right): ");
        firstRectangle.upRight.y = input.nextDouble();
        Rectangle secondRectangle = new Rectangle();
        secondRectangle.downLeft = new Point();
        secondRectangle.upRight = new Point();
        System.out.println("Secondly enter the co-ordinates of the second rectangle.");
        System.out.println("Give the x of the first point (down left): "); 
secondRectangle.downLeft.x = input.nextDouble(); 
System.out.println("Give the y of the first point (down left): ");
        secondRectangle.downLeft.y = input.nextDouble();
        System.out.println("Give the x of the second point (up right): ");
        secondRectangle.upRight.x = input.nextDouble();
        System.out.println("Give the y of the first point (up right): ");
        secondRectangle.upRight.y = input.nextDouble();
        Point point5 = new Point();
        System.out.println("Give the x of the fifth point alone: ");
        point5.x = input.nextDouble(); 
System.out.println("Give the y of the fifth point alone: ");
        point5.y = input.nextDouble();
        boolean insidefirstrectangle = true;
        boolean insidesecondrectangle = true;
        if ((point5.x >= firstRectangle.downLeft.x) && (point5.x <= firstRectangle.upRight.x) && (point5.y >= firstRectangle.downLeft.y) && (point5.y <= firstRectangle.upRight.y)) {
            System.out.println ("The point is INSIDE the first rectangle");
        } else {
            System.out.println ("The point is OUTSIDE the first rectangle");
            insidefirstrectangle = false;
        } 

if ((point5.x >= secondRectangle.downLeft.x) && (point5.x <= secondRectangle.upRight.x) && (point5.y >= secondRectangle.downLeft.y) && (point5.y <= secondRectangle.upRight.y)) {
            System.out.println ("The point is INSIDE the second rectangle");
        } else {
            System.out.println ("The point is OUTSIDE the second rectangle");
            insidesecondrectangle = false;
        } 

if (insidefirstrectangle == true && insidesecondrectangle == true) {
            System.out.println ("The point is INSIDE both rectangles");
        } else {
            System.out.println ("The point is OUTSIDE both rectangles");
        }
    }
    static class Rectangle {
        Point downLeft;
        Point upRight;
    }
    static class Point {
        double x;
        double y;
    }
}