import java.util.Scanner;
import java.util.Arrays;
public class boltandthunder{
    static int sqnum(int a){
        for(int i = 1;;i++){
            if(i * i <= a)
                continue;
            else
                return i - 1;
        }
    }
    public static boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            if (dp[i]) {
                continue;
            }
            for (int k = 1; i + k * k <= n; k++) {
                dp[i + k * k] = true;
            }
        }
        return dp[n];
    }
    
    static boolean Legendresthreesquaretheorem(int n) {   //any positive integer can be represented as the sum of three squares if and only                                                    if it is not of the form 4^a(8b+7) where a and b are non-negative integers.
        return (n % 4 != 0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int count = 0;
        // while(n>0){
        //     n = n - sqnum(n);
        //     count++;
        // }
        // if(count%2 == 1)
        //     System.out.println(true);
        // else
            // System.out.println(false);
        System.out.println(Legendresthreesquaretheorem(n));
    }
}