// Calculator.java
// Kalkulator dua angka via input.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Angka pertama: ");
        double a = sc.nextDouble();
        System.out.print("Angka kedua: ");
        double b = sc.nextDouble();
        System.out.print("Operator (+, -, *, /): ");
        String op = sc.next();

        switch (op) {
            case "+": System.out.println("Hasil: " + (a + b)); break;
            case "-": System.out.println("Hasil: " + (a - b)); break;
            case "*": System.out.println("Hasil: " + (a * b)); break;
            case "/":
                if (b == 0) System.out.println("Error: pembagian nol");
                else System.out.println("Hasil: " + (a / b));
                break;
            default: System.out.println("Operasi tidak dikenal");
        }
        sc.close();
    }
}
