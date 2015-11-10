
import java.util.Scanner;

public class D5_X2c_TowersofHanoi { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Towers of Hanoi

        long z = 64;
        getHanoi(z);
        System.out.println("The number of moves for Towers of Hanoi n=" + z + " is");
        System.out.println(getHanoi(z));
    }

    private static long getHanoi(long n) {
        long result = 0;
        if (n == 1) {
            return 2;
        } else {
                    // n>=2

                    result = getHanoi(n-1) + 1 + getHanoi(n-1);
            return result;
        }
    }
}