public class subarray_xor{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2 == 0){
            System.out.println(0);
            System.exit(0);
        }
        int[] arr = new int[n];
        int xor = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(i%2 == 0){
                xor = xor ^ arr[i];
            }
        }
        System.out.println(xor);
    }
}