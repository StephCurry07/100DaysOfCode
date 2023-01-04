import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
// Java implementation of above approach
import java.util.*;


public class summinsubarray{
    static class pair
    {
        int first, second;
        public pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
    
    // Function to return required minimum sum
    static int sumSubarrayMins(int A[], int n)
    {
        int []left = new int[n];
        int []right = new int[n];
        
        Stack<pair> s1 = new Stack<pair>();
        Stack<pair> s2 = new Stack<pair>();
	
	// getting number of element strictly larger
	// than A[i] on Left.
	for (int i = 0; i < n; ++i)
	{
		int cnt = 1;
        
		// get elements from stack until element
		// greater than A[i] found
		while (!s1.isEmpty() &&
        (s1.peek().first) > A[i])
		{
            cnt += s1.peek().second;
			s1.pop();
		}
        
		s1.push(new pair(A[i], cnt));
		left[i] = cnt;
	}
    
	// getting number of element larger
	// than A[i] on Right.
	for (int i = n - 1; i >= 0; --i)
	{
        int cnt = 1;
        
		// get elements from stack until element
		// greater or equal to A[i] found
		while (!s2.isEmpty() &&
        (s2.peek().first) >= A[i])
		{
            cnt += s2.peek().second;
			s2.pop();
		}

		s2.push(new pair(A[i], cnt));
		right[i] = cnt;
	}
    
	int result = 0;
    
	// calculating required resultult
	for (int i = 0; i < n; ++i)
    result = (result + A[i] * left[i] *
    right[i]);
    
	return result;
}

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            // sum += arr[i];
        }
        // for (int i = 0; i < arr.length;i++){
        //     al.clear();
        //     for (int j = i; j < arr.length;j++){
        //         al.add(arr[j]);
        //         sum += Collections.min(al);
        //     }
        // }
        sum = sumSubarrayMins(arr, n);
        System.out.println(sum%1000000007);
    }
}