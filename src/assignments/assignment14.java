package assignments;
import java.util.Scanner;
public class assignment14 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a > b){
            System.out.printf(a + " is greater than " + b);
        }
        else if (a < b){
            System.out.printf(a + " is smaller than " + b);
        }
        else {
            System.out.println("Both numbers are equal");
        }
    }
}
