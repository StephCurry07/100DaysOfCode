import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class palindromegame {

    static boolean check(List<Character> lst) {
        for (int i = 0; i < lst.size() / 2; i++) {
            if (lst.get(i) != lst.get(lst.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static int leftfirst(List<Character> x) {
        int ans = 0;
        int k = 0;
        int high;
        for (int low = 0; low < x.size() / 2; low++) {
            high = x.size() - low - 1;
            if (x.get(low) != x.get(high)) {
                // System.out.println(x);
                if (k % 2 == 0) {
                    x.add(x.size() - low, x.get(low));
                } else {
                    x.add(low, x.get(high));
                }
                ans++;
                k++;
                low++;
            }
            if (check(x) == true)
                break;
        }
        return ans;
    }

    static int rightfirst(List<Character> y) {
        int ans = 0;
        int k = 0;
        int high;
        for (int low = 0; low < y.size() / 2; low++) {
            high = y.size() - low - 1;
            if (y.get(low) != y.get(high)) {
                if (k % 2 == 0) {
                    y.add(low, y.get(high));
                } else {
                    y.add(y.size() - low, y.get(low));
                }
                System.out.println(y);
                ans++;
                k++;
                low++;
            }
            if (check(y) == true)
                break;
        }
        return ans;
    }

    static int findMinInsertions(List<Character> str, int l, int h) {
        // Base Cases
        if (l > h)
            return Integer.MAX_VALUE;
        if (l == h)
            return 0;
        if (l == h - 1)
            return (str.get(l) == str.get(h)) ? 0 : 1;

        // Check if the first and last characters
        // are same. On the basis of the comparison
        // result, decide which subproblem(s) to call
        if (str.get(l) == str.get(h))
            return findMinInsertions(str, l + 1, h - 1);
        else
            return Integer.min(findMinInsertions(str, l, h - 1), findMinInsertions(str, l + 1, h)) + 1;
    }

    static int findMinInsertionsDP(List<Character> str, int n) {
        // Create a table of size n*n. table[i][j]
        // will store minimum number of insertions
        // needed to convert str[i..j] to a palindrome.
        int table[][] = new int[n][n];
        int l, h, gap;

        // Fill the table
        for (gap = 1; gap < n; ++gap)
            for (l = 0, h = gap; h < n; ++l, ++h)
                table[l][h] = (str.get(l) == str.get(h)) ? table[l + 1][h - 1]
                        : (Integer.min(table[l][h - 1],
                                table[l + 1][h]) + 1);

        // Return minimum number of insertions
        // for str[0..n-1]
        return table[0][n - 1];
    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        List<Character> al = new ArrayList<>();
        List<Character> bl = new ArrayList<>();
        for (char a : str.toCharArray()) {
            al.add(a);
            bl.add(a);
        }
        int n = str.length();
        int a = leftfirst(al);
        int b = rightfirst(bl);
        System.out.println(a < b ? a : b);
        System.out.println(findMinInsertions(bl, 0, bl.size() - 1));
        System.out.println(findMinInsertionsDP(al, n));
    }
}
