package Advanced.Lesson4_StreamsFilesAndDirectories.Exercise4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles_07 {
    public static void main(String[] args) throws IOException {

        String pathFileOne = "C:\\Users\\HP\\IdeaProjects\\SoftUni\\src\\Advanced\\Lesson4_StreamsFilesAndDirectories\\Files-and-Streams-Exercises-Exercise\\inputOne.txt";

        String pathFileTwo = "C:\\Users\\HP\\IdeaProjects\\SoftUni\\src\\Advanced\\Lesson4_StreamsFilesAndDirectories\\Files-and-Streams-Exercises-Exercise\\inputTwo.txt";

        PrintWriter writer = new PrintWriter("outputMerge.txt");

        List<String> allLinesFileOne = Files.readAllLines(Path.of(pathFileOne));
        allLinesFileOne.forEach(line -> writer.println(line));
        List<String> allLinesFileTwo = Files.readAllLines(Path.of(pathFileTwo));
        allLinesFileTwo.forEach(line -> writer.println(line));

        writer.close();
    }
}
