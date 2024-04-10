import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practical7_q1 {
    public static void main(String[] args) {
        // for the output use terminal and write the java Practical7_q1 <String to remove> <filename>

        if (args.length != 2) {
            System.out.println("Usage: java RemoveStringFromFile <stringToRemove> <filename>"); 
            return;
        }

        String stringToRemove = args[0];
        String filename = args[1];

        try {

            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuilder content = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {

                line = line.replaceAll(stringToRemove, "");
                content.append(line).append("\n");
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(content.toString());
            writer.close();

            System.out.println("Occurrences of '" + stringToRemove + "' removed from the file.");
        } catch (IOException e) {
            System.err.println("Error reading/writing the file: " + e.getMessage());
        }
    }
}