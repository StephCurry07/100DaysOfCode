import java.util.Scanner;
import java.util.Arrays;
public class paint3Ngrid{
    static void waysToPaint(int n){
 
        // Count of ways to pain a
        // row with same colored ends
        long same = 6;
 
        // Count of ways to pain a row
        // with different colored ends
        long diff = 6;
        long mod = 1000000007;
        // Traverse up to (N - 1)th row
        for (int i = 0; i < n - 1; i++) {
 
            // Calculate the count of ways
            // to paint the current row
 
            // For same colored ends
            long sameTmp = (3 * same + 2 * diff) % mod;
 
            // For different colored ends
            long diffTmp = 2 * same + 2 * diff;
 
            same = sameTmp;
            diff = diffTmp % mod;
        }
 
        // Print the total number of ways
        long ans = same + diff;
        long res = ans% mod;
        System.out.println((int)res);
    }
 
    // Dri
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        waysToPaint(n);
    }
}