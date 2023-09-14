package Methods_Lab_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        double result = calculatedPowder(a, b);

        DecimalFormat df = new DecimalFormat("0.####");

        System.out.println(df.format(result));

    }

    public static double calculatedPowder(double a, double b) {
        return Math.pow(a, b);
    }
}
