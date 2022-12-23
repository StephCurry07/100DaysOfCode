import java.util.Scanner;

public class collectingapples{
    public static void main(String[] args) {
        int n, cap;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        cap = sc.nextInt();
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int curr = 0;
        int steps = 0;
        for(int i = 0; i < n; i++){
            if(sum + arr[i+1] > cap){
                sum = 0;
                steps += 2*i - 1;
            }
                steps++;
                sum += arr[i+1];
            
        }
        System.out.print(steps);
    }
}