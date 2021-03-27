package assignments;

public class assignment17 {
    public static void main(String[] args) {
        int year1 = 2000;
        int year2 = 2006;
        if (year1 % 4 == 0) {
            if (year1 % 100 == 0) {
                if (year1 % 400 == 0) {
                    System.out.println(year1 + " is a leap year");
                } else
                    System.out.println(year1 + " is not a leap year");
            } else
                System.out.println(year1 + " is not a leap year");

        } else
            System.out.println(year1 + " is not a leap year");


        if (year2 % 4 == 0) {
            if (year2 % 100 == 0) {
                if (year2 % 400 == 0) {
                    System.out.println(year2 + " is a leap year");
                } else
                    System.out.println(year2 + " is not a leap year");
            } else
                System.out.println(year2 + " is not a leap year");

        } else
            System.out.println(year2 + " is not a leap year");
    }
}
