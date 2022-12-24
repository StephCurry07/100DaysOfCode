class logint{
 
    // Function to calculate the
    // log base 2 of an integer
    public static int log2(int N)
    {
 
        // calculate log2 N indirectly
        // using log() method
        int result = (int)(Math.log(N) / Math.log(2));
 
        return result;
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        int N = 1027;
 
        System.out.println("Log " + N + " to the base 2 = " + log2(N));
    }
}