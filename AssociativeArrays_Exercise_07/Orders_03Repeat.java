package AssociativeArrays_Exercise_07;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Orders_03Repeat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Double> productMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> priceMap = new LinkedHashMap<>();
        LinkedHashMap<String, Double> totalMap = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] data = input.split(" ");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (!productMap.containsKey(name)) {
                productMap.put(name, price);
            } else {
                productMap.put(name, price);
            }

            if (!priceMap.containsKey(name)) {
                priceMap.put(name, quantity);
            } else {
                priceMap.put(name, priceMap.get(name) + quantity);
            }

            totalMap.put(name, productMap.get(name) * priceMap.get(name));


            input = scanner.nextLine();
        }

        totalMap.entrySet().forEach(product -> System.out.printf("%s -> %.2f\n",product.getKey(), product.getValue()));
    }
}
