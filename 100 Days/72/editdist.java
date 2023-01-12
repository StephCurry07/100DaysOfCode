import java.util.Scanner;
import java.util.Arrays;
public class editdist{
    static String replace(String a, char b, char c){
        a = a.replace(b, c);
        return a;
    }
    static String delete(String a, int ind){
        a = a.substring(0,ind) + a.substring(ind);
        return a;
    }
    static String insert(String a, char b){
        a = a + b;
        return a;
    }
    public static void main(String[] args) {
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();
        String temp = "";
        if(str1.length() < str2.length()){
            temp = str1;
            str1 = str2;
            str2 = temp;
        }
        int count = 0;
        int n = str2.length();
        for(int i = 0; i < str2.length(); i++){
            if(str1.charAt(i) == str2.charAt(i))
                continue;
            else{
                if(str1.indexOf(str2.charAt(i) + "") < n - i)
                    while(str1.charAt(i) != str2.charAt(i)){
                        count++;
                        delete(str1, i);
                    }
            }
            if(str1.charAt(i) != str2.charAt(i)){
                count++;
                replace(str1, str1.charAt(i), str2.charAt(i));
            }
        }
        System.out.println(count);
    }
}