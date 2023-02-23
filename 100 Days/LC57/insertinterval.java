import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
public class insertinterval{

    public static int[] flattenArrayJDK8(int[][] array) {
        // flattened 1D array
        int[] intArray = Stream.of(array).
            flatMapToInt(IntStream::of).toArray();
        return intArray;
    }

    static int[][] conv1d(int[] arr){
        int[][] newarr = new int[arr.length/2][2];
        for(int i = 0; i < arr.length/2; i++){
            for(int j = 0; j < 2; j++){
                newarr[i][j] = arr[2*i + j];
            }
        }
        return newarr;
    }
    
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int nstart = newInterval[0];
        int nend = newInterval[1];
        int[] temp = new int[2];
        List<int[]> al = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
            if(nstart > intervals[i][1]){
                al.add(intervals[i]);
            }
            else if(nend < intervals[i][0]){
                al.add(newInterval);
                newInterval = intervals[i];
            }
            else if(nstart <= intervals[i][1] || nend >= intervals[i][0]){
                newInterval[0] = Math.min(nstart,intervals[i][0]);
                newInterval[1] = Math.max(nend,intervals[i][1]);
            }
        }
        al.add(newInterval);
        temp[0] = al.size();
        temp[1] = al.size();
        al.add(temp);
        return al.toArray(new int[al.size()][]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                intervals[i][j] = sc.nextInt();
            }
        }
        int[] newInterval = new int[2];
        for(int i = 0; i < 2; i++){
            newInterval[i] = sc.nextInt();
        }
        int[][] ans = new int[n+1][2];
        ans = insert(intervals, newInterval);
        int len = ans[ans.length - 1][0];
        for(int i = 0; i < len; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(ans[i][j] + " ");
            }
        }
        // insert(intervals, newInterval);
        sc.close();
    }
}