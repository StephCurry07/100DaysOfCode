import java.util.Scanner;
import java.util.Arrays;
public class LC926{
    public static void main(String[] args) {
        String str;
        int flag1 = 0, flag2 = 0, c1 = 0, c2 = 0, incdec = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
                                                            // 00110       00111       00000
                                                            // 010110      011111      000000
                                                            // 00011000    00000000    00011111
        for(int i = 0; i < str.length(); i++){
            flag1 = 0; flag2 = 0;
            if(str.charAt(i) == '0'){
                flag1++;
            }
            
            if(str.charAt(i) == '1' && flag1 == 1){
                flag2++;
                // flag1 = 0;
            }
            if(flag1 == 1 && flag2 == 1){
                while(i != str.length()){
                    if(str.charAt(i) == '1'){
                        c1++;
                    }
                    else{
                        c2++;
                    }
                    i++;
                    System.out.println(c1);
                    System.out.println(c2);
                }
            }
        }
        System.out.println(c1 < c2 ? c1 : c2);
    }
}