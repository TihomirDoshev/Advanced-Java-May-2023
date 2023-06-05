package Advanced.Lesson4_StreamsFilesAndDirectories.Exercise4;

import java.io.File;

public class GetFolderSize_08 {
    public static void main(String[] args) {
        String pathFolder = "C:\\Users\\HP\\IdeaProjects\\SoftUni\\src\\Advanced\\Lesson4_StreamsFilesAndDirectories\\Files-and-Streams-Exercises-Exercise\\Exercises Resources";

        File folder = new File(pathFolder);

        File[] allFilesInFolder = folder.listFiles();

        int folderSize = 0;
        if (allFilesInFolder != null) {
            for (File file : allFilesInFolder) {
                folderSize += file.length();
            }
        }


        System.out.println("Folder size: " + folderSize);
    }
}
