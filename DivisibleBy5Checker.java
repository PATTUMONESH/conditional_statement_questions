package conditional_statements_questions;

import java.util.Scanner;

public class DivisibleBy5Checker {
    public static void main(String[] args) {
       
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isDivisibleBy5(number)) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }
    }

    public static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}

