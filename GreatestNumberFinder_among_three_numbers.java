package conditional_statements_questions;

import java.util.Scanner;

public class GreatestNumberFinder_among_three_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        
        int greatestNumber = (number1 > number2) ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);

       
        System.out.println("The greatest number is: " + greatestNumber);
    }
}
