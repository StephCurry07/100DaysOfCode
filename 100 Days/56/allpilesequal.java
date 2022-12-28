import java.util.Arrays;
import java.util.Scanner;

public class allpilesequal{
    static long avg(long[] arr){
        long ans = 0;
        for(long i = 0; i < arr.length; i++){
            ans += arr[(int) i];
        }
        return ans/arr.length;
    }
    public static void main(String[] args) {
        long n, ans = 0;
        Scanner sc = new Scanner(System.in);
        n = Long.parseLong(sc.next());
        long[] arr = new long[(int) n];
        Arrays.setAll(arr, i -> 2*i + 1);
        long avg = avg(arr);
        for(int i = (int) (n/2); i < n; i++)
            if(arr[i] > avg){
                ans += arr[i] - avg;
            }
        System.out.println(ans);
    }
}