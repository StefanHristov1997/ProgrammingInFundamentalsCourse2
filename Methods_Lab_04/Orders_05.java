package Methods_Lab_04;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double printResult = 0;

        switch (product) {
            case "coffee":
                price = 1.50;
                printResult = finalPrice(quantity,price);
                System.out.printf("%.2f",printResult);
                break;
            case "water":
                price = 1.00;
                printResult = finalPrice(quantity,price);
                System.out.printf("%.2f",printResult);
                break;
            case "coke":
                price = 1.40;
                printResult = finalPrice(quantity,price);
                System.out.printf("%.2f",printResult);
                break;
            case "snacks":
                price = 2.00;
                printResult = finalPrice(quantity,price);
                System.out.printf("%.2f",printResult);
                break;
        }
    }

    public static double finalPrice(double a , double b){
        return a * b;
    }
}
