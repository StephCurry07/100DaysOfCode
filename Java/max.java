import java.util.Arrays;
public class max {
    public static void main(String[] args){
        int arr[] = {10, 324, 45, 90, 9808};
        int max = Arrays.stream(arr).max().getAsInt();
        // int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Largest in given array is " + max);
    }
}