package RegularExpression_Exercise_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        String regex = "[A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+@[A-Za-z]+\\-?[A-Za-z]+(\\.[A-Za-z]+\\-?[A-Za-z]+)+";

        Pattern pattern = Pattern.compile(regex);

        Matcher validEmails = pattern.matcher(text);


        while (validEmails.find()){
            System.out.println(validEmails.group());
        }
    }
}
