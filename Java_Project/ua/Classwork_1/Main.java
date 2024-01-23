package ua.Classwork_1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John", 25, 500.0, true);
        OrderSmth order = new Restaurant();
        Questions question = new Questions();
        Audition audit = new Audition();

        customer.customerOrder(order, question, audit, customer);
    }


}
/*public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
}*/