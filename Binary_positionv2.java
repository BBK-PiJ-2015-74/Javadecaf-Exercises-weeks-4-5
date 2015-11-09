
import java.util.Scanner;

public class Binary_positionv2 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println ("Please enter a binary number");
        String myBinary = input.nextLine();
        int binaryLength = myBinary.length(); 										

int binaryPosition =0;
        int binaryDigit =0;
        for (binaryPosition = (binaryLength-1); binaryPosition >=0; binaryPosition--){
            char bin = myBinary.charAt(binaryPosition);
                //char c = str.charAt(0)

                System.out.println(bin);
            int j = Character.getNumericValue(bin);
        }
    }
}