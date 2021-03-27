package assignments;
import java.util.Scanner;
public class assignment26 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number is: " + reversed);
    }
}
