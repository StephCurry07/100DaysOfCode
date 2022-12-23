import java.util.Scanner;

public class canteen{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] stu = new int[n];
        int[] sand = new int[n];
        for(int i = 0; i < n; i++){
            stu[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            sand[i] = sc.nextInt();
        }
    }
}