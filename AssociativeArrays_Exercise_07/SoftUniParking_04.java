package AssociativeArrays_Exercise_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> parkingMap = new LinkedHashMap<>();

        for (int i = 1; i <= rows; i++) {
            String command = scanner.nextLine();
            String commandName = command.split(" ")[0];
            String username = command.split(" ")[1];

            switch (commandName) {
                case "register":
                    String password = command.split(" ")[2];
                    if (!parkingMap.containsKey(username)) {
                        System.out.printf("%s registered %s successfully\n", username, password);
                        parkingMap.put(username, password);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s\n", password);
                    }
                    break;
                case "unregister":
                    if (!parkingMap.containsKey(username)) {
                        System.out.printf("ERROR: user %s not found\n", username);
                    } else {
                        System.out.printf("%s unregistered successfully\n", username);
                        parkingMap.remove(username);
                    }
                    break;
            }
        }
        parkingMap.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
