package TextProcessing_Exercise_08;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\\\");

        String fileName = arr[arr.length - 1];

        String name = fileName.split("\\.")[0];
        String extension = fileName.split("\\.")[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);

    }
}
