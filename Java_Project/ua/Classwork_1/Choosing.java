package ua.Classwork_1;

public class Choosing {

    // Customer choose food by number
    public void chooseFoodByNumber(OrderSmth order, double customerMoney, Audition audition) {
        System.out.println("Enter the number of food: ");       // The customer chose the number of food
        String number = ScannerManager.getInstance().next();
        if (audition.isInt(number)) {
            int drinkNumber = Integer.parseInt(number);         // Convert from String to Integer
            order.orderDrink(drinkNumber, customerMoney);       // Make order
        }
    }

    // Customer choose beverage by number
    public void chooseDrinkByNumber(OrderSmth order, double customerMoney, Audition audition) {
        System.out.println("Enter the number of food: ");       // The customer chose the number of food
        String number = ScannerManager.getInstance().next();

        if (audition.isInt(number)) {
            int drinkNumber = Integer.parseInt(number);         // Convert from String to Integer
            order.orderDrink(drinkNumber, customerMoney);       // Make order
        }
    }
}
