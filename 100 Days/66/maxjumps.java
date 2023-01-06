import java.util.*;

class maxjumps {
    static int maxJumps(int[] arr, int d) {
        int[] maxJumpsFromHere = new int[arr.length];
        int maxJumps = 0;

        for (int i=0; i<arr.length; i++) {
            maxJumps = Math.max(maxJumps, calMaxJumps(i, maxJumpsFromHere, arr, d));
        }
        return maxJumps;
    }

    static int calMaxJumps(int i, int[] maxJumpsFromHere, int[] arr, int d) {
        if (maxJumpsFromHere[i] != 0)
            return maxJumpsFromHere[i];
        int maxJumpsCount = 0;
        for (int x = i+1; x <= (i+d) && x < arr.length; x++) {
            if (arr[x] >= arr[i])
                break;
            maxJumpsCount = Math.max(maxJumpsCount, calMaxJumps(x, maxJumpsFromHere, arr, d));
        }
        for (int x = i-1; x >= (i-d) && x >= 0; x--) {
            if (arr[x] >= arr[i])
                break;
            maxJumpsCount = Math.max(maxJumpsCount, calMaxJumps(x, maxJumpsFromHere, arr, d));
        }
        maxJumpsFromHere[i] = 1 + maxJumpsCount;
        return maxJumpsFromHere[i];
    }
    public static void main(String[] args) {
        int n, d;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(maxJumps(arr, d));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}