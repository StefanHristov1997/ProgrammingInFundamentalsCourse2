package TextProcessing_Exercise_08;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.nextLine().split(", ");


        for (String username : userNames) {
            if(isUsernameValid(username)){
                System.out.println(username);
            }
        }
    }

    public static boolean isUsernameValid(String username) {

        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }

        return true;
    }
}
