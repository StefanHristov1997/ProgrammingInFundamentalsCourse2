package TextProcessing_Lab_08;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        ArrayList<String> listOfStrings = new ArrayList<>();

        for (int index = 0; index < inputArr.length; index++) {
            String currentWord = inputArr[index];

            String result = repeatString(currentWord);
            listOfStrings.add(result);
        }

        System.out.println(String.join("",listOfStrings));
    }

    public static String repeatString(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += word;
        }

        return result;
    }
}
