package assignments;

public class assignment29 {
    public static void main(String[] args) {
        int num = 7;
        int fact = 1;
        int a =0;
        int j =1;
        int i =1;
        for(j = 1; j<num; j++)
        {
            for (i = 1; i < j + 1; i++)
            {
                fact = fact * i;
            }
            a=a+(i/fact);
        }
        System.out.println("a =" +a);
    }
}
