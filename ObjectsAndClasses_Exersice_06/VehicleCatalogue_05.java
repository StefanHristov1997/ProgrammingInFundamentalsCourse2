package ObjectsAndClasses_Exersice_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue_05 {
    public static class Cars {
        private String type;
        private String model;
        private String color;

        private int horsePower;

        public Cars(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getModel() {
            return this.model;
        }

        public String getType() {
            return this.type;
        }

        public String getColor() {
            return this.color;
        }

        public int getHorsePower() {
            return this.horsePower;
        }

    }

    public static class Trucks {
        private String type;
        private String model;
        private String color;

        private int horsePower;

        public Trucks(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getModel() {
            return this.model;
        }

        public String getType() {
            return this.type;
        }

        public String getColor() {
            return this.color;
        }

        public int getHorsePower() {
            return this.horsePower;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        int sumOfCars = 0;
        int sumOfTrucks = 0;
        int countCars = 0;
        int countTrucks = 0;

        List<Cars> listOfCars = new ArrayList<>();
        List<Trucks> listOfTrucks = new ArrayList<>();

        while (!data.equals("End")) {
            String type = data.split(" ")[0];
            String model = data.split(" ")[1];
            String color = data.split(" ")[2];
            int horsePower = Integer.parseInt(data.split(" ")[3]);

            switch (type) {
                case "car":
                    Cars car = new Cars(type, model, color, horsePower);
                    listOfCars.add(car);
                    sumOfCars += horsePower;
                    countCars++;
                    break;
                case "truck":
                    Trucks truck = new Trucks(type, model, color, horsePower);
                    listOfTrucks.add(truck);
                    sumOfTrucks += horsePower;
                    countTrucks++;
                    break;
            }

            data = scanner.nextLine();
        }
        String command = scanner.nextLine();

        while (!command.equals("Close the Catalogue")) {
            for (Cars cars : listOfCars) {
                if (cars.getModel().equals(command)) {
                    System.out.println("Type:" + " " + "Car");
                    System.out.println("Model:" + " " + cars.getModel());
                    System.out.println("Color:" + " " + cars.getColor());
                    System.out.println("Horsepower:" + " " + cars.getHorsePower());
                    command = scanner.nextLine();
                    break;
                }
            }
            for (Trucks trucks : listOfTrucks) {
                if (trucks.getModel().equals(command)) {
                    System.out.println("Type:" + " " + "Truck");
                    System.out.println("Model:" + " " + trucks.getModel());
                    System.out.println("Color:" + " " + trucks.getColor());
                    System.out.println("Horsepower:" + " " + trucks.getHorsePower());
                    command = scanner.nextLine();
                    break;
                }
            }
        }

        double avrHorsePowerOfCars = sumOfCars * 1.0 / countCars;
        double avrHorsePowerOfTrucks = sumOfTrucks * 1.0 / countTrucks;

        if (listOfCars.isEmpty()) {
            avrHorsePowerOfCars = 0.00;
        } else if (listOfTrucks.isEmpty()) {
            avrHorsePowerOfTrucks = 0.00;
        }

        System.out.printf("Cars have average horsepower of: %.2f.\n", avrHorsePowerOfCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", avrHorsePowerOfTrucks);
    }
}

