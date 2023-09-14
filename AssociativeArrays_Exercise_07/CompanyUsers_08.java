package AssociativeArrays_Exercise_07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class CompanyUsers_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        LinkedHashMap<String, ArrayList<String>> employees = new LinkedHashMap<>();
        ArrayList<String> listOfEmployees = new ArrayList<>();

        while (!command.equals("End")) {
            String[] data = command.split(" -> ");

            List<String> currentCompanyEmployees = employees.get(data[0]);

            boolean containsId = currentCompanyEmployees != null && currentCompanyEmployees.contains(data[1]);

            if (!containsId) {
                employees.putIfAbsent(data[0], new ArrayList<>());
                employees.get(data[0]).add(data[1]);
            }

            command = scanner.nextLine();
        }

        employees.entrySet().stream().forEach(company -> {
            System.out.println(company.getKey());
            company.getValue().stream().forEach(employe -> System.out.println("-- " + employe));
        });
    }
}
