import java.util.HashMap;
import java.util.Scanner;

public class findandreplace{
    static boolean map(String a, String b){
        HashMap<Character, Character> hm = new HashMap<>();
        for(int i = 0; i < a.length(); i++){
            if(hm.containsKey(a.charAt(i))){
                if(b.charAt(i) == hm.get(a.charAt(i))){
                    continue;
                }
                else{
                    return false;
                }
            }
            else
                hm.put(a.charAt(i),b.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        int n, i = 0,count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String[] str = new String[n];
        while(i != n)
            str[i++] = sc.next();
        String pattern = sc.next();
        String[] ans = new String[n];
        
        for(int j = 0; j < str.length; j++){
            if(map(str[j], pattern) == true){
                ans[count++] = str[j];
            }
        }
        System.out.println(count);
        for(int l = 0; l < ans.length; l++){
            System.out.println(ans[l] + " ");
        }
    }
}