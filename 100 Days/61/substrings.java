import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class substrings{
    // HashSet<String> hs = new HashSet<>();
    static HashMap<String, Integer> hm = new LinkedHashMap<>();
    static void find(String str, int i){
        // for(int i = 0; i < str.length() - 10; i++){
            if(i == str.length() - 10)
                return;
            String sub = str.substring(i,i+10);
            if(hm.containsKey(sub)){
                hm.put(sub, hm.get(sub) + 1);
            }
            else{
                hm.put(sub,0);
            }
        find(str,i+1);
        // for(Map.Entry<String, Integer> entry : hm.entrySet()){
        //     if(entry.getValue() > 1){
        //         System.out.print(entry.getKey() + " ");
        //     }
        // }
    }
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        find(str, 0);
        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            if(entry.getValue() > 1){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}