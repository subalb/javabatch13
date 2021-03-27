package assignments;
import java.util.Scanner;
public class assignment23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();
        int sum = 0;
        for(int i =1; i<n+1; i++)
        {
            sum = sum+i;
        }
        System.out.println("Sum is: "+ sum);

    }
}
