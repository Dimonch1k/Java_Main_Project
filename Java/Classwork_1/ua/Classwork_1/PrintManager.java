package ua.Classwork_1;


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


    public static void discountDrinkAndFood(Customer customer) {
        if (customer.isDiscount()){
            System.out.println("Discount for food: " + Discount.foodCardDiscount() + "%");
            System.out.println("Discount for drinks: " + Discount.drinkCardDiscount() + "%\n");
        }
        System.out.println("You haven't any discount for food and drinks.");

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


}
