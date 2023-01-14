import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class smallestEqString{
        static private int[] p;
        static private int find(int x) {
            if (p[x] != x) {
                p[x] = find(p[x]);
            }
            return p[x];
        }
        public static String smallestEquivalentString(String s1, String s2, String baseStr) {
            p = new int[26];
            for (int i = 0; i < 26; ++i) {
                p[i] = i;
            }
            for (int i = 0; i < s1.length(); ++i) {
                int a = s1.charAt(i) - 'a', b = s2.charAt(i) - 'a';
                int pa = find(a), pb = find(b);
                if (pa < pb) {
                    p[pb] = pa;
                } else {
                    p[pa] = pb;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char a : baseStr.toCharArray()) {
                char b = (char) (find(a - 'a') + 'a');
                sb.append(b);
            }
            return sb.toString();
        }
    static String smallestEquivalentString(String s1, String s2, String baseStr, HashMap<Character, Character> hm, HashMap<Character, Character> newhm) {
        for(int i = 0; i < s1.length(); i++){
            hm.put(s1.charAt(i), s2.charAt(i)); 
        }
        for(int i = 0; i < s2.length(); i++){
            hm.put(s2.charAt(i), s1.charAt(i)); 
        }
        System.out.println(hm);
        Iterator<Character> it = hm.keySet().iterator();       //keyset is a method  
        while(it.hasNext()){  
            char key = (char)it.next();  
            if(key < hm.get(key)){
                char a = key;
                char b = hm.get(key);
                newhm.put(b, a);
            }
        }
        // for(Map.Entry<Character, Character> entry : hm.entrySet()){
        //     if(entry.getValue() > entry.getKey()){
        //         // char a = entry.getValue();
        //         hm.put(entry.getValue(), entry.getKey());
        //         hm.remove(entry.getKey());
        //     }
        // }
        for(int i = 0; i < s1.length(); i++){
            if(hm.containsKey(s1.charAt(i))){
                if(hm.get(s1.charAt(i)) > s1.charAt(i))
                    hm.put(s1.charAt(i), s1.charAt(i));
            }
            else{
                hm.put(s1.charAt(i), s1.charAt(i));
            }
            if(hm.containsKey(s2.charAt(i))){
                if(hm.get(s2.charAt(i)) > s2.charAt(i))
                    hm.put(s2.charAt(i), s2.charAt(i));
            }
            else{
                hm.put(s1.charAt(i), s1.charAt(i));
            }
        }
        System.out.println(newhm);
            String ans = "";
            for(int i = 0; i < baseStr.length(); i++){
                ans = ans + hm.get(baseStr.charAt(i));
            }
            return ans;
        }
        public static void main(String[] args) {
            String str;
            Scanner sc = new Scanner(System.in);
            str = sc.next();
            String s1, s2;
            s1 = sc.next();
            s2 = sc.next();
            HashMap<Character, Character> hm = new HashMap<>();
            HashMap<Character, Character> newhm = new HashMap<>();
            System.out.println(smallestEquivalentString(s1,s2,str,hm,newhm));
    }
}