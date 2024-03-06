package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordDuplicateCheckerAssignment13 {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Pablo Avila\\Downloads\\github repo\\src\\hi.txt.txt";
        String outputFile = "output.txt";

        try {
            Scanner inputFileScanner = new Scanner(new File(inputFile));
            Map<String, Integer> wordCountMap = new HashMap<>();

            while (inputFileScanner.hasNextLine()) {
                String line = inputFileScanner.nextLine().toLowerCase(); 
                String[] words = line.split("\\s+");

                for (String word : words) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
            inputFileScanner.close();
            PrintWriter outputFileWriter = new PrintWriter(new FileWriter(outputFile));
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                String word = entry.getKey();
                int count = entry.getValue();
                outputFileWriter.println(word + " " + count);
            }
            outputFileWriter.close();
            System.out.println("Output exported to: " + outputFile);
        } catch (FileNotFoundException e) {
            System.err.println("Input file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


