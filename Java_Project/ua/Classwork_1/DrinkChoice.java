package ua.Classwork_1;

public class DrinkChoice {
    static Audition audition = new Audition();
    public void orderSomeDrink(int choice, double money) {
        switch (choice) {
            case 1:
                audition.drinkAudit(Drink.COLA, money);

                break;
            case 2:
                audition.drinkAudit(Drink.WATER, money);
                break;
            case 3:
                audition.drinkAudit(Drink.MILK, money);
                break;
            case 4:
                audition.drinkAudit(Drink.COFFEE, money);
                break;
            case 5:
                audition.drinkAudit(Drink.TEA, money);
                break;
            default:
                System.out.println("We haven't such drink!!!");
                System.out.println("Please select another one.");
                break;
        }
    }

}
