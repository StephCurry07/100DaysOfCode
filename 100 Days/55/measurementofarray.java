import java.util.Scanner;

public class measurementofarray{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            al.add(sc.nextInt());
        }
        int sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            int last;
            int curr_elem = al.get(i);
            if(hm.containsKey(curr_elem)){
                last = hm.get(curr_elem);
            }
            else{
                last = al.lastIndexOf(curr_elem);
                hm.put(curr_elem,last);
            }
            sum += i + last;
        }
        System.out.print(sum%(Math.pow(10,9) + 7));
    }
}