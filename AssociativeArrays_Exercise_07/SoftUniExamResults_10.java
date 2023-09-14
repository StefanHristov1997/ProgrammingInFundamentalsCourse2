package AssociativeArrays_Exercise_07;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, Integer> results = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> submissions = new LinkedHashMap<>();


        while (!command.equals("exam finished")) {
            String username = command.split("-")[0];
            String language = command.split("-")[1];
            int points = 0;

            if (command.contains("banned")) {
                results.remove(username);
                break;
            }

            if (!results.containsKey(username)) {
                points = Integer.parseInt(command.split("-")[2]);
                results.put(username, points);
            } else {
                points = Integer.parseInt(command.split("-")[2]);
                if (results.get(username) < points) {
                    results.put(username, points);
                }
            }

            if (!submissions.containsKey(language)) {
                submissions.put(language, 0);
            }


            submissions.put(language, submissions.get(language) + 1);

            command = scanner.nextLine();
        }

        System.out.println("Results:");

        results.entrySet().stream().forEach(result -> System.out.println(result.getKey() + " | " + result.getValue()));

        System.out.println("Submissions:");

        submissions.entrySet().stream().forEach(sub -> System.out.println(sub.getKey() + " - " + sub.getValue()));

    }
}
