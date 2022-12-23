import java.util.HashMap;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.print.attribute.HashAttributeSet;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class concattarget{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String target;
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        target = sc.next();
        int count = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            int len = arr[i].length();
            if(len >= target.length()){
                continue;
            }
            if(target.substring(0, len).equals(arr[i])){
                count += hm.getOrDefault(target.substring(len), 0);
            }
            if(target.substring(target.length()-len).equals(arr[i])){
                count += hm.getOrDefault(target.substring(0,target.length() - len), 0);
            }
            hm.merge(arr[i],1,Integer::sum);
        }
        System.out.println(count);
    }
}