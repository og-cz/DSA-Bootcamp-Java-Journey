public class Q16_ReverseString {
    public static void main(String[] args) {
        String str = "carl";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(reverse + " " + str);
    }
}
