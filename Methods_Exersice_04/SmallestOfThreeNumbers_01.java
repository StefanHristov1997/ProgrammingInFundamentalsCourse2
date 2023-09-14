package Methods_Exersice_04;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short firstNum = Short.parseShort(scanner.nextLine());
        short secondNum = Short.parseShort(scanner.nextLine());
        short thirdNum = Short.parseShort(scanner.nextLine());

        result(firstNum, secondNum, thirdNum);

    }

    public static void result(short first, short second, short third) {
        if (first < second && first < third) {
            System.out.println(first);
        } else if (second < first && second < third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }
}
