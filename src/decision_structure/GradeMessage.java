package src.decision_structure;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        System.out.print("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;

            case "D":
                message = "You can do better";
                break;
            case "F":
                message = "try again";
                        break;
            default:
                message = "unexpected input";
                break;
        }

        System.out.println(message);
    }
}
