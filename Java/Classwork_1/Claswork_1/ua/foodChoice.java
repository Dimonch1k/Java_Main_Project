package Claswork_1.ua;

public class foodChoice {
    public void orderSomeFood(int choice, double money) {
        switch (choice) {
            case 1:
                foodAudit(Eat.BURGER, money);
                break;
            case 2:
                foodAudit(Eat.PIZZA, money);
                break;
            case 3:
                foodAudit(Eat.SALAD, money);
                break;
            case 4:
                foodAudit(Eat.POTATO, money);
                break;
            case 5:
                foodAudit(Eat.MEAT, money);
                break;
            default:
                System.out.println("We haven't such food!!!");
                System.out.println("Please select another one.");
                break;
        }
    }
    public void foodAudit(Eat someEat, double money) { // Make audit: is this food more expensive than the amount of money
                                                    // and make operations
        if (someEat.getPrice() > money)
        {
            System.out.println("You don't have enough money.");
            return;
        }
        System.out.println("You have ordered " + someEat);
        System.out.println("Price: " + someEat.getPrice());
        money -= someEat.getPrice();
        System.out.println("You have: " + money);
    }
}
