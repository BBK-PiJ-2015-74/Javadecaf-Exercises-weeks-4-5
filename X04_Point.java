
import java.util.Scanner;

public class X04_Point { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //	}

        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        System.out.println("Give the x of the first point: ");
        point1.x = input.nextDouble(); 
System.out.println("Give the y of the first point: ");
        point1.y = input.nextDouble();
        System.out.println("Give the x of the second point: ");
        point2.x = input.nextDouble(); 
System.out.println("Give the y of the second point: ");
        point2.y = input.nextDouble();
        System.out.println("Give the x of the third point: ");
        point3.x = input.nextDouble(); 
System.out.println("Give the y of the third point: ");
        point3.y = input.nextDouble();
        double distance1;
        // Distance between 0 and point1

        double distance2;
        // Distance between 0 and point2

        double distance3;
        // Distance between 0 and point3

        double min;
        distance1 =  Math.pow((point1.x*point1.x + point1.y*point1.y),0.5);
        distance2 =  Math.pow((point2.x*point2.x + point2.y*point2.y),0.5);
        distance3 =  Math.pow((point3.x*point3.x + point3.y*point3.y),0.5);
        if (distance1 <= distance2 && distance1 <= distance3) {
            System.out.println ("The closest point is point 1");
        }
else if (distance2 <= distance1 && distance2 <= distance3) {
            System.out.println ("The closest point is point 2");
        } 
else {
            System.out.println ("The closest point is point 3");
        }
    }
    static class Point {
        double x;
        double y;
    }
}