import java.util.Scanner;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.util.Arrays;
public class updatMat{
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        int q = sc.nextInt();
        int[][] queries = new int[q][2];
        for(int i = 0; i < q; i++){
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }
        
    }
}