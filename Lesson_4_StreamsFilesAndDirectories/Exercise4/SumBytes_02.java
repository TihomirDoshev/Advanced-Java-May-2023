package Advanced.Lesson4_StreamsFilesAndDirectories.Exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumBytes_02 {
    public static void main(String[] args) throws IOException {

        String pathToFile = "C:\\Users\\HP\\IdeaProjects\\SoftUni\\src\\Advanced\\Lesson4_StreamsFilesAndDirectories\\Files-and-Streams-Exercises-Exercise\\input.txt";

        long sum = 0;


        List<String> allLines = Files.readAllLines(Path.of(pathToFile));

        for (String line : allLines) {
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
        }
        System.out.println(sum);



        }

    }

