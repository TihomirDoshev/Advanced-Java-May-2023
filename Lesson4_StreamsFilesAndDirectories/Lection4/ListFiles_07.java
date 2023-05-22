package Advanced.Lesson4_StreamsFilesAndDirectories.Lection4;

import java.io.File;

public class ListFiles_07 {
    public static void main(String[] args) {
        File file = new File("C:\\input.txt");
        File[] files = file.listFiles();

        for (File f : files) {
            if (!f.isDirectory()) {
                System.out.println(f.length());
            }
        }

    }
}
