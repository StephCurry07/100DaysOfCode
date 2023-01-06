import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
class Node {
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}
 
public class pretoleveldashes {
    private static Node node;
 
    // This will create the BST
    public static Node createNode(Node node, int data)
    {
        if (node == null)
            node = new Node(data);
 
        if (node.data > data)
            node.left = createNode(node.left, data);
        if (node.data < data)
            node.right = createNode(node.right, data);
 
        return node;
    }
 
    // A wrapper function of createNode
    public static void create(int data)
    {
        node = createNode(node, data);
    }
    // A function to print BST in inorder
    public static void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data);
              System.out.print(" ");
            inorderRec(root.right);
        }
    }
    static int[] remzero(int[] arr){
        int targetIndex = 0;
        for( int sourceIndex = 0;  sourceIndex < arr.length;  sourceIndex++ )
        {
            if( arr[sourceIndex] != 0 )
                arr[targetIndex++] = arr[sourceIndex];
        }
        int[] newArray = new int[targetIndex];
        System.arraycopy(arr, 0, newArray, 0, targetIndex );
        return newArray;
    }
    // Driver Code
    public static void main(String[] args)
    {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        int[] arr = new int[str.length()];
        int k = 0, flag = 0, num = 0;
        str.replaceAll("-+", str);
        
        for(int i = 0; i < str.length(); i++){
            System.out.println(arr[i] + " ");
        }
            
        }
        int[] new_arr = remzero(arr);
        for (int i = 0; i < new_arr.length; i++) {
            create(new_arr[i]);
        }
        inorderRec(node);
    }
}
