package ObjectsAndClasses_Lab_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_06 {
    public static class Students_02 {
        String firstName;
        String lastName;
        String age;
        String hometown;

        public Students_02(String firstName, String lastName, String age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAge() {
            return this.age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public String getHometown() {
            return this.hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Students_02> listOfStudents_02 = new ArrayList<>();

        while (!command.equals("end")) {
            String[] input = command.split(" ");
            String firstName = input[0];
            String lastName = input[1];
            String age = input[2];
            String hometown = input[3];

            if (isStudentExists(listOfStudents_02, firstName, lastName)) {
                int index = getExistingIndex(listOfStudents_02, firstName, lastName);
                listOfStudents_02.get(index).setAge(age);
                listOfStudents_02.get(index).setHometown(hometown);
            } else {
                Students_02 newStudent = new Students_02(firstName, lastName, age, hometown);
                listOfStudents_02.add(newStudent);
            }
            command = scanner.nextLine();
        }

        String newCommand = scanner.nextLine();

        for (Students_02 student : listOfStudents_02) {
            if (student.getHometown().equals(newCommand)) {
                System.out.printf("%s %s is %s years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    public static int getExistingIndex(List<Students_02> studentsList, String firstName, String lastName) {
        int index = -1;
        for (int i = 0; i < studentsList.size(); i++) {
            Students_02 student = studentsList.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                index = i;
            }
        }
        return index;
    }

    static boolean isStudentExists(List<Students_02> studentsList, String firstName, String lastName) {
        for (Students_02 student : studentsList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    public static Students_02 getStudent(List<Students_02> student, String firstName, String lastName) {
        Students_02 existing = null;

        for (Students_02 students : student) {
            if (students.getFirstName().equals(firstName) && students.getLastName().equals(lastName)) {
                existing = students;
            }
        }
        return existing;
    }
}
