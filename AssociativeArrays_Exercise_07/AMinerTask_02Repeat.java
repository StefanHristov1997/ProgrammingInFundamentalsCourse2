package AssociativeArrays_Exercise_07;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask_02Repeat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, Integer> minerMap = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (minerMap.containsKey(resource)) {
                minerMap.put(resource, minerMap.get(resource) + quantity);
            } else {
                minerMap.put(resource, quantity);
            }


            command = scanner.nextLine();
        }

        minerMap.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
