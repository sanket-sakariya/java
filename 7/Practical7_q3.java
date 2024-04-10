import java.io.*;
import java.util.*;

public class Practical7_q3 {
    public static void main(String[] args) {

        File file = new File("Practical7.txt");

        try {

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            }

            FileWriter writer = new FileWriter(file);
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt(1001); 
                writer.write(Integer.toString(randomNumber) + " ");
            }
            writer.close();

            FileReader reader = new FileReader(file);
            Scanner scanner = new Scanner(reader);
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                numbers.add(number);
            }
            reader.close();

            Collections.sort(numbers);

            System.out.println("Numbers in increasing order:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}