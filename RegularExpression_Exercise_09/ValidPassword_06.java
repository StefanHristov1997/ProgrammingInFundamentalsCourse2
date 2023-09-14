package RegularExpression_Exercise_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "_\\.+(?<password>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(regex);
        String group = "";
        boolean containsDigits = false;

        for (int i = 1; i <= n; i++) {
            String passwords = scanner.nextLine();
            Matcher validPassword = pattern.matcher(passwords);

            if (validPassword.find()) {
                for (char symbol : validPassword.group("password").toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        group += symbol;
                        containsDigits = true;
                    }
                }

                if (containsDigits) {
                    System.out.println("Group:" + " " + group);
                    group = "";
                    containsDigits = false;
                } else {
                    System.out.println("Group: default");
                }
            } else {
                System.out.println("Invalid pass!");
            }
        }

    }
}
