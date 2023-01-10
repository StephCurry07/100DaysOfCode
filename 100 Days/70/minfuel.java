import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
class pair{
    private int x,y;
    pair(int a, int b){
        this.x = a;
        this.y = b;
    }
}
public class minfuel{
    public static void main(String[] args) {
        int n;
        int x, y;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<pair> al = new ArrayList<>();
        int min = 0, diff = 0, mindiff = Integer.MAX_VALUE;
        while(n-- != 0){
            x = sc.nextInt();
            y = sc.nextInt();
            pair p = new pair(x,y);
            al.add(p);
            diff = y - x;
            if(diff < mindiff)
                mindiff = diff;
            min += x;
        }
        System.out.println(min + diff);
    }
}