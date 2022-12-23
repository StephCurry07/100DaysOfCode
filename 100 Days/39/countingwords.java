public class countingwords{
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str,",.");    
        int max = -1;
        while(st.hasMoreTokens()){
            StringTokenizer inst = new StringTokenizer(st.nextToken()," ");
            if(max < inst.countTokens()){
                max = inst.countTokens();
            }
        }
        System.out.print(max);
    }
}