import java.util.Scanner;

public class subarraysum{
    static int findSubarraySum(int arr[], int n, int sum){
        HashMap<Integer, Integer> prevSum = new HashMap<>();
        prevSum.put(0,1);
        int res = 0;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            int removeSum=currSum-sum;
            if (prevSum.containsKey(removeSum))
                res += prevSum.get(removeSum);
            prevSum.put(currSum,prevSum.getOrDefault(currSum,0)+1);
        }
        return res;
    }
    public static void main(String[] args) {
        int n, target;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        target = sc.nextInt();
        int count;
        count = findSubarraySum(arr, n, target);
        System.out.print(count);
    }
}