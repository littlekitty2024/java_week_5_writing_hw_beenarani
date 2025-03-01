package programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring the scanner object
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please first number : "); // input wizard
            int a = scanner.nextInt();
            System.out.println("Please enter second number : "); //input wizard
            int b = scanner.nextInt();
            System.out.println("Please enter on e of the symbol +,-,*,/ :"); // input wizard
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
//closing the scanner object
        scanner.close();
    }
}
