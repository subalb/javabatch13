package assignments;
import java.util.Scanner;
public class assignment12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter roll ");
        int roll = input.nextInt();
        System.out.println("Enter name");
        String name = input.next();
        System.out.println("Enter nationality");
        String nation= input.next();
        System.out.println("My name is "+ name +". My roll number is " +
                roll + ". My nationality is " + nation + ".");


    }
}
