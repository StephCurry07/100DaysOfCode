public class 26characters{
    public static boolean checkStringForAllLetterUsingRegex(String input) {
        return input.toLowerCase()
          .replaceAll("[^a-z]", "")
          .replaceAll("(.)(?=.*\\1)", "")
          .length() == 26;
    }

    public static boolean checkStringForAllLetterUsingStream(String input) {
        long c = input.toLowerCase().chars()
          .filter(ch -> ch >= 'a' && ch <= 'z')
          .distinct()
          .count();
        return c == 26;
    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
    }
}