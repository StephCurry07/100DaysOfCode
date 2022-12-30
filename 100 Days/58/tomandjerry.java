import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class tomandjerry{
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[k]);
    }
}