package Methods_Exersice_04;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        countVowels(input);

    }

    public static void countVowels(String input) {
        int countVowels = 0;

        for (int index = 0; index <= input.length() - 1; index++) {
            char digit = input.charAt(index);

            if(digit == 97 || digit == 65){
                countVowels++;
            }else if (digit == 101 || digit== 69){
                countVowels++;
            }else if (digit == 105 || digit == 73){
                countVowels++;
            }else if (digit == 111 || digit == 79){
                countVowels++;
            }else if (digit == 117 || digit == 85){
                countVowels++;
            }
        }
        System.out.println(countVowels);
    }
}
