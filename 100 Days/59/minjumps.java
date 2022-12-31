import java.util.Scanner;
import java.util.Arrays;
public class minjumps{
    private static int minJumps(int[] arr, int n){
        // jumps[n-1] will hold the
        int jumps[] = new int[n];
        // result
        int i, j;
 
        // if first element is 0,
        if (n == 0 || arr[0] == 0)
            return Integer.MAX_VALUE;
        // end cannot be reached
 
        jumps[0] = 0;
 
        // Find the minimum number of jumps to reach arr[i]
        // from arr[0], and assign this value to jumps[i]
        for (i = 1; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (j = 0; j < i; j++) {
                if (i <= j + arr[j]
                    && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i]
                        = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }
        return jumps[n - 1];
    }
    static void optimalans(int[] arr, int n){
        int pos = 0, des = 0,jump = 0;
        for(int i = 0; i < n - 1; i++){
            des = Math.max(des,arr[i] + i);
            if(pos == i){
                pos = des;
                jump++;
            }
        }
        System.out.print(jump);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minJumps(arr,arr.length));
        optimalans(arr, n);
    }
}