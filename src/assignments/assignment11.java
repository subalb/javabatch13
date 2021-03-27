package assignments;

public class assignment11 {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping using temp:");
        System.out.println("a is: " + a);
        System.out.println("b is: "+b);


        int c = 12;
        int d = 5;
        c= c+d;
        d = c-d;
        c = c-d;
        System.out.println("After swapping without temp:");
        System.out.println("c is: "+c);
        System.out.println("d is: "+d);

    }
}
