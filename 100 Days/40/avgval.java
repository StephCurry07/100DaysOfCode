public class avgval{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        int max = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
            sum += arr[i];
        }
        NumberFormat numberFormat= NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(5);                           //prints according to the standard format: 1,000,000
        sum = sum - max - min;
        System.out.print(numberFormat.format((double)sum/(n-2)));

        System.out.printf("%.5f",(double)sum/(n-2));                //prints upto the given decimal places

        System.out.print(String.format("%.5f",(double)sum/(n-2)));  //Using String
    }
}