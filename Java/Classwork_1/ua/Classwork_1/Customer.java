package ua.Classwork_1;

public record Customer(String name, int year, double money, boolean restaurantCard) {
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getMoney() {
        return money;
    }

    public boolean isRestaurantCard() {
        return restaurantCard;
    }

    static ShowInformation information = new Restaurant();
    static Choosing choseNumber = new Choosing();

    //static boolean IsCustomerDiscount = isDiscount();
    public void customerOrder(OrderSmth order, Questions question, Audition audition, Customer customer) {
        showMenuInformation(customer);
        do {
            orderFood(order, question, audition);   // Order Food
            orderDrink(order, question, audition);  // Order Beverage
            break;

        } while (true);
    }

    private static void showMenuInformation(Customer customer) {
        information.showDiscount(customer);
        information.showMenu();
    }

    private void orderFood(OrderSmth order, Questions question, Audition audition) {
        System.out.println("Do you want to order any food?");
        String food = ScannerManager.getInstance().next();

        if (food.equalsIgnoreCase("yes")) {
            do {
                choseNumber.choseFoodByNumber(order, money, audition);
            } while (question.reOrder());                                   // Give the question about order the new drink
        } else {
            question.leaveRestaurant();
        }
    }

    private void orderDrink(OrderSmth order, Questions question, Audition audition) {
        System.out.println("Do you want to order any beverage?");
        String food = ScannerManager.getInstance().next();

        if (food.equalsIgnoreCase("yes")) {
            do {
                choseNumber.choseFoodByNumber(order, money, audition);
            } while (question.reOrder());                                   // Give the question about order the new drink
        } else {
            question.leaveRestaurant();
        }
    }

    public boolean isDiscount()
    {
        return isRestaurantCard();
    }
}
