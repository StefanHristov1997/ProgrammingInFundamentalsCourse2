package AssociativeArrays_Exercise_07;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CharsInAString_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        LinkedHashMap<Character, Integer> mapSymbols = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {

            if (symbol == ' ') {

            } else {

                if (mapSymbols.containsKey(symbol)) {
                    mapSymbols.put(symbol, mapSymbols.get(symbol) + 1);
                } else {
                    mapSymbols.put(symbol, 1);
                }

            }

        }

        mapSymbols.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

    }
}