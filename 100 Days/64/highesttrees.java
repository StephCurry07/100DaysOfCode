import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class highesttrees{
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n+1];
        List<Integer> heights = new ArrayList<>();
        int i = 0;
        while(i < k){
            arr[i] = sc.nextInt();
            heights.add(arr[i++]);
        }
        System.out.print(Collections.max(heights));
        for(i = k; i < n; i++){
            arr[i] = sc.nextInt();
            heights.add(arr[i]);
            heights.remove(0);
            System.out.print(" " + Collections.max(heights));
            // System.out.println(heights);
        }
        // for(int i = 0; i < n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int i = 0; i <= n-k; i++){
        //     int j = 0;
        //     heights.clear();
        //     while(j!=k){
        //         heights.add(arr[i + j]);
        //         j++;
        //     }
        //     System.out.print(Collections.max(heights) + " ");
        // }
    }
}