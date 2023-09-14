package TextProcessing_Exercise_08;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder print = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            symbol = (char) ((char) symbol + 3);
            print.append(symbol);
        }

        System.out.println(print);
    }
}

