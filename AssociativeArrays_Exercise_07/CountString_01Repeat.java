package AssociativeArrays_Exercise_07;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountString_01Repeat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        LinkedHashMap<Character, Integer> symbolMap = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }

            if (!symbolMap.containsKey(symbol)) {
                symbolMap.put(symbol, 0);
            }

            symbolMap.put(symbol, symbolMap.get(symbol) + 1);
        }

        symbolMap.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));


    }
}
