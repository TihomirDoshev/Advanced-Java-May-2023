package Advanced.Lesson4_StreamsFilesAndDirectories.Exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {

        String pathToFile = "C:\\Users\\HP\\IdeaProjects\\SoftUni\\src\\Advanced\\Lesson4_StreamsFilesAndDirectories\\Files-and-Streams-Exercises-Exercise\\input.txt";



        List<String> allLines = Files.readAllLines(Path.of(pathToFile));

        for (String line : allLines) {
            long sum = 0;
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
            System.out.println(sum);
        }

    }

    }

