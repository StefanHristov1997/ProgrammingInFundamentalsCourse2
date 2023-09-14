package Methods_Lab_04;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double area = calculatedArea(width,height);

        System.out.printf("%.0f", area);
    }

    public static double calculatedArea (double a , double b){
        return a * b;
    }

}
