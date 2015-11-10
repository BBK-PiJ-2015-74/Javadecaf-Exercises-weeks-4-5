
import java.util.Scanner;

public class D5_recursion1 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            // Recursion - first exercise

            printNumbers(6);
    }

    private static void printNumbers (int n) {
        if (n<=0) {
            return;
        }
        System.out.println(n);
            //n =6

            printNumbers(n-2);
            //n=4

            printNumbers(n-3);
            //n=1

            System.out.println(n);
    }
}