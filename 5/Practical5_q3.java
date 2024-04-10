import java.util.Scanner;


interface Exam {
    boolean Pass(int mark);
}


interface Classify {
    String Division(int average);
}


class Result implements Exam, Classify {
    
    public boolean Pass(int mark) {
        return mark >= 50;
    }

    
    public String Division(int average) {
        if (average >= 60) {
            return "First";
        } else if (average >= 50) {
            return "Second";
        } else {
            return "No division";
        }
    }
}

public class Practical5_q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        
        System.out.print("Enter the average: ");
        int average = scanner.nextInt();

        
        Result result = new Result();

        
        if (result.Pass(marks)) {
            System.out.println("You passed the exam!");
        } else {
            System.out.println("You failed the exam.");
        }

        
        System.out.println("Division: " + result.Division(average));

        scanner.close();
    }
}
