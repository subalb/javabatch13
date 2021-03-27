package assignments;
import java.util.Scanner;

public class assignment16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number: ");
        int a = input.nextInt();
        if(a/2==0){
            System.out.println(a+" is even");
        }
        else
        {
            System.out.println(a+ " is odd");
        }

    }
}
