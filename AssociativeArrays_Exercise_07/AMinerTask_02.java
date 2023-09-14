package AssociativeArrays_Exercise_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, Integer> resourceMap = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (resourceMap.containsKey(resource)) {
                resourceMap.put(resource, resourceMap.get(resource) + quantity);
            }else {
                resourceMap.put(resource, quantity);
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
