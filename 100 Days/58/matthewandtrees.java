import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Tree {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(Node node, int value, int loc) {
        if(loc%2 == 0)
            node.left = new Node(value);
        else
            node.right = new Node(value);
    }
}

public class matthewandtrees{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int height = (int) Math.ceil(Math.log(n + 1));
        
    }
}