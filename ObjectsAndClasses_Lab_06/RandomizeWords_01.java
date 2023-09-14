package ObjectsAndClasses_Lab_06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int i = 0; i < input.length; i++) {
            int rndIndeX = random.nextInt(input.length);
            int rndIndeY = random.nextInt(input.length);

            String oldWord = input[rndIndeX];
            input[rndIndeX] = input[rndIndeY];
            input[rndIndeY] = oldWord;
        }

        System.out.println(String.join(System.lineSeparator(), input));
    }
}
