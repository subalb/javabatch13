package assignments;
import java.lang.Math;
public class assignment10 {
    public static void main(String[] args) {
        double u = 5;
        double t = 10;
        double a = 15;
        double b = 12;
        double c = 5;
        double s = (double)(a+b+c)/2;
        System.out.println("s = "+ (double)(u*t+0.5*a*t*t));
        System.out.println("area = " + (double) (Math.sqrt(s*(s-a)*(s-b)*(s-c))));

        a = 10;
        b = 12;
        c = 2;
        System.out.println("x = " + (double)((-b+Math.sqrt(b*b-4*a*c))/2*a));
    }
}
