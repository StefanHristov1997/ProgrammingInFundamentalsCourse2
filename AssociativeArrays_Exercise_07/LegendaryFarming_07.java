package AssociativeArrays_Exercise_07;

import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> mapMaterial = new LinkedHashMap<>();
        mapMaterial.put("shards", 0);
        mapMaterial.put("fragments", 0);
        mapMaterial.put("motes", 0);

        LinkedHashMap<String, Integer> junk = new LinkedHashMap<>();

        boolean isWin = false;

        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split("\\s+");

            for (int i = 0; i <= inputData.length - 1; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    mapMaterial.put(material, mapMaterial.get(material) + quantity);
                } else {
                    if (junk.containsKey(material)) {
                        junk.put(material, junk.get(material) + quantity);
                    } else {
                        junk.put(material, quantity);
                    }
                }

                if (mapMaterial.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    mapMaterial.put(material, mapMaterial.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (mapMaterial.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    mapMaterial.put(material, mapMaterial.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (mapMaterial.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    mapMaterial.put(material, mapMaterial.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }

        mapMaterial.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
        junk.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
