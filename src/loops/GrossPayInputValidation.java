package src.loops;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        double rate = 15;
        double maxHours = 40;
        int num_of_tries = 0;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again");
            num_of_tries = num_of_tries + 1;

            if (num_of_tries > 3){
                System.out.println("Ops...more than the maximum number of hours");
                return;
            }

            hoursWorked = scanner.nextDouble();
        }

        scanner.close();





        double grossPay = hoursWorked * rate;

        System.out.println("Gross pay: " + grossPay);
    }
}
