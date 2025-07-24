
package fibonacci.sequence.stored.in.array;
import java.util.Scanner;
/**
 *
 * @author Imran Shihan
 */
public class FibonacciSequenceStoredInArray {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = input.nextInt();
        
        int[] fib = new int[n];
        if(n > 0) fib[0] = 0;
        if(n > 1) fib[1] = 1;
        
        for(int i = 2; i < n; i++)
        {
            fib[i]  = fib[i - 1] + fib[i - 2];
        }
        System.out.println("First " +n + " Fibonacci numbers: ");
        for(int num : fib)
        {
            System.out.print(num+" ");
        }
    }
    
}
