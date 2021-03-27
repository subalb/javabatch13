package assignments;
import java.util.Scanner;
public class assignment20 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double first = input.nextDouble();
        double second = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result = 0.0;

        switch (operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            default:
                System.out.println("Incorrect operator");
                return;
        }

        System.out.println(first + " " + operator + " " + second + " = " + result);
    }
}


