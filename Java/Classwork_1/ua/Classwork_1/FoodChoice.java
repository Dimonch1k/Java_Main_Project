package ua.Classwork_1;

public class FoodChoice {
    static Audition audition =  new Audition();
    public void orderSomeFood(int choice, double money) {
        switch (choice) {
            case 1:
                audition.foodAudit(Eat.BURGER, money);
                break;
            case 2:
                audition.foodAudit(Eat.PIZZA, money);
                break;
            case 3:
                audition.foodAudit(Eat.SALAD, money);
                break;
            case 4:
                audition.foodAudit(Eat.POTATO, money);
                break;
            case 5:
                audition.foodAudit(Eat.MEAT, money);
                break;
            default:
                System.out.println("We haven't such food!!!");
                System.out.println("Please select another one.");
                break;
        }
    }
}
