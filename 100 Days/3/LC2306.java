import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class LC2306{
    public long distinctNames(String[] ideas){
        HashSet<String> parent = new HashSet<>();
        ArrayList<String> hs = new ArrayList<>();
        HashMap<Character, Integer> alone = new HashMap<Character, Integer>();
        for(String a : ideas){
            parent.add(a);
            if(!hs.contains(a.substring(1)))
                hs.add(a.substring(1));
            alone.put(a.charAt(0), alone.getOrDefault(a.charAt(0), 0) + 1);
        }

        System.out.println(alone);
            // if(head.length() == 1)
            // al.add(head);

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int k = 0; k < 26; k++){
            String check = alphabet[k] + hs.get(k);
            if(!hs.contains(check)){
                if(!parent.contains(check)){
                    parent.add(check);
                }
                else{
                    
                }
                    ans += 
            }   
        }
    }
}
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
    }
}