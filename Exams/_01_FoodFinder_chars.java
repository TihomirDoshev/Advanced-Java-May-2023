package Advanced.Exams;

import java.util.*;

public class _01_FoodFinder_chars {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //•	"pear"
        //•	"flour"
        //•	"pork"
        //•	"olive"
        String [] words = new String[]{"pear","flour","pork","olive"};
        String [] findWords = new String[]{"****","*****","****","*****"};

       String [] vowels = scanner.nextLine().split("\\s+");
       String [] consonants = scanner.nextLine().split("\\s+");

        Queue<Character> vowelsQ = new ArrayDeque<>();
        Arrays.stream(vowels).forEach(e-> vowelsQ.offer(e.charAt(0)));

        Deque<Character> consonantsD = new ArrayDeque<>();
        Arrays.stream(consonants).forEach(e -> consonantsD.push(e.charAt(0)));

        while (!vowelsQ.isEmpty() && !consonantsD.isEmpty()){
            char currentVowel = vowelsQ.poll();
            char currentConsonant = consonantsD.pop();

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
               // String findWord = findWords[i];
                int indexVowel = word.indexOf(currentVowel);
                int indexConsonant =  word.indexOf(currentConsonant);
                if (indexVowel >= 0) {
                    findWords[i] = findWords[i].substring(0, indexVowel) + currentVowel + findWords[i].substring(indexVowel + 1);
                }
                if (indexConsonant>=0) {
                    findWords[i] = findWords[i].substring(0, indexConsonant) + currentConsonant + findWords[i].substring(indexConsonant + 1);
                }

            }
            vowelsQ.offer(currentVowel);

        }
        List<String> output = new ArrayList<>();
        for (String element : findWords) {
            if (!element.contains("*")){
                output.add(element);
            }

        }
        System.out.printf("Words found: %d%n",output.size());
        for (String element : output) {
            System.out.println(element);

        }



    }
}
