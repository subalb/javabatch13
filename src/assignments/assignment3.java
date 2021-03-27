package assignments;
import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        System.out.println("Sum is " + (a+b));
        System.out.println("Average is " + (a+b)/2);

    }
}
