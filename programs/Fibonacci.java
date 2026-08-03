// Fibonacci.java
// Deret Fibonacci: 15 suku pertama.

public class Fibonacci {
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            sb.append(fibonacci(i));
            if (i < 14) sb.append(", ");
        }
        System.out.println(sb);
    }
}
