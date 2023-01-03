import java.util.Scanner;

public class filo{
    public static int primeFactors(int n){
        int count = 0;
        for(int i = 3;; i++){
            if(i*(i + 1)/2 > n){
                break;
            }
            if(n%2==0){
                int mid = n/i;
                int temp = i/2;
                int sum = 0;
                if(i%2==0){
                    sum = mid*i + temp;
                }
                else
                    sum = mid*i;
                if(sum == n)
                    count++;
            }
            else{
                if(n%i == 0){
            // System.out.print(i + " ");
                    count++;
                }
            }
        // Print the number of 2s that divide n
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        // for (int i = 3; i < n; i++){
        //     // While i divides n, print i and divide n
        //     while (n%i == 0){
        //         // System.out.print(i + " ");
        //         n /= i;
        //         count++;
        //     }
        // }
 
        // This condition is to handle the case when
        // n is a prime number greater than 2
        }
        if(n % 2 == 0)
            return count + 1;
        else
            return count + 2;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(primeFactors(n));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}