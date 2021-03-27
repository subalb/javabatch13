package assignments;
import java.util.Scanner;
public class assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius");
        float r = input.nextInt();
        System.out.println("Enter length");
        float l = input.nextInt();
        float volume = (float) (3.14*r*r*l);
        System.out.println("Volume is : "+ volume);
    }
}
