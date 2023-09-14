package Methods_Exersice_04;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter(input);

    }

    public static void printMiddleCharacter(String input) {

        if (input.length() % 2 != 0) {
            int midChar = input.length() / 2;
            System.out.println(input.charAt(midChar));
        } else {
            int evenMiddleIndex = input.length() / 2 - 1;
            int evenMiddleSecondIndex = input.length() / 2;

            System.out.print(input.charAt(evenMiddleIndex));
            System.out.print(input.charAt(evenMiddleSecondIndex));
        }

    }
}
