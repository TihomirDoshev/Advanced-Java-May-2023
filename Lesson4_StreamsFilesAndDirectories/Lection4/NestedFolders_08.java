package Advanced.Lesson4_StreamsFilesAndDirectories.Lection4;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders_08 {
    public static void main(String[] args) {
        File file = new File("C:\\input.txt");

        Deque<File> deque = new ArrayDeque<>();
        deque.add(file);
        int count = 1;

        while (!deque.isEmpty()) {
            File f = deque.poll();
            count++;
            System.out.println(f.getName());

            File[] files = file.listFiles();
            for (File innerFile : files) {
                if (innerFile.isDirectory()) {
                    deque.offer(innerFile);
                }
            }
        }
        System.out.println(count);
    }
}
