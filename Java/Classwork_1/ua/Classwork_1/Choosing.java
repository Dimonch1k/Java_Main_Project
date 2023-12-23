package ua.Classwork_1;

public class Choosing {
    public void choseFoodByNumber(OrderSmth order, double customerMoney, Audition audition) {
        System.out.println("Enter the number of food: ");       // The customer chose the number of food
        String number = ScannerManager.getInstance().next();
        if (audition.isInt(number)) {
            int drinkNumber = Integer.parseInt(number);         // Convert from String to Integer
            order.orderDrink(drinkNumber, customerMoney);       // Make order
        }
    }

    public void choseDrinkByNumber(OrderSmth order, double customerMoney, Audition audition) {
        System.out.println("Enter the number of food: ");       // The customer chose the number of food
        String number = ScannerManager.getInstance().next();

        if (audition.isInt(number)) {
            int drinkNumber = Integer.parseInt(number);         // Convert from String to Integer
            order.orderDrink(drinkNumber, customerMoney);       // Make order
        }
    }
}
