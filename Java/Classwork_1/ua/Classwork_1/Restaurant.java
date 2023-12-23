package ua.Classwork_1;


public class Restaurant implements OrderSmth, ShowInformation {
    static FoodChoice food = new FoodChoice();
    static DrinkChoice drink = new DrinkChoice();

    @Override
    public void showMenu() // Show Food menu and Drink menu
    {
        Discount.countDiscount();
        PrintManager.displayDiscountingMenu();
    }

    @Override
    public void showDiscount(Customer customer) // Show the discount
    {
        PrintManager.discountDrinkAndFood(customer);
    }

    @Override
    public void orderFood(int choiceNumber, double money) { // The customer make choice of food
        food.orderSomeFood(choiceNumber, money);
    }

    @Override
    public void orderDrink(int drinkChoice, double money) { // The customer make choice of drink
        drink.orderSomeDrink(drinkChoice, money);
    }

}