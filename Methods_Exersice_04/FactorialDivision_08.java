package Methods_Exersice_04;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long firstFactorial = calculatedFactorial(firstNum);
        long secondFactorial = calculatedFactorial(secondNum);

        double result = firstFactorial * 1.0 / secondFactorial;

        System.out.printf("%.2f", result);

    }

    public static long calculatedFactorial(int number) {
        long sumFactorial = 1;
        for (int i = 1; i <= number; i++) {
            sumFactorial *= i;
        }
        return sumFactorial;
    }

}
