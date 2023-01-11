import java.util.Scanner;
import java.util.Arrays;
public class plusminusseq{
    static boolean compare(char a, int x, int y){
        if(a == '-'){
            if(x > y)
                return true;
            else
                return false;
        }
        else{
            if(x < y)
                return true;
            else
                return false;
        }
    }

    static int count(int ind, char a, int n, int ans){
        if(ind == n-1){
            return ans;
        }
        
    }
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        int n = str.length();
        for(int i = 0; i <= n; i++){

        }
    }
}