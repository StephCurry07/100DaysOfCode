import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class shortestpath{
    static ArrayList<Integer> al = new ArrayList<>();
    static void travelMat(int[][] mat, int i, int j, int m, int n, int path_sum, List<Integer> al){
        if(i >= m || j >= n){
            return;
        }
        path_sum += mat[i][j];
        if(i == m-1 && j == n-1)         
            al.add(path_sum);
        travelMat(mat, i+1, j, m, n, path_sum, al);
        travelMat(mat,i, j+1, m, n, path_sum, al);
    }
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
        // ArrayList<Integer> al = new ArrayList<>();
        travelMat(arr, 0, 0, n, m, 0, al);
        System.out.println(Collections.min(al));
        
    }
}