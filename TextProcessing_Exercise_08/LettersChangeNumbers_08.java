package TextProcessing_Exercise_08;

import java.util.Arrays;
import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double totalSum = 0;

        for (String code : input) {
            double modifyNumber = getModifiedNumber(code);
            totalSum += modifyNumber;
        }

        System.out.printf("%.2f", totalSum);

    }

    private static double getModifiedNumber(String code) {

        char letterBefore = code.charAt(0);
        char letterAfter = code.charAt(code.length() - 1);
        String substring = code.substring(1, code.length() - 1);
        double number = Double.parseDouble(substring);

        if (Character.isUpperCase(letterBefore)) {
            int letterUpperPosition = (int) letterBefore - 64;
            number = number / letterUpperPosition;
        } else {
            int letterLowerPosition = (int) letterBefore - 96;
            number = number * letterLowerPosition;
        }

        if (Character.isUpperCase(letterAfter)) {
            int letterUpperPosition = (int) letterAfter - 64;
            number = number - letterUpperPosition;
        } else {
            int letterLowerPosition = (int) letterAfter - 96;
            number = number + letterLowerPosition;
        }

        return number;
    }
}
