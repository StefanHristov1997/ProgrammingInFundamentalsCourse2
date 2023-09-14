package AssociativeArrays_Exercise_07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, Double> buyMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productMap = new LinkedHashMap<>();
        LinkedHashMap<String, Double> finalMap = new LinkedHashMap<>();


        while (!command.equals("buy")) {
            String[] inputArr = command.split(" ");
            String name = inputArr[0];
            double price = Double.parseDouble(inputArr[1]);
            int quantity = Integer.parseInt(inputArr[2]);

            if (buyMap.containsKey(name)) {
                buyMap.put(name, price);
            }else{
                buyMap.put(name, price);
            }

            if(productMap.containsKey(name)){
                productMap.put(name,productMap.get(name) + quantity);
            }else{
                productMap.put(name,quantity);
            }

            finalMap.put(name,buyMap.get(name) * productMap.get(name));

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : finalMap.entrySet()) {
            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue());
        }
    }
}
