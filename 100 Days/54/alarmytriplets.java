import java.util.Scanner;

public class alarmytriplets{
    public static void main(String[] args) {                        //T - O(n), S - O(1)
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int low = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < low){
                low = arr[i];
            }
            else if(arr[i] > low && arr[i] < mid){
                mid = arr[i];
            }
            else{
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}