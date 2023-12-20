package Claswork_1.ua;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer("John", 25, 500.0);
        OrderSmth order = new Restaurant();
        ShowInformation info = new Restaurant();
        Question question = new Question();
        Audition audit = new Audition();
        info.showDiscount();
        info.showMenu();

        do
        {
            System.out.println("Do you want to order any food?");
            String food = scanner.next();

            if (food.toLowerCase().equals("yes"))
            {

                do {
                    System.out.println("Enter the number of food: "); // The customer chose the number of food
                    String number = scanner.next();
                    int foodNumber = Integer.parseInt(number);        // Convert from String to Integer
                    order.orderFood(foodNumber, customer.getMoney()); // Make order
                } while (question.reOrder(scanner) != 0);             // Give the question about order the new food
            }else {
                question.leaveRestaurant();
            }

            System.out.println("Do you want to order any beverage?");
            String drink = scanner.next();
            if (drink.toLowerCase().equals("yes")) {
                do {
                    System.out.println("Enter the number of drink: ");  // The customer chose the number of drink
                    String number = scanner.next();
                    if (!audit.dataType(drink)) {
                        int drinkNumber = Integer.parseInt(number);         // Convert from String to Integer
                        order.orderDrink(drinkNumber, customer.getMoney()); // Make order
                    }
                } while (question.reOrder(scanner) != 0);               // Give the question about order the new drink
            }else {
                System.out.println("Do you want to leave the restaurant?");
                String answer = scanner.next();
                if (answer.equals("yes")) System.exit(0);
            }


        } while (true);


    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
