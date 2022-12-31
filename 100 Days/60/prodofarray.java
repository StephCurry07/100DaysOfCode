import java.util.Arrays;
import java.util.Scanner;
class prodofarray {
	/* Function to print product array
	for a given array arr[] of size n */
	static void productArray(int arr[], int n){
		// Base case
		if (n == 1) {
			System.out.print(0);
			return;
		}
		// Initialize memory to all arrays
		int left[] = new int[n];
		int right[] = new int[n];
		int prod[] = new int[n];

		int i, j;

		/* Left most element of left array
is always 1 */
		left[0] = 1;

		/* Right most element of right
array is always 1 */
		right[n - 1] = 1;

		/* Construct the left array */
		for (i = 1; i < n; i++)
			left[i] = arr[i - 1] * left[i - 1];

		/* Construct the right array */
		for (j = n - 2; j >= 0; j--)
			right[j] = arr[j + 1] * right[j + 1];

		/* Construct the product array using
		left[] and right[] */
		for (i = 0; i < n; i++)
			prod[i] = left[i] * right[i];

		/* print the constructed prod array */
		for (i = 0; i < n; i++)
			System.out.println(prod[i]);

		return;
	}
    static void productsinglearray(int arr[], int n){
        // Base case
        if (n == 1) {
            System.out.print("0");
            return;
        }
 
        int i, temp = 1;
 
        /* Allocate memory for the product array */
        int prod[] = new int[n];
 
        /* Initialize the product array as 1 */
        for (int j = 0; j < n; j++)
            prod[j] = 1;
 
        /* In this loop, temp variable contains product of
           elements on left side excluding arr[i] */
        for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }
 
        /* Initialize temp to 1 for product on right side */
        temp = 1;
 
        /* In this loop, temp variable contains product of
           elements on right side excluding arr[i] */
        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }
 
        /* print the constructed prod array */
        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");
 
        return;
    }
    static void myans(int[] arr, int a){
        int ans[] = new int[arr.length];
        Arrays.setAll(ans, i->1);
        ans[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            ans[i] = ans[i-1] * arr[i];
        }
        ans[arr.length - 1] = ans[arr.length - 2];
        int product = 1;
        for(int i = arr.length - 1; i > 0; i--){
            ans[i] = ans[i-1] * product;
            product = product * arr[i];
        }
        ans[0] = product;
        for (int i = 0; i < arr.length; i++)
            System.out.print(ans[i] + " ");
    }
	/* Driver program to test the above function */
	public static void main(String[] args)
	{
		int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
		// productArray(arr, n);


        // productsinglearray(arr,n);
        myans(arr, n);
	}
}

// This code has been contributed by Mayank Jaiswal
