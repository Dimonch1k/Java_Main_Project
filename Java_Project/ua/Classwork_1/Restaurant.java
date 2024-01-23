package ua.Classwork_1;


public class Restaurant implements OrderSmth, ShowInformation {
    static FoodChoice food = new FoodChoice();
    static DrinkChoice drink = new DrinkChoice();

    @Override
    public void showMenu(Customer customer) // Show Food menu and Drink menu
    {
        Discount.countFoodDiscount(customer.isRestaurantCard());
        Discount.countDrinkDiscount(customer.isRestaurantCard());
        PrintManager.displayDiscountingMenu();
    }

    @Override
    public void showDiscount(Customer customer) // Show the discount
    {
        PrintManager.discountDrinkAndFood(customer);
    }

    @Override // User order some food
    public void orderFood(int choiceNumber, double money) { // The customer make choice of food
        food.orderSomeFood(choiceNumber, money);
    }

    @Override // User order some drink
    public void orderDrink(int drinkChoice, double money) { // The customer make choice of drink
        drink.orderSomeDrink(drinkChoice, money);
    }
}