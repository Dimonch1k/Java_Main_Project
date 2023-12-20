package Claswork_1.ua;

public record Customer(String name, int year, double money) {
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public double getMoney() {
        return money;
    }
}
