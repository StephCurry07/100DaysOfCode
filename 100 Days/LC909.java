import java.util.Scanner;
import java.util.Arrays;
public class LC909{
    static int snakesAndLadders(int[][] board) {
        
    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(snakesAndLadders(arr));
    }
}