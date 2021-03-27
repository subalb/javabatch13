package assignments;

public class assignment27 {
    public static void main(String[] args) {
        int n = 456;
        int sum = 0;
        int prod = 1;
        while(n!=0)
        {
            sum = sum+n%10;
            prod = prod *(n%10);
            n=n/10;
        }
        System.out.println("Sum is: " +sum);
        System.out.println("Product is: " +prod);
    }
}

