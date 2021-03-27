package assignments;
import java.util.Scanner;
public class assignment33 {
    public static void main(String[] args) {
        int n, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        n = input.nextInt();

        //integer array object
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = input.nextInt();
        }

        //sorting elements
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        //print sorted elements
        System.out.println("Ascending Order:");
        for (int i = 0; i < n ; i++)
        {
            System.out.println(a[i]);
        }
    }
}

