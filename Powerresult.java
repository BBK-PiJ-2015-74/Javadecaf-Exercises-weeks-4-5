
import java.util.Scanner;

public class Powerresult { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int base = 0;
        int exponent = 0;
        System.out.println("please enter base");
        base = input.nextInt();
        System.out.println(base);
        System.out.println("please enter exponent");
        exponent = input.nextInt();
        System.out.println(exponent);
        int powerresult = 1;
        int j=0;
        for (j=0; j<exponent; j++) {
            powerresult = (powerresult * base);
            System.out.println(powerresult);
        }
    }
}