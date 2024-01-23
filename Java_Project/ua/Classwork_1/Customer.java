package ua.Classwork_1;

public record Customer(String name, int age, double money, boolean restaurantCard) {

    // Get customer name
    public String getName() { // Get customer name
        return name;
    }

    public int getAge() { // Get customer year
        return age;
    }

    public double getMoney() { // Get customer money
        return money;
    }

    public boolean isRestaurantCard() { // Return true or false
        return restaurantCard;
    }


    public static Eat[] _eats = new Eat[1000];



    static ShowInformation information = new Restaurant(); // Create object that show restaurant info
    static Choosing chooseNumber = new Choosing(); // Create object that give possibility to choose the food



    // Show menu info, call functions orderFood and orderDrink
    public void customerOrder(OrderSmth order, Questions question, Audition audition, Customer customer) {
        showMenuInformation(customer);

        orderFood(order, question, audition);   // Order Food
        orderDrink(order, question, audition);  // Order Beverage
    }

    private static void showMenuInformation(Customer customer) {
        information.showDiscount(customer);
        information.showMenu(customer);
    }


    // Order Food
    private void orderFood(OrderSmth order, Questions question, Audition audition) {
        System.out.println("Do you want to order any food?");
        String food = ScannerManager.getInstance().next();
        if (food.equalsIgnoreCase("yes")) {
            do {
                chooseNumber.chooseFoodByNumber(order, money, audition);
            } while (question.reOrder());                                   // Give the question about order the new drink
        } else {
            question.leaveRestaurant();
        }
    }


    // Order Beverage
    private void orderDrink(OrderSmth order, Questions question, Audition audition) {
        System.out.println("Do you want to order any beverage?");
        String food = ScannerManager.getInstance().next();

        if (food.equalsIgnoreCase("yes") || food.equalsIgnoreCase("y")) {
            do {
                chooseNumber.chooseFoodByNumber(order, money, audition);
            } while (question.reOrder()); // Give the question about order the new drink
        } else {
            question.leaveRestaurant();
        }
    }

    public boolean isDiscount() {
        return isRestaurantCard();
    }
}
