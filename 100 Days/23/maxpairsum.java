import java.util.Scanner;
import java.util.Arrays;
public class maxpairsum{
   public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[1];
        int max = arr[0];
        int checkmin = arr[n-2];
        int checkmax = arr[n-1];
        if((max * min + Math.abs(max - min)) > (checkmax * checkmin + Math.abs(checkmax - checkmin))){
            System.out.println(max * min + Math.abs(max - min));
        }
        else{
            System.out.println(checkmax * checkmin + Math.abs(checkmax - checkmin));
        }
    }
}