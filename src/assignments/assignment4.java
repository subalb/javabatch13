package assignments;
import java.util.Scanner;
public class assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter P");
        float p = input.nextInt();
        System.out.println("Enter T");
        float t = input.nextInt();
        System.out.println("Enter R");
        float r = input.nextInt();
        System.out.println("Simple interest is " + (p*t*r)/100);

    }
}
