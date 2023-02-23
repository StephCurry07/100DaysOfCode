import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class sumofdiffbits {
    static int compute(String x, String y){
        int ans = 0;
            for(int i = 0; i < x.length(); i++){
                ans += Integer.parseInt(x.charAt(i)+"")^Integer.parseInt(y.charAt(i)+"");
                // System.out.println(x);
                // System.out.println(y);
                // System.out.println(ans);
            }
        return ans;
    }
    static void finddistance(String a, String b, int ind, int len, int ans){
        if(b.length() < len){
            System.out.println(0);
            return;
        }
        if(ind <= b.length() - len){
            String c = b.substring(ind,ind+len);
            ans += compute(a,c);
            finddistance(a,b,ind+1,len,ans);
        }
        if(ind == b.length() - len)
            System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        finddistance(a,b,0,a.length(),0);
        // System.out.println(ans);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}