package Methods_Lab_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double b = Double.parseDouble(scanner.nextLine());

        double result = calculated(a, operator, b);

        DecimalFormat df = new DecimalFormat("0.####");

        System.out.println(df.format(result));

    }

    public static double calculated(double a, char operator, double b) {
        double result = 0;
        switch (operator) {
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
        }
        return result;
    }
}
