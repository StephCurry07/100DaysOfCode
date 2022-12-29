import java.util.Scanner;
import java.util.HashSet;

public class happynum {
    static int sumDigitSquare(int n) {
        int sq = 0;
        while (n > 0) {
            int digit = n % 10;
            sq += digit * digit;
            n = n / 10;
        }
        return sq;
    }

    // Returns true if n is Happy number
    // else returns false.
    static boolean isHappy1(int n) {
        // A set to store numbers during
        // repeated square sum process
        HashSet<Integer> s = new HashSet<Integer>();
        s.add(n);

        // Keep replacing n with sum of
        // squares of digits until we either
        // reach 1 or we endup in a cycle
        while (true) {

            // Number is Happy if we reach 1
            if (n == 1)
                return true;

            // Replace n with sum of squares
            // of digits
            n = sumDigitSquare(n);

            // If n is already visited, a cycle
            // is formed, means not Happy

            if ((s.contains(n) && n != (int) s.toArray()[s.size() - 1]))
                return false;

            // Mark n as visited
            s.add(n);
        }
    }

    static boolean isHappy2(int n) {
        // Keep replacing n with
        // sum of squares of digits
        // until we either reach 1
        // or we end up in a cycle
        while (true) {

            // Number is Happy if
            // we reach 1
            if (n == 1)
                return true;

            // Replace n with sum
            // of squares of digits
            n = sumDigitSquare(n);

            // Number is not Happy
            // if we reach 4
            if (n == 4)
                return false;
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(isHappy1(n));
        System.out.println(isHappy2(n));
    }
}