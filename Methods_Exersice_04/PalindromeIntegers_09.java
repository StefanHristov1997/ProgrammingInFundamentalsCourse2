package Methods_Exersice_04;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            // String result = palindromeIntegers(command);
            System.out.println(palindromeIntegers(command));
            command = scanner.nextLine();
        }


    }

    public static boolean palindromeIntegers(String number) {
        // String forward = "";
        String backward = "";
        // String result = "";
        // for (int i = 0; i <= number.length() - 1; i++) {
        //     forward = forward + number.charAt(i);
        // }

        for (int i = number.length() - 1; i >= 0; i--) {
            backward = backward + number.charAt(i);
        }

        return number.equals(backward);
        // if (forward.equals(backward)) {
        //    result = "true";
        //  }else {
        //result = "false";
        //  }
        // return result;
    }
}
