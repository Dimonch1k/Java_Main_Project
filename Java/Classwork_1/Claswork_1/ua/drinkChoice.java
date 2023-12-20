package Claswork_1.ua;

public class drinkChoice {
    public void orderSomeDrink(int choice, double money) {
        switch (choice) {
            case 1:
                drinkAudit(Drink.COLA, money);
                break;
            case 2:
                drinkAudit(Drink.WATER, money);
                break;
            case 3:
                drinkAudit(Drink.MILK, money);
                break;
            case 4:
                drinkAudit(Drink.COFFEE, money);
                break;
            case 5:
                drinkAudit(Drink.TEA, money);
                break;
            default:
                System.out.println("We haven't such drink!!!");
                System.out.println("Please select another one.");
                break;
        }
    }
    public void drinkAudit(Drink someDrink, double money) { // Make audit: is this food more expensive than the amount of money
        // and make operations
        if (someDrink.getPrice() > money)
        {
            System.out.println("You don't have enough money.");
            return;
        }
        System.out.println("You have ordered " + someDrink);
        System.out.println("Price: " + someDrink.getPrice());
        money -= someDrink.getPrice();
        System.out.println("You have: " + money);
    }
}
