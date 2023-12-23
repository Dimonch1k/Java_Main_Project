package ua.Classwork_1;

public class Audition {
    public boolean isInt(String string) { // I MUST DO THIS CORRECTLY

        if (string.matches("\\d+")) { // I DID THIS INCORRECTLY
            return false;
        }
        System.out.println("Error.");
        System.out.println("Please input number to choose.");
        return true;
    }

    public void foodAudit(Eat someEat, double money) { // Make audit: is this food more expensive than the amount of money
                                                       // and make operations
        if (someEat.getPrice() > money) {
            PrintManager.moneyProblems();
            return;
        }
        PrintManager.whatFoodCustomerOrdered(someEat);
        money -= someEat.getPrice();
        PrintManager.customerMoney(money);
    }

    public void drinkAudit(Drink someDrink, double money) { // Make audit: is this drink more expensive than the amount of money
                                                            // and make operations
        if (someDrink.getPrice() > money) {
            PrintManager.moneyProblems();
            return;
        }
        PrintManager.whatDrinkCustomerOrdered(someDrink);
        money -= someDrink.getPrice();
        PrintManager.customerMoney(money);
    }
}
