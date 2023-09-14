package ObjectsAndClasses_Lab_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    public static class Students {
        String firstName;
        String lastName;
        String age;
        String hometown;

        public Students(String firstName, String lastName, String age, String hometown) {
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

        public String getAge() {
            return this.age;
        }

        public String getHometown() {
            return this.hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Students> listOfStudents = new ArrayList<>();

        while (!command.equals("end")) {
            String[] input = command.split(" ");
            String firstName = input[0];
            String lastName = input[1];
            String age = input[2];
            String hometown = input[3];

            Students student = new Students(firstName, lastName, age, hometown);
            listOfStudents.add(student);


            command = scanner.nextLine();
        }

        String newCommand = scanner.nextLine();


        for (Students student : listOfStudents) {
            if (student.getHometown().equals(newCommand)) {
                System.out.printf("%s %s is %s years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
