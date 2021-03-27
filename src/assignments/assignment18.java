package assignments;

public class assignment18 {
    public static void main(String[] args) {
        int i;

        int array [] = {18,22,13};

        int max = array[0];

        for ( i = 1; i< array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }

        System.out.println("Largest nuber is: " +max);
    }
}
