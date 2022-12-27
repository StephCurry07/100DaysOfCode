import java.util.Scanner;

public class primeslessthann{
    static boolean isPrime(int n){
        int flag = 0;
        if(n == 2)
            return true;
        for(int i = 2; i < n/2; i++){
            if(n%i == 0){
                flag = 1;
                return false;
            }
        }
        if(flag == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 2; i <= n; i++){
            if(isPrime(i))
                count++;
        }
        System.out.println(count);
    }
}