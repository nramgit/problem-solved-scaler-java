package hack.challenge;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInterval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        
        /* Save interval endpoint's "k" values in array */
        long [] array = new long[N + 1];
        while (M-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int k = scan.nextInt();
            array[a-1] += k;
            array[b]   -= k;
        }
        scan.close();
        for(long p:array)
        	System.out.print(p+" ");
        /* Find max value */
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            sum += array[i];
            System.out.println("\nmax"+max+"/"+sum);
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
    }
}