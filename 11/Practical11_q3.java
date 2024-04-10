import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practical11_q3 {
    public static void main(String[] args) {

        Map<String, String> stateCapitalMap = new HashMap<>();

        stateCapitalMap.put("Andhra Pradesh", "Hyderabad");
        stateCapitalMap.put("Assam", "Dispur");
        stateCapitalMap.put("Bihar", "Patna");
        stateCapitalMap.put("Gujarat", "Gandhinagar");
        stateCapitalMap.put("Karnataka", "Bengaluru");
        stateCapitalMap.put("Maharashtra", "Mumbai");
        stateCapitalMap.put("Odisha", "Bhubaneswar");
        stateCapitalMap.put("Punjab", "Chandigarh");
        stateCapitalMap.put("Rajasthan", "Jaipur");
        stateCapitalMap.put("Tamil Nadu", "Chennai");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Indian state: ");
        String state = scanner.nextLine();

        state = state.trim();
        state = state.substring(0, 1).toUpperCase() + state.substring(1);

        String capital = stateCapitalMap.get(state);

        if (capital != null) {
            System.out.println("The capital of " + state + " is " + capital);
        } else {
            System.out.println("Capital not found for the entered state.");
        }

        scanner.close();
    }
}