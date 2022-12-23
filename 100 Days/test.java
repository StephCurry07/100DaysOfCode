public class test {
    public static void main(String[] args) {
        String str = "gse+GHrt";
        str = str.replaceAll("\\+", "-");
        System.out.println(str); // if only replace is there, we can replace the meta characters.
                                                                        // If you wanna use replaceAll then use \\ before the meta characters.

    }
}