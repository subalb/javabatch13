package assignments;
import java.util.Scanner;
public class assignment32 {
    public static void main(String[] args) {
        int[] array = {1, 24, 31, 45, 5, 10};
        int sum = 0;
        int i =0;
        while(i<5)
        {
            sum = sum+array[i];
            i+=1;
        }
        System.out.println("Sum of array elements is:"+sum);
    }
}
