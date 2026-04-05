import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            double num1, num2, result;
            char op;

            System.out.println("\n************** MINI CALCULATOR ***********\n");

            System.out.println("Enter first number");
            num1 = scanner.nextDouble();
            System.out.println("Enter the second number");
            num2 = scanner.nextDouble();
            System.out.println("Enter the operation (+,-,/,*)");
            op = scanner.next().charAt(0);

            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println("RESULT : " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("RESULT : " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("RESULT : " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("RESULT : " + result);
                    } else {
                        System.out.println("The number cannot be divided by Zero!!");
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Try again");

            }
            System.out.print("Do you want to continue (y/n) :");
            char choice = scanner.next().toLowerCase().charAt(0);

            if (choice == 'n') {
                break;
            }
        }

        scanner.close();

    }
}
