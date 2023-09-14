package Methods_Lab_04;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int times = Integer.parseInt(scanner.nextLine());

        String text = repeatString(input,times);

        System.out.print(text);
    }

    public static String repeatString(String input, int n){
        String newInput = "";

        for (int i = 1; i <=n ; i++) {
            newInput += input;
        }
        return  newInput;
    }
}
