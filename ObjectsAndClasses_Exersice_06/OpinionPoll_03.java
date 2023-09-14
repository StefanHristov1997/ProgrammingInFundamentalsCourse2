package ObjectsAndClasses_Exersice_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll_03 {

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> listOfPerson = new ArrayList<>();

        for (int rows = 1; rows <= n; rows++) {
            String data = scanner.nextLine();
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);

            if (age > 30) {
                Person person = new Person(name, age);
                listOfPerson.add(person);
            }
        }

        for (Person person : listOfPerson) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
