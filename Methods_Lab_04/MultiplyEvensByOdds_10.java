package Methods_Lab_04;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Math.abs(Integer.parseInt(scanner.nextLine()));

        int result = sum(input);
        System.out.println(result);
    }

    public static int sum(int input) {
        int evenSum = 0;
        int oddSum = 0;
        while (input > 0) {
            int currentNumber = input % 10;
            if (currentNumber % 2 == 0) {
                evenSum += currentNumber;
            } else {
                oddSum += currentNumber;
            }
            input /= 10;
        }
        return evenSum * oddSum;

        //   String intToString = Integer.toString(input);
        //  int[] sumArr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        //  int evenSum = 0;
        //  int oddSum = 0;

        //  for (int num : sumArr) {
        //     if (num % 2 == 0){
        //        evenSum += num;
        //    }else {
        //        oddSum += num;
        //    }
        //   }
        //   return evenSum * oddSum;
    }
}
