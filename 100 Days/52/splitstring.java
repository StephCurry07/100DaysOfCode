import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class splitstring{
    static boolean countDistinct(String a, String b){
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<Character> hs2 = new HashSet<>();
        for(char x: a.toCharArray()){
            hs1.add(x);
        }
        for(char x: b.toCharArray()){
            hs2.add(x);
        }
        if(hs1.size() == hs2.size()){
            return true;
        }
        return false;
    }
    static boolean goodSplit(String s, int split){
        String left = s.substring(0, split);
        String right = s.substring(split);
        System.out.print(left + " ");
        System.out.println(right);
        if(countDistinct(left,right)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        int ans = 0;
        int n = str.length();
        int[] pre = new int[n];
        int[] suff = new int[n];
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();

        for(int i = 0; i < n; i++){
            s1.add(str.charAt(i));
            pre[i] = s1.size();
            s2.add(str.charAt(n-i-1));
            suff[n-i-1] = s2.size(); 
        }
        for(int i = 1; i < n; i++){
            if(pre[i-1] == suff[i])
                ans++;
        }
        System.out.print(ans);
    }
}