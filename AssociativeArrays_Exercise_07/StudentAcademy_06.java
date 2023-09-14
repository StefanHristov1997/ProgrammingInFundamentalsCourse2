package AssociativeArrays_Exercise_07;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class StudentAcademy_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> gradeMap = new LinkedHashMap<>();


        for (int i = 1; i <= rows; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!gradeMap.containsKey(studentName)) {
                gradeMap.put(studentName, new ArrayList<>());
            }

            gradeMap.get(studentName).add(grade);
        }

        LinkedHashMap<String, Double> avrMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : gradeMap.entrySet()) {
            String student = entry.getKey();
            List<Double> avrGrades = entry.getValue();
            double avrGrade = getAvrgGrades(avrGrades);

            if (avrGrade >= 4.50) {
                avrMap.put(student, avrGrade);
            }
        }

        avrMap.entrySet().forEach(e -> System.out.printf("%s -> %.2f\n", e.getKey(), e.getValue()));

    }

    private static double getAvrgGrades(List<Double> avrGrades) {
        double sum = 0;

        for (double grade : avrGrades) {
            sum += grade;
        }
        return sum / avrGrades.size();
    }
}
