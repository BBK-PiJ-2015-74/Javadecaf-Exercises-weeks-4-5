
import java.util.Scanner;

public class D5_X2b_fibonacci { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // F(6) = 1, 1, 2, 3, 5, 8

        int z = 6;
        getFibI(z);
        System.out.println("The iterative Fibonacci sequence for n=" + z + " is");
        System.out.println(getFibI(z));
        getFibR(z);
        System.out.println("The recursive Fibonacci sequence for n=" + z + " is");
        System.out.println(getFibR(z));
    }

    private static int getFibI(int n) {
        int result = 0;
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }  
	int last = 1;
        int next_to_last = 1;
        for (int k=3; k<=n; k++) {	
			result = last + next_to_last; 
			next_to_last = last;		
			last = result;
        }
        return result;
    }

    private static int getFibR(int n) {
        int result = 0;
        if ((n == 1) || (n == 2)) {
            result = 1;
        } 
	if (n >= 3) {
            result = getFibR(n-1) + getFibR(n-2);
        }
        return result;
    }
}