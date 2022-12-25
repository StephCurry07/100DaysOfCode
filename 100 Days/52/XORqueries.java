public class XORqueries{
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int[] arr = new int[x];
        for(int i = 0; i < x; i++){
            arr[i] = sc.nextInt();
        }
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] quer = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                quer[i][j] = sc.nextInt();
            }
        }
        for(int r = 0; r < n; r++){
            int xor = 0;
            for(int i = quer[r][0]; i <= quer[r][1]; i++){
                xor = xor^arr[i];
            }
            System.out.println(xor);
        }
    }
}