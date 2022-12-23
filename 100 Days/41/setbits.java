class setbits{
    static int count(int a){
        int cnt = 0;
        while(a != 0){
            cnt += a&1;
            a = a>>1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.print(count(i) + " ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}