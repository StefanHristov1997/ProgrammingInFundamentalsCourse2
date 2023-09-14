package AssociativeArrays_Exercise_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        LinkedHashMap<Character, Integer> textMap = new LinkedHashMap<>();

        for (char el : text.toCharArray()) {

            if (el == 32) {
                continue;
            }

            if (!textMap.containsKey(el)) {
                textMap.put(el, 0);
            }

            textMap.put(el, textMap.get(el) + 1);
        }

        for (Map.Entry<Character, Integer> entry : textMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
