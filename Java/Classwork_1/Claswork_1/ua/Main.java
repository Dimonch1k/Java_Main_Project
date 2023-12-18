package Claswork_1.ua;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Customer customer = new Customer("John", 25, 500);

        ShowInformation info = new Restaurant();

        info.showMenu();


        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            System.out.println("Do you want to order any food?");
            String Food = scanner.next();

            if (Food.equals("yes"))
            {
                System.out.println("Take the number of food: ");
                String foodNumber = scanner.next();
                if (foodNumber.equals("1") || foodNumber.equals("2") || foodNumber.equals("3") || foodNumber.equals("4") || foodNumber.equals("5"))
                {
                    info.orderFood(foodNumber);
                }
            }
        }


    }
}
