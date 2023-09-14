package TextProcessing_Exercise_08;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger number = new BigInteger(scanner.nextLine());
        int multiply = Integer.parseInt(scanner.nextLine());


        BigInteger result = number.multiply(BigInteger.valueOf(multiply));

        System.out.println(result);


    }
}
