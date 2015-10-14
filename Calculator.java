
import java.util.Scanner;

public class Calculator { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            // Calculator

            System.out.println ("Please enter the first operand");
        String num1 = input.nextLine();
        double d1 = Double.parseDouble(num1);
        System.out.println ("Please enter the second operand");
        String num2 = input.nextLine();
        double d2 = Double.parseDouble(num2);
        double answer = 0;
        System.out.println ("Please choose which calculator operation you would like to perform:");
        System.out.println ("For addition please enter 1"); 
System.out.println ("For subtraction please enter 2");
        System.out.println ("For multiplication please enter 3");
        System.out.println ("For division please enter 4");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                answer = d1+d2;
                break;
            case 2:
                answer = d1-d2;
                break;
            case 3:
                answer = d1*d2;
                break;
            case 4:
                answer = d1/d2;
                break;
            default:
                System.out.println ("Error - you must enter an option 1, 2, 3 or 4");
                break;
        }
        System.out.println (answer);
    }
}