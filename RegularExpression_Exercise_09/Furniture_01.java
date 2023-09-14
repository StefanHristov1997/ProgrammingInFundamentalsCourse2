package RegularExpression_Exercise_09;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String products = scanner.nextLine();

        ArrayList<String> productList = new ArrayList<>();

        double sum = 0;


        while (!products.equals("Purchase")) {
            String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[\\d.]+)[!](?<quantity>[\\d]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(products);

            if (matcher.find()) {
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                sum += price * quantity;
                productList.add(matcher.group("name"));
            }

            products = scanner.nextLine();
        }

        System.out.println("Bought furniture:");

        for(String product:productList){
            System.out.println(product);
        }

        System.out.printf("Total money spend: %.2f" , sum);

    }
}
