package assignments;
import java.util.Scanner;
public class assignment25 {
    public static void main(String[] args) {
        String name = null;
        int count;
        double score = 0;
        double highest = 0;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter the number of student : ");
        int num = input.nextInt();
        String[] names = new String[num];
        int[] scores = new int[num];
        int index =0;
        for (count=0; count<num; count++)
        {
            System.out.print("Enter Student name : ");
            names[count] = input.next();
            System.out.print("Score is: ");
            scores[count] = input.nextInt();
            score = scores[count];
            if(score> highest){
                highest = score;
                index = count;
            }


        }
        System.out.print("The highest score : " + scores[index] +" is secured by " + names[index]);
    }
}
