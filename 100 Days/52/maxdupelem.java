import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maxdupelem{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            hm.getOrDefault(arr[i], 0);
            hm.merge(arr[i], 1, Integer::sum);
        }
        int max = Collections.max(hm.values());
        for (Map.Entry<Integer, Integer>entry : hm.entrySet()) {
 
            if (entry.getValue() == max) {
 
                // Print the key with max value
                System.out.println(entry.getKey());
            }
        }
    }
}