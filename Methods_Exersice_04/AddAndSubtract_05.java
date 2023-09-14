package Methods_Exersice_04;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sum = sum(firstNum,secondNum);
        int result = subtracts(sum,thirdNum);

        System.out.println(result);

    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int subtracts(int sum, int c) {
        int result = sum - c;
        return result;
    }
}
