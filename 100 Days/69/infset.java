import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
public class infset{
    public static void main(String[] args) {
        int n, p;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> check = new HashSet<>();
        int lim = (int)Math.pow(2,p);
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] < lim){
                al.add(arr[i]);
                check.add(arr[i]);
            }
        }
        for (int i = 0; i < al.size(); i++){
                if(al.get(i) < lim && !check.contains(al.get(i))){
                    al.add(i);
                    if(2*al.get(i) + 1 < lim){
                        al.add(i);
                        count++;
                        if(4*al.get(i) < lim){
                            al.add(i);
                            count++;
                        }
                    }
                }
                if(al.get(i) >=lim){
                    break;
                }
            }
        System.out.println(al.size());
    }
}