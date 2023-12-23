package ua.Classwork_1;

public record Discount()
{
    static int foodDiscount = 15;
    static int drinkDiscount = 10;
    public static int foodCardDiscount() {
        return foodDiscount;
    }
    public static int drinkCardDiscount() {
        return drinkDiscount;
    }

    public static void countDiscount()
    {
        // Food
        Eat.BURGER.setPrice(Eat.BURGER.getPrice() - ((Eat.BURGER.getPrice() / 100) * foodDiscount));
        Eat.PIZZA.setPrice(Eat.PIZZA.getPrice() - ((Eat.PIZZA.getPrice() / 100) * foodDiscount));
        Eat.SALAD.setPrice(Eat.SALAD.getPrice() - ((Eat.SALAD.getPrice() / 100) * foodDiscount));
        Eat.POTATO.setPrice(Eat.POTATO.getPrice() - ((Eat.POTATO.getPrice() / 100) * foodDiscount));
        Eat.MEAT.setPrice(Eat.MEAT.getPrice() - ((Eat.MEAT.getPrice() / 100) * foodDiscount));

        // Drinks
        Drink.COLA.setPrice(Drink.COLA.getPrice() - ((Drink.COLA.getPrice() / 100) * drinkDiscount));
        Drink.WATER.setPrice(Drink.WATER.getPrice() - ((Drink.WATER.getPrice() / 100) * drinkDiscount));
        Drink.MILK.setPrice(Drink.MILK.getPrice() - ((Drink.MILK.getPrice() / 100) * drinkDiscount));
        Drink.COFFEE.setPrice(Drink.COFFEE.getPrice() - ((Drink.COFFEE.getPrice() / 100) * drinkDiscount));
        Drink.TEA.setPrice(Drink.TEA.getPrice() - ((Drink.TEA.getPrice() / 100) * drinkDiscount));
    }
}