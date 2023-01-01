import java.util.HashMap;

public class test {
    static void check(String[] arr, int i, int j){
        if(i == arr.length){
            return;
        }
        if(j == arr[i].length()){
            return;
        }


    }
    
    public static void main(String[] args) {
        // String str = "gse+GHrt";
        // str = str.replaceAll("\\+", "-");
        // System.out.println(str); // if only replace is there, we can replace the meta characters.
                                                                        // If you wanna use replaceAll then use \\ before the meta characters.
        String[] arr = new String[]{"abc", "mno", "pqrs","tuv"};
        for(int j = 0; j < arr[0].length(); j++){
            for(int k = 0; k < arr[1].length(); k++){
                for(int l = 0; l < arr[2].length(); l++){
                    System.out.print("" + arr[0].charAt(j) + arr[1].charAt(k) + arr[2].charAt(l) +" ");
                }
                // System.out.println();
            }
        }
        
    }
}