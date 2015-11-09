
import java.util.Scanner;

public class D4_convertbinarydecimal { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            // Switch-choice statement goes here, which calls correct method depending on the choice

            System.out.println ("Please choose which operation you would like to perform:");
        System.out.println ("For Binary to Decimal please enter 1"); 
System.out.println ("For Decimal to Binary please enter 2");
        int choice = 1;
        switch (choice) {
            case 1:
                System.out.println ("Please enter a binary number to convert to a decimal number");
                String myBinary = input.nextLine();
                System.out.println(binary2decimal(myBinary));
                break;
            case 2:
                System.out.println ("Please enter a decimal number to convert to a binary number");
                int myDecimal = input.nextInt();
                decimal2binary(myDecimal);
                System.out.println(decimal2binary(myDecimal));
                break;
            default:
                System.out.println ("Something has gone wrong!");
                break;
        }
    }

    private static int getPower(int base, int exponent){
        // getPower returns base ^ exponent (as int) - good practice to name methods as verbs

        int result = -1;						
	int j=0;
        if (exponent !=0) {
            // calculation below only works if exp !=0

            for (j=0; j<exponent; j++) {
                result = (result * base);
                System.out.println(result);
            }
        } else {
            result = 1;
        }											
	return result;
    }

    private static int getPower2 (int exponent) {
        int result = -1;					
	result = getPower(2, exponent);			
	System.out.println(result);
        return result;
    }

    private static int binary2decimal(String binarystr) {
        int binaryLeng = binarystr.length(); 										
	int pos = 0;
        int binaryDigit = 0;
        int result = 0;
        for (pos = (binaryLeng-1); pos >=0; pos--) {
            char bin = binarystr.charAt(pos);
                    //char c = str.charAt(0) OR can concatenate "" to c and get a string

                    binaryDigit = Character.getNumericValue(bin);
        }
        // e.g. if I had 1010 I now have 0, 1, 0, 1

        for (pos = 0; pos > binaryLeng-1; pos++) {
            result = result + getPower2(pos)*binaryDigit;
        }
        return result;
    }

    private static String decimal2binary (int decimal) {
        int binaryremainder = 0;
        int binaryquotient = 0;
        String result = "";
        while (binaryquotient >=2) {
            binaryquotient = decimal /2;
                    //because it's defined as an int it will only remember the nearest whole number

                    binaryremainder = decimal %2;
            String binarydigit = Integer.toString(binaryremainder);
            result = result + binarydigit;
        }	
	return result;
    }
}