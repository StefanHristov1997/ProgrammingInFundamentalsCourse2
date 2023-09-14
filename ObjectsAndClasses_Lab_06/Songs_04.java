package ObjectsAndClasses_Lab_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    public static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return this.name;
        }

        public String getTypeList() {
            return this.typeList;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> listSong = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] arr = scanner.nextLine().split("_");
            String typeList = arr[0];
            String name = arr[1];
            String time = arr[2];

            Song song = new Song(typeList, name, time);
            listSong.add(song);
        }

        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song song : listSong) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : listSong) {
                String currentTypeList = song.getTypeList();
                if (currentTypeList.equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
