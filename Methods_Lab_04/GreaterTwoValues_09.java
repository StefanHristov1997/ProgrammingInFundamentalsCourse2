package Methods_Lab_04;

import java.util.Scanner;

public class GreaterTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                int intResult = greaterNum(firstNum, secondNum);
                System.out.println(intResult);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char charResult = greaterChar(firstChar, secondChar);
                System.out.println(charResult);
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String stringResult = greaterString(firstString, secondString);
                System.out.println(stringResult);
                break;
        }
    }
    public static int greaterNum(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static char greaterChar(char first, char second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static String greaterString(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }
}
