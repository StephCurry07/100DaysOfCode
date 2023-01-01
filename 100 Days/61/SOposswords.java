import java.util.Scanner;
import java.util.Arrays;
public class SOposswords{

public static void main(String[ ] args) {
    String[] arr  = {};

    int[] path = new int[arr.length];
    do {
        System.out.print(getValue(arr, path));
        System.out.print(" ");
    } while(traverseDepthFirst(arr, path));
}

public static char[] getValue(String[] arr, int[] path) {
    char[] c = new char[arr.length];
    for(int depth=0; depth<arr.length; depth++) {
        c[depth] = arr[depth].charAt(path[depth]);
    }
    return c;
}

public static boolean traverseDepthFirst(String[] arr, int[] path) {
    for (int depth = arr.length - 1; depth >= 0; depth--) {
        if (path[depth] < arr[depth].length() - 1) {
            path[depth]++;
            return true;
        } else {
            path[depth] = 0;
        }
    }
    return false;
}
}