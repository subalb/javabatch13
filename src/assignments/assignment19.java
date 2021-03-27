package assignments;
import java.util.Scanner;
public class assignment19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first side");
        int a = input.nextInt();
        System.out.println("Enter second side");
        int b = input.nextInt();
        System.out.println("Enter third side");
        int c = input.nextInt();
        if(a<=0 || b<=0 || c<=0)
            System.out.println("InvalidInput");
        else if(a>=(b+c) || c>=(b+a) || b>=(a+c))
            System.out.println("Not a Triangle");
        else if(a==b && b==c)
            System.out.println("Equilateral Triangle");
        else if(((a*a)+(b*b))==(c*c) || ((a*a)+(c*c))==(b*b) || ((c*c)+(b*b))==(a*a))
            System.out.println("Right Triangle");
        else if(a!=b && b!=c && c!=a)
            System.out.println("Scalene Triangle");
        else if(a==b || c==a || c==b)
            System.out.println("Isosceles Triangle");
    }
}
