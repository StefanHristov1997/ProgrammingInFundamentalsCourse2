package ObjectsAndClasses_Exersice_06;

import java.util.*;

public class Students_04 {

    public static class Student {
        private String firstName;
        private String lastName;

        private double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return this.grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> listOfStudents = new ArrayList<>();

        for (int rows = 1; rows <= n; rows++) {
            String[] data = scanner.nextLine().split(" ");
            String firstName = data[0];
            String lastName = data[1];
            double grade = Double.parseDouble(data[2]);

            Student student = new Student(firstName, lastName, grade);
            listOfStudents.add(student);
        }

        listOfStudents.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : listOfStudents) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
