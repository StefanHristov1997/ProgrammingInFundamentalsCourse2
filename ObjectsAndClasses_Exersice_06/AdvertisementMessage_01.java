package ObjectsAndClasses_Exersice_06;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String phraseToPrint = randomPhrase();
            String eventToPrint = randomEvent();
            String authorToPrint = randomAuthor();
            String cityToPrint = randomCities();

            System.out.printf("%s %s %s – %s\n", phraseToPrint, eventToPrint, authorToPrint, cityToPrint);

        }
    }

    public static String randomPhrase() {
        String phrase = "";
        Random random1 = new Random();
        int random = random1.nextInt(6);

        switch (random) {
            case 0:
                phrase = "Excellent product.";
                break;
            case 1:
                phrase = "Such a great product.";
                break;
            case 2:
                phrase = "I always use that product.";
                break;
            case 3:
                phrase = "Best product of its category.";
                break;
            case 4:
                phrase = "Exceptional product.";
                break;
            case 5:
                phrase = "I can’t live without this product.";
                break;
        }
        return phrase;
    }

    public static String randomEvent() {
        String event = "";
        Random random1 = new Random();
        int random = random1.nextInt(6);

        switch (random) {
            case 0:
                event = "Now I feel good.";
                break;
            case 1:
                event = "I have succeeded with this product.";
                break;
            case 2:
                event = "Makes miracles. I am happy of the results!";
                break;
            case 3:
                event = "I cannot believe but now I feel awesome.";
                break;
            case 4:
                event = "Try it yourself, I am very satisfied.";
                break;
            case 5:
                event = "I feel great!";
                break;
        }
        return event;
    }

    public static String randomAuthor() {
        String author = "";
        Random random1 = new Random();
        int random = random1.nextInt(8);

        switch (random) {
            case 0:
                author = "Diana";
                break;
            case 1:
                author = "Petya";
                break;
            case 2:
                author = "Stella";
                break;
            case 3:
                author = "Elena";
                break;
            case 4:
                author = "Katya";
                break;
            case 5:
                author = "Iva";
                break;
            case 6:
                author = "Annie";
                break;
            case 7:
                author = "Eva";
                break;
        }
        return author;
    }

    public static String randomCities() {
        String cities = "";
        Random random1 = new Random();
        int random = random1.nextInt(5);

        switch (random) {
            case 0:
                cities = "Burgas";
                break;
            case 1:
                cities = "Sofia";
                break;
            case 2:
                cities = "Plovdiv";
                break;
            case 3:
                cities = "Varna";
                break;
            case 4:
                cities = "Ruse";
                break;
        }
        return cities;
    }
}
