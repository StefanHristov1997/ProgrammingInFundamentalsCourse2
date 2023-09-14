package ObjectsAndClasses_Exersice_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge_06 {
    public static class People {
        private String name;
        private String ID;

        private int age;

        public People(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }

        public String getID() {
            return this.ID;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<People> listOfPeople = new ArrayList<>();

        while (!command.equals("End")) {
            String name = command.split(" ")[0];
            String ID = command.split(" ")[1];
            int age = Integer.parseInt(command.split(" ")[2]);

            People people = new People(name, ID, age);
            listOfPeople.add(people);

            command = scanner.nextLine();
        }

        listOfPeople.sort(Comparator.comparing(People::getAge));

        for (People people : listOfPeople){
            System.out.printf("%s with ID: %s is %d years old.\n", people.getName(), people.getID(), people.getAge());
        }


    }
}
