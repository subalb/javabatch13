package assignments;

public class assignment28
{
    public static void main(String[] args)
    {
        int num = 3;
        isPrimeNumber(num);
        nthPrimeNumber(num);
        allPrimeBetween(3,20);
    }

    public static void isPrimeNumber(int n)
    {
        int i,m =0;
        int flag = 0;
        if (n == 0 || n == 1)
        {
            System.out.println(n + " is not prime number");
        }
        else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }
        System.out.println("------------------------");
    }


    public static void nthPrimeNumber(int number)
    {
        int num, count, i;
        num=1;
        count=0;

        while (count < number){
            num=num+1;
            for (i = 2; i <= num; i++){
                if (num % i == 0) {
                    break;
                }
            }
            if ( i == num){
                count = count+1;
            }
        }
        System.out.println("Value of nth prime: " + num);
        System.out.println("----------------");
    }

    public static void allPrimeBetween(int number1, int number2)
    {

        int a= number1;
        int b=number2;
        int i, j, flag;
        //a = num1
        for (i = a; i <= b; i++) {


            if (i == 1 || i == 0)
                continue;


            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }


            if (flag == 1)
                System.out.println(i);
        }
        System.out.println("----------------------");
    }
}
