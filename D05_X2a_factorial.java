
import java.util.Scanner;

public class D5_X2a_recursion { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // n! = n \u00d7 (n \u2212 1) \u00d7 (n \u2212 2) \u00d7 . . . \u00d7 2 \u00d7 1 e.g. 4! = 4 * 3 * 2 * 1 = 24

        int z = 10;
        getFactorialI(z);
        System.out.println(getFactorialI(z));
        getFactorialR(z);
        System.out.println(getFactorialR(z));
    }

    private static int getFactorialI(int n) {
        int k = 0;
        int result = 1;
        for (k=0; (n-k)>=1; k++) {
            result = result*(n-k);
        }
        return result;
    }

    private static int getFactorialR(int n) { 
	if(n == 1){
            return 1;
        } else {
            int result = n * getFactorialR(n-1);
            return result;
        }
    }
}