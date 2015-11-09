
import java.util.Scanner;

public class X08_stringalong { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            // Now modify your program to write each word (as defined by spaces) rather than letter on a different line.

            System.out.println("Please enter a sentence of text");
        String str = input.nextLine();
        int j = str.length();
        //define an integer j where j is the length of the string

        int i;
        for (i = 0; i<j; i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}