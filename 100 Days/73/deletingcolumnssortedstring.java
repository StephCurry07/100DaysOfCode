import java.util.Scanner;
import java.util.Arrays;
public class deletingcolumnssortedstring{
    static int n;
    static boolean checklexico(String[] a){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            boolean[] lexico = new boolean[n];
            Arrays.fill(lexico, true);
            arr[i] = sc.next();
        }
    }
}