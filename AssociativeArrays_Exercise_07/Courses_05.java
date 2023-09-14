package AssociativeArrays_Exercise_07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, ArrayList> courseMap = new LinkedHashMap<>();


        while (!command.equals("end")) {
            String courseName = command.split(" : ")[0];
            String student = command.split(" : ")[1];

            if (!courseMap.containsKey(courseName)) {
                courseMap.put(courseName, new ArrayList<String>());
            }

            courseMap.get(courseName).add(student);

            command = scanner.nextLine();
        }

        courseMap.entrySet().stream().forEach(course -> {
            System.out.println(course.getKey() + ": " + course.getValue().size());
            course.getValue().stream().forEach(student -> System.out.println("-- " + student));
        });

    }
}
