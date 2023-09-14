package TextProcessing_Lab_08;

import java.util.Scanner;

public class Substring_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

        for (String word : arr) {
            String forReplace = replace(word);
            text = text.replace(word, forReplace);
        }

        System.out.println(text);
    }

    public static String replace(String word) {
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            result = result + "*";
        }
        return result;
    }
}
