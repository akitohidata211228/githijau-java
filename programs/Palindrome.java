// Palindrome.java
// Cek apakah sebuah kata palindrom.

public class Palindrome {
    static boolean isPalindrome(String text) {
        String cleaned = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        String[] samples = {"Racecar", "Hello", "Kasur ini rusak"};
        for (String s : samples) {
            System.out.println(s + " -> " + (isPalindrome(s) ? "palindrom" : "bukan"));
        }
    }
}
