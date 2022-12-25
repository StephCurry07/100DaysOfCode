public class decodeString{
    static String decodeString(String s) {
        Stack<String> st = new Stack<>();
        int num = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='0'&&c<='9')
                num = num*10 + c-'0';
            else if(c=='[')
            {
                st.push(num + "");
                st.push("["); //use [ as a marker so we don't have to check whether an item is a number or not
                num = 0; 
            }else if(c==']')
            {
                String str = "";
                //keep pop until meet '['
                while(st.peek()!="[")
                {
                    str = st.pop() + str;
                }
                st.pop(); //pop '['
                int repeat = Integer.valueOf(st.pop());
                StringBuilder sb = new StringBuilder();
                for(int k=0; k<repeat; k++)
                {
                    sb.append(str);
                }
                st.push(sb.toString());
            }else
                st.push(c+""); 
        }
        
        String ans = "";
        while(!st.isEmpty()) ans = st.pop() + ans; 
        return ans;  
    }
    static int sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and
        // initialize all entries it as true. A value in
        // prime[i] will finally be false if i is Not a
        // prime, else true.
        int count = 0;
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
 
        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true) {
                // Update all multiples of p greater than or
                // equal to the square of it numbers which
                // are multiple of p and are less than p^2
                // are already been marked.
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
 
        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        int end = decodeString(str).length();
        // System.out.print(end);
        int ans = sieveOfEratosthenes(end);
        System.out.print(ans);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}