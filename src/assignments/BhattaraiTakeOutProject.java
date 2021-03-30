
import java.util.Scanner;


public class BhattaraiTakeOutProject {
    public static void main(String[] args)
    {
        int feeds = 0;
        double price = 0;
        double taxrate = 0.07;
        double tiprate = 0.15;

        System.out.println("How many people are ordering?");
        Scanner input = new Scanner(System.in);
        int people = input.nextInt();
        if(people <10)
        {
            System.out.println("Number is invalid. Enter at least 10");
            System.exit(0);
        }
        displayMainMenu();
        int meal_type = input.nextInt();
        while(meal_type <1 || meal_type >3)
        {
            System.out.println("Invalid input. Enter again");
            displayMainMenu();
            meal_type = input.nextInt();
        }


        switch (meal_type)
        {
            case 1:
                displayItalianFoodMenu();
                int choice = input.nextInt();
                switch(choice){
                    case 1:
                        feeds = 5;
                        price = 17.99;
                        break;
                    case 2:
                        feeds = 7;
                        price = 15.99;
                        break;
                    case 3:
                        feeds = 4;
                        price = 12.99;
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;
            case 2:
                displayChineseFoodMenu();
                choice = input.nextInt();
                switch(choice){
                    case 1:
                        feeds = 7;
                        price = 18.99;
                        break;
                    case 2:
                        feeds = 7;
                        price = 18.99;
                        break;
                    case 3:
                        feeds = 5;
                        price = 10.99;
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;
            case 3:
                displayAmericanFoodMenu();
                choice = input.nextInt();
                switch(choice){
                    case 1:
                        feeds = 8;
                        price = 21.99;
                        break;
                    case 2:
                        feeds = 5;
                        price = 22.99;
                        break;
                    case 3:
                        feeds = 10;
                        price = 26.99;
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;
            default :
                System.out.println("Please enter a valid number");
        }


        int trays = determineTrays(people,feeds);


        double subTotal = getSubtotal(price, trays);

        double taxPrice = getTax(subTotal,taxrate);

        double tipRate = getTip(subTotal, tiprate);


        double grandTotal = getGrandTotal(subTotal,taxPrice, tipRate);

        double pricePerPerson = pricePerPerson(grandTotal, people);


        int leftOver = determineLeftOvers(feeds, trays, people);

        System.out.println("You need " + trays + " trays");
        System.out.println("Feeds: "+ feeds);
        System.out.println("Price for " + people + " people (" + trays + " trays ):" + subTotal);
        System.out.println("Tax:" + taxPrice);
        System.out.println("Tip:" +tipRate);
        System.out.println("Total ( food , tax , tip ): " + grandTotal);
        System.out.println("Price per person :" + pricePerPerson);
        System.out.println("Leftover servings for the delivery person :" + leftOver);



    }

    public static void displayMainMenu()
    {
        System.out.println("CHOOSE TYPE OF MEAL");
        System.out.println("----------------------");
        System.out.println(" 1. Italian");
        System.out.println(" 2. Chinese");
        System.out.println(" 3. American");
        System.out.println(" Choose what type of food you'd like to order: ");

    }
    public static void displayItalianFoodMenu()
    {
        System.out.println("CHOOSE ONE");
        System.out.println("-------------------");
        System.out.println("1. Lasagna Tray - Feeds 5 - 17.99");
        System.out.println("2. Pizza Pack - Feeds 7 - 15.99");
        System.out.println("3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");
        System.out.println("Enter choice");

    }
    public static void displayChineseFoodMenu()
    {
        System.out.println("CHOOSE ONE");
        System.out.println("------------------");
        System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99");
        System.out.println("2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99");
        System.out.println("3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99");
        System.out.println("Enter Choice");
    }
    public static void displayAmericanFoodMenu()
    {
        System.out.println("CHOOSE ONE");
        System.out.println("-------------------");
        System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99");
        System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 - 22.99");
        System.out.println("3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99");
        System.out.println("Enter Choice ( 1 - 3 )");
    }
    public static int determineTrays(int people, int feeds)
    {
        int num_of_trays = people/feeds;
        if (people % feeds!=0)
        {
            num_of_trays+=1;
        }
        return num_of_trays;
    }
    public static double getSubtotal(double price, int trays)
    {
        double sub_total = 0;
        sub_total = price*trays;
        return sub_total;
    }
    public static double getTax(double subtotal, double taxrate)
    {
        double tax = 0;
        tax = subtotal*taxrate;
        return tax;
    }
    public static double getTip(double subtotal, double tipRate)
    {
        double tip = 0;
        tip = subtotal*tipRate;
        return tip;
    }
    public static double getGrandTotal(double subtotal, double tax, double tip)
    {
        double total = 0;
        total = subtotal + tax + tip;
        return total;
    }
    public static double pricePerPerson(double grandTotal, int people)
    {
        double pricePerPerson;
        pricePerPerson = grandTotal/people;
        return pricePerPerson;
    }
    public static int determineLeftOvers(int feeds, int trays, int people)
    {
        int determineLeftOvers;
        determineLeftOvers =  (feeds*trays) - people;
        return determineLeftOvers;
    }
}
