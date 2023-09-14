package TextProcessing_Lab_08;

import java.util.Scanner;

public class DigitsLettersOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);

            if (Character.isDigit(symbol)) {
                digits.append(symbol);
            }else if (Character.isLetter(symbol)){
                letters.append(symbol);
            }else {
                others.append(symbol);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
