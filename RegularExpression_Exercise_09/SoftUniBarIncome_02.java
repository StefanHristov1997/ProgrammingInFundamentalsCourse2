package RegularExpression_Exercise_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPrice = 0;
        double income = 0;

        while (!input.equals("end of shift")) {
            String regex = "%(?<costumer>[A-Z][a-z]+)%[^%|.$]*?<(?<product>\\w+)>[^%|.$]*?\\|(?<count>[0-9]+)\\|[^%|.$]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                totalPrice = count * price;
                income += totalPrice;

                System.out.printf("%s: %s - %.2f\n", matcher.group("costumer"), matcher.group("product"), totalPrice);

            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", income);
    }
}
