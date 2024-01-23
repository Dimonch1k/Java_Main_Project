package ua.Classwork_1;


import java.sql.SQLOutput;

public final class PrintManager {
    private PrintManager() {}


    // RESTAURANT
    public static void foodMenu() {                                             // FOOD MENU
        System.out.println("\tFOOD:");
        System.out.println("\t\t1. Burger - " + Eat.BURGER.getPrice());
        System.out.println("\t\t2. Pizza - " + Eat.PIZZA.getPrice());
        System.out.println("\t\t3. Salad - " + Eat.SALAD.getPrice());
        System.out.println("\t\t4. Potato - " + Eat.POTATO.getPrice());
        System.out.println("\t\t5. Meat - " + Eat.MEAT.getPrice());
    }

    public static void drinkMenu() {                                            // DRINK MENU
        System.out.println("\tDRINKS:");
        System.out.println("\t\t1. Cola - " + Drink.COLA.getPrice());
        System.out.println("\t\t2. Water - " + Drink.WATER.getPrice());
        System.out.println("\t\t3. Milk - " + Drink.MILK.getPrice());
        System.out.println("\t\t4. Coffee - " + Drink.COFFEE.getPrice());
        System.out.println("\t\t5. Tea - " + Drink.TEA.getPrice());
    }


    // DISCOUNTS

    public static void discountDrinkAndFood(Customer customer) {
        if (customer.isDiscount()){
            System.out.println("\nDiscount for food: " + isFoodDiscount(customer.isRestaurantCard()) + "%");
            System.out.println("Discount for drinks: " + isDrinkDiscount(customer.isRestaurantCard()) + "%");
            return;
        }
        System.out.println("You haven't any discount for food and drinks.");

    }
    public static int isFoodDiscount(boolean isDiscountCard) {
        return isDiscountCard ? 15 : 0;
    }

    public static int isDrinkDiscount(boolean isDiscountCard) {
        return isDiscountCard ? 10 : 0;
    }

    public static void displayDiscountingMenu() {
        System.out.println("\n\n\tDiscounting MENU:");
        System.out.println("\t\tFood:");
        System.out.println("\t\t\t1. Burger - " + Eat.BURGER.getPrice());
        System.out.println("\t\t\t2. Pizza - " + Eat.PIZZA.getPrice());
        System.out.println("\t\t\t3. Salad - " + Eat.SALAD.getPrice());
        System.out.println("\t\t\t4. Potato - " + Eat.POTATO.getPrice());
        System.out.println("\t\t\t5. Meat - " + Eat.MEAT.getPrice());
        System.out.println("\t\tDrinks:");
        System.out.println("\t\t\t1. Cola - " + Drink.COLA.getPrice());
        System.out.println("\t\t\t2. Water - " + Drink.WATER.getPrice());
        System.out.println("\t\t\t3. Milk - " + Drink.MILK.getPrice());
        System.out.println("\t\t\t4. Coffee - " + Drink.COFFEE.getPrice());
        System.out.println("\t\t\t5. Tea - " + Drink.TEA.getPrice());
    }



    // AUDITION
    public static void moneyProblems() {                               // Notice about lack of money
        System.out.println("You don't have enough money.");
    }

    public static void whatFoodCustomerOrdered(Eat someEat)            // What food customer ordered
    {
        System.out.println("You have ordered " + someEat);
        System.out.println("Price: " + someEat.getPrice());
    }

    public static void whatDrinkCustomerOrdered(Drink someDrink)       // What drink customer ordered
    {
        System.out.println("You have ordered " + someDrink);
        System.out.println("Price: " + someDrink.getPrice());
    }

    public static void customerMoney(double money) {                   // Customers money
        System.out.println("You have: " + money);
    }


    public static void printCheck(Customer customer) {
        System.out.println("-------------------------------------------------");
        System.out.println("------------- RESTAURANT UKRAINE ----------------");
        System.out.println("- Location: Ukraine. Lviv. Independence Street 1.");
        System.out.println("- Number:  +380(68) 777 77 77");
        System.out.println("-------------------------------------------------");
        System.out.println("----------------- YOUR ORDERS -------------------");
        System.out.println("- ");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        System.out.println("- Name: " + customer.name());
        System.out.println("- Name: " + customer.name());
    }
}
