package AssociativeArrays_Lab_07;

import java.util.*;

public class OddOccurrences_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");


        LinkedHashMap<String, Integer> inputMap = new LinkedHashMap<>();

        for (String word : inputArr) {
            String wordInLowerCase = word.toLowerCase();

            if (!inputMap.containsKey(wordInLowerCase)) {
                inputMap.put(wordInLowerCase, 0);
            }

            inputMap.put(wordInLowerCase, inputMap.get(wordInLowerCase) + 1);
        }

        ArrayList<String> resultList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }

        System.out.printf(String.join(", ", resultList));
    }
}
