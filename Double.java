
import java.util.Scanner;

public class Double { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Exercise 1 Java

        double d1 = 1.255;
        double d2 = d1 + 7 - 4 - 3; 
if (d1 == d2) {
            System.out.println("1.255 is equal to 1.255 plus 7 minus 7");
        } else { System.out.println("1.255 is NOT equal to 1.255 plus 7 minus 7");
        }
        System.out.println(d1);
        System.out.println(d2);
    }
}