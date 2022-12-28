import java.util.Scanner;

class NumMatrix{
    int[][] mat;
    public NumMatrix(int[][] arr) {
        mat = arr;
    }
    int sumRegion(int a, int b, int c, int d){
        int sum = 0;
        for(int i = a; i <= c; i++){
            for(int j = b; j <= d; j++){
                sum += mat[i][j];
            }
        }
        return sum;
    }
}
public class matsubquer{
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        NumMatrix nm = new NumMatrix(arr);
        int q = sc.nextInt();
        while(q-- != 0){
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            System.out.println(nm.sumRegion(r1, c1, r2, c2));
        }
    }
}