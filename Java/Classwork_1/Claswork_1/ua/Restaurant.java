package Claswork_1.ua;

public class Restaurant implements OrderSmth, ShowInformation {
    static Discount foodDiscount = new Discount(10);
    static Discount drinkDiscount = new Discount(15);
    static foodChoice food = new foodChoice();
    static drinkChoice drink = new drinkChoice();

    @Override
    public void showMenu() // Show Food menu and Drink menu
    {

        countDiscount();
        System.out.println("\n\nDiscounting MENU:");

        System.out.println("\tFOOD:");
        System.out.println("\t\t1. Burger - " + Eat.BURGER.getPrice());
        System.out.println("\t\t2. Pizza - " + Eat.PIZZA.getPrice());
        System.out.println("\t\t3. Salad - " + Eat.SALAD.getPrice());
        System.out.println("\t\t4. Potato - " + Eat.POTATO.getPrice());
        System.out.println("\t\t5. Meat - " + Eat.MEAT.getPrice());

        System.out.println("\tDRINKS:");
        System.out.println("\t\t1. Cola - " + Drink.COLA.getPrice());
        System.out.println("\t\t2. Water - " + Drink.WATER.getPrice());
        System.out.println("\t\t3. Milk - " + Drink.MILK.getPrice());
        System.out.println("\t\t4. Coffee - " + Drink.COFFEE.getPrice());
        System.out.println("\t\t5. Tea - " + Drink.TEA.getPrice());
    }
    @Override
    public void showDiscount() // Show the discount
    {
        System.out.println("Discount for food: " + foodDiscount.discount() + "%");
        System.out.println("Discount for drinks: " + drinkDiscount.discount() + "%\n");
    }


    @Override
    public void orderFood(int choiceNumber, double money) { // The customer make choice of food
        food.orderSomeFood(choiceNumber, money);
    }
    @Override
    public void orderDrink(int drinkChoice, double money) { // The customer make choice of drink
        drink.orderSomeDrink(drinkChoice, money);
    }

    public static void countDiscount()
    {
        // Food
        Eat.BURGER.setPrice(Eat.BURGER.getPrice() - ((Eat.BURGER.getPrice() / 100) * foodDiscount.discount()));
        Eat.PIZZA.setPrice(Eat.PIZZA.getPrice() - ((Eat.PIZZA.getPrice() / 100) * foodDiscount.discount()));
        Eat.SALAD.setPrice(Eat.SALAD.getPrice() - ((Eat.SALAD.getPrice() / 100) * foodDiscount.discount()));
        Eat.POTATO.setPrice(Eat.POTATO.getPrice() - ((Eat.POTATO.getPrice() / 100) * foodDiscount.discount()));
        Eat.MEAT.setPrice(Eat.MEAT.getPrice() - ((Eat.MEAT.getPrice() / 100) * foodDiscount.discount()));

        // Drinks
        Drink.COLA.setPrice(Drink.COLA.getPrice() - ((Drink.COLA.getPrice() / 100) * drinkDiscount.discount()));
        Drink.WATER.setPrice(Drink.WATER.getPrice() - ((Drink.WATER.getPrice() / 100) * drinkDiscount.discount()));
        Drink.MILK.setPrice(Drink.MILK.getPrice() - ((Drink.MILK.getPrice() / 100) * drinkDiscount.discount()));
        Drink.COFFEE.setPrice(Drink.COFFEE.getPrice() - ((Drink.COFFEE.getPrice() / 100) * drinkDiscount.discount()));
        Drink.TEA.setPrice(Drink.TEA.getPrice() - ((Drink.TEA.getPrice() / 100) * drinkDiscount.discount()));
    }
}