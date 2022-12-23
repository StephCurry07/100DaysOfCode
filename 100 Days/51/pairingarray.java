import java.util.Scanner;

public class pairingarray{
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
}