package TextProcessing_Lab_08;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String firstWord = scanner.nextLine();

        while (!firstWord.equals("end")) {

            String reversedWord = "";

            for (int i = firstWord.length() - 1; i >= 0; i--) {
                reversedWord += firstWord.charAt(i);
            }

            System.out.println(firstWord + " = " + reversedWord);

            firstWord = scanner.nextLine();
        }
    }
}
