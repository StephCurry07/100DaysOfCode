import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class possiblewords{
    static void solve(String digits, int n){
        char[] alpha = new char[26];
        for(int i = 0; i < 26; i++){
            alpha[i] = (char)('a' + i);
        }
        String set = String.valueOf(alpha);
        HashMap<Integer, String> hm = new HashMap<>();
        for(int i = 2; i < 10; i++){
            if(i < 7)
                hm.put(i, set.substring((i-2)*3,(i-2)*3 + 3));
            else{
                if(i == 7)
                    hm.put(i, "pqrs");
                if(i == 8)
                    hm.put(i, set.substring((i-2)*3 + 1,(i-2)*3 + 4));
                if(i == 9){
                    hm.put(i, set.substring(22));
                }
            }
        }
        String[] arr = new String[n];
        for (int i = 0; i < n; i++){
            arr[i] = hm.get(Integer.parseInt(digits.charAt(i) + ""));
        }
        // System.out.println(Arrays.toString(arr));
        if(n==1){
            System.out.println("" + arr[0] + arr[1] + arr[2]);
        }
        if(n==2){
            for(int k = 0; k < arr[0].length(); k++){
                for(int l = 0; l < arr[1].length(); l++){
                    System.out.print("" + arr[0].charAt(k) + arr[1].charAt(l) +" ");
                }
            }
        }
        if(n==3){
            for(int j = 0; j < arr[0].length(); j++){
                for(int k = 0; k < arr[1].length(); k++){
                    for(int l = 0; l < arr[2].length(); l++){
                        System.out.print("" + arr[0].charAt(j) + arr[1].charAt(k) + arr[2].charAt(l) +" ");
                    }
                }
            }
        }
        if(n==4){
            for(int j = 0; j < arr[0].length(); j++){
                for(int k = 0; k < arr[1].length(); k++){
                    for(int l = 0; l < arr[2].length(); l++){
                        for(int m = 0; m < arr[2].length(); m++){
                            System.out.print("" + arr[0].charAt(j) + arr[1].charAt(k) + arr[2].charAt(l) + arr[3].charAt(m) + " ");
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        int n = str.length();
        solve(str, n);
    }
}