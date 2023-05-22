package Advanced.Lesson4_StreamsFilesAndDirectories.Lection4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\input.txt";
        Scanner scanner = new Scanner(new FileInputStream(path));

        PrintWriter writer = new PrintWriter("integers-out.txt");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                writer.println(number);
            }
            scanner.next();
        }

        writer.close();
    }
    }

