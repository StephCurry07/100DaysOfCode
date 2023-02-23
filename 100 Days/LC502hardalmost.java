import java.util.Scanner;
import java.util.Arrays;
public class LC502hardalmost{
    
            public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
                int total = w;
                TreeMap<Integer, Integer> tm = new TreeMap<>();
                int n = profits.length;
                System.out.print(n);
                for(int i = 0; i < n; i++){
                    tm.put(profits[i],capital[i]);
                }
                Arrays.sort(profits);
                Arrays.sort(capital);
                int min = capital[0];
                int flag = 0;
                if(w == min){
                    for(Map.Entry<Integer, Integer> entry : tm.entrySet()){
                        if(entry.getValue() == min){
                            total += entry.getKey();
                            break;
                        }
                    }
                    System.out.println(total);
                    flag = 1;
                    k--;
                }
                boolean visited[] = new boolean[n];
                for(int i = n - 1; i - flag >= 0; i--){
                    if(k > 0){
                        System.out.println("Total: " + total);
                        System.out.println("Capital: " + tm.get(profits[i]));
                        System.out.println("i: " + i);
                        if(total >= tm.get(profits[i])){
                            System.out.println(visited[i]);
                            if(visited[i] == false){
                                System.out.println("i visited: " + i);
                                total += profits[i];
                                visited[i] = true;
                                k--;
                                i = n;
                            }
                        }
                        System.out.println(total);
                    }
                }
                // System.out.print(tm);
                return total;
            }
            public static void main(String[] args) {
        }
    }
