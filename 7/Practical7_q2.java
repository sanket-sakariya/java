import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practical7_q2 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java Practical7_q2 <filename>");
            return;
        }

        String filename = args[0];
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {

            BufferedReader reader = new BufferedReader(new FileReader(filename));

            String line;
            while ((line = reader.readLine()) != null) {

                lineCount++;

                charCount += line.length();

                String[] words = line.trim().split("\\s+");

                wordCount += words.length;
            }

            reader.close();

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}