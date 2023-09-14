package Methods_Exersice_04;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printChars(firstSymbol, secondSymbol);
    }

    public static void printChars(char a, char b) {
        for (char index = (char)(a + 1); index < b; index++) {
            System.out.printf("%c ", index);
        }

        for (char index = (char) (b + 1); index < a; index++) {
            System.out.printf("%c ", index);
        }
    }
}
