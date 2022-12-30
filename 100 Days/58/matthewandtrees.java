import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class matthewandtrees{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int height = (int) Math.ceil(Math.log(n + 1));
        int size = 1;
        for(int i = 0; i < height; i++){
            int j = 0;
            ArrayList<Integer> sub = new ArrayList<>();
            while(j < size && (int)Math.pow(2,i) + j - 1 < n){
                if(arr[(int)Math.pow(2,i) + j - 1] != -1){
                    sub.add(arr[(int)Math.pow(2,i) + j - 1]);
                }
                j++;
            }
            size = size * 2;
            al.add(sub);
        }
        System.out.println(height);
        for (int i = 0; i < al.size();i++){
            for (int j = 0; j < al.get(i).size();j++){
                    System.out.print(al.get(i).get(j) + " ");
            }
            System.out.println();
        }
        
    }
}