import java.util.*;

class Solution {
    static int findPosition(int n, int f, int b){
        return n - Math.max(f + 1, n - b) + 1;
    }
 
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int even_cnt = 0;
        int odd_cnt = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                even_cnt++;
            } else {
                odd_cnt++;
            }
        }
        System.out.print(Math.min(odd_cnt, even_cnt));
        // if(n%2 != 0)
        //     System.out.println((int)Math.ceil((double)n/2) - 1);
        // else
        //     System.out.println(n/2);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}