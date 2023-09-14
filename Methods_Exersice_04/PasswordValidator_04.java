package Methods_Exersice_04;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputPassword = scanner.nextLine();

        boolean firstRule = firstRule(inputPassword);

        if (firstRule){

        }else {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean secondRule = secondRule(inputPassword);

        if (secondRule){

        }else {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean thirdRule = thirdRule(inputPassword);

        if (thirdRule){

        }else {
            System.out.println("Password must have at least 2 digits");
        }

        if (firstRule && secondRule && thirdRule){
            System.out.println("Password is valid");
        }
    }

    public static boolean firstRule(String input) {
        if (input.length() >= 6 && input.length() <= 10) {
            return true;
        }

        return false;
    }

    public static boolean secondRule(String input) {

        boolean isValid = false;
        for (int index = 0; index <= input.length() - 1; index++) {
            char currentSymbol = input.charAt(index);

            if (currentSymbol >= 48 && currentSymbol <= 57) {
                isValid = true;
            } else {
                isValid = false;
                if (currentSymbol >= 65 && currentSymbol <= 90) {
                    isValid = true;
                } else {
                    isValid = false;
                    if (currentSymbol >= 97 && currentSymbol <= 122) {
                        isValid = true;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
        }
        return isValid;
    }

    public static boolean thirdRule(String input) {
        int countDigits = 0;
        for (int index = 0; index <= input.length() - 1; index++) {
            char currentSymbol = input.charAt(index);
            if (currentSymbol >= 48 && currentSymbol <= 57) {
                countDigits++;
            }
        }
        if (countDigits >= 2) {
            return true;
        }

        return false;
    }
}
