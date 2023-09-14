package TextProcessing_Exercise_08;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        int fullExplosion = 0;

        for (int index = 0; index <= input.length() - 1; index++) {
            char currentSymbol = input.charAt(index);

            if (currentSymbol == '>') {
                int strength = Integer.parseInt(String.valueOf(input.charAt(index + 1)));
                fullExplosion += strength;
            } else if (currentSymbol != '>' && fullExplosion > 0) {
                input.deleteCharAt(index);
                fullExplosion--;
                index--;
            }
        }

        System.out.println(input);
    }
}
