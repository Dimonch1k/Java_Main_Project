package Claswork_1.ua;

public class Restaurant implements OrderSmth, ShowInformation {
    static Discount foodDiscount = new Discount(10);
    static Discount drinkDiscount = new Discount(15);
    @Override
    public void showMenu() {
        if(countDiscount()){
            System.out.println("\n\nDiscounting MENU:");
        } else{
            System.out.println("\n\nMENU:");
        }
        System.out.println("\tFOOD:");
        System.out.println("\t\t1. Burger - " + Eat.BURGER.getPrice());
        System.out.println("\t\t2. Pizza - " + Eat.PIZZA.getPrice());
        System.out.println("\t\t3. Salad - " + Eat.SALAD.getPrice());
        System.out.println("\t\t4. Potato - " + Eat.POTATO.getPrice());
        System.out.println("\t\t5. Meat\n - " + Eat.MEAT.getPrice());

        System.out.println("\tDRINKS:");
        System.out.println("\t\t1. Cola - " + Eat.COLA.getPrice());
        System.out.println("\t\t2. Water - " + Eat.WATER.getPrice());
        System.out.println("\t\t3. Milk - " + Eat.MILK.getPrice());
        System.out.println("\t\t4. Coffee - " + Eat.COFFEE.getPrice());
        System.out.println("\t\t5. Tea - " + Eat.TEA.getPrice());
    }
    @Override
    public void showDiscount() {
        System.out.println("Discount for food: " + foodDiscount + "%");
        System.out.println("Discount for drinks: " + drinkDiscount + "%\n");
    }


    @Override
    public void orderFood(int choice) {
        foodChoice.
    }

    @Override
    public void orderDrink(int drinkChoice) {

    }

    public static boolean countDiscount() {
        // Food
        Eat.BURGER.setPrice(Eat.BURGER.getPrice() - ((Eat.BURGER.getPrice() / 100) * foodDiscount.discount()));
        Eat.PIZZA.setPrice(Eat.PIZZA.getPrice() - ((Eat.PIZZA.getPrice() / 100) * foodDiscount.discount()));
        Eat.SALAD.setPrice(Eat.SALAD.getPrice() - ((Eat.SALAD.getPrice() / 100) * foodDiscount.discount()));
        Eat.POTATO.setPrice(Eat.POTATO.getPrice() - ((Eat.POTATO.getPrice() / 100) * foodDiscount.discount()));
        Eat.MEAT.setPrice(Eat.MEAT.getPrice() - ((Eat.MEAT.getPrice() / 100) * foodDiscount.discount()));

        // Drinks
        Eat.COLA.setPrice(Eat.COLA.getPrice() - ((Eat.COLA.getPrice() / 100) * drinkDiscount.discount()));
        Eat.WATER.setPrice(Eat.WATER.getPrice() - ((Eat.WATER.getPrice() / 100) * drinkDiscount.discount()));
        Eat.MILK.setPrice(Eat.MILK.getPrice() - ((Eat.MILK.getPrice() / 100) * drinkDiscount.discount()));
        Eat.COFFEE.setPrice(Eat.COFFEE.getPrice() - ((Eat.COFFEE.getPrice() / 100) * drinkDiscount.discount()));
        Eat.TEA.setPrice(Eat.TEA.getPrice() - ((Eat.TEA.getPrice() / 100) * drinkDiscount.discount()));

        return true;
    }
}