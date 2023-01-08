import java.util.Scanner;
import java.util.Arrays;

public class badgroup{
    static boolean isEven(int[] arr){
        int a = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                return true;
            }
            if(arr[i]%2 != 0 && arr[i] % a != 0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int flag = 0;
        if(isEven(arr)){
            System.out.println(true);
            return;
        }
        int a = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(a%arr[i] == 0 || arr[i]%a == 0){
                continue;
            }
            else{
                System.out.print(true);
                return;
            }
        }
        System.out.print(false);
    }
}