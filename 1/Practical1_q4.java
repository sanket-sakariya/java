import java.util.Scanner;

public class Practical1_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in pound:");
        float w = sc.nextFloat();
        System.out.println("Enter the height in inches:");
        float h = sc.nextFloat();
        float weight = w*0.4535f;
        float height = h/39.37f;
        float BMI = (weight)/(height*height);
        // System.out.printf("Your BMI is %f", BMI);
        System.out.println("Your BMI is " +BMI);
       
    }
}
