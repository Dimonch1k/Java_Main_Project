package ua.Classwork_1;

public enum Eat {

    // Food
    BURGER(250),
    PIZZA(300),
    SALAD(130),
    POTATO(150),
    MEAT(400);


    private double price;
    private boolean isRemoved;


    public boolean getRemove() {
        return isRemoved;
    }
    public void setRemoved() {
        this.isRemoved = true;
    }
    Eat(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Eat getEatByString(String value) {
        for (Eat eat : Eat.values()) {
            if (eat.name().equalsIgnoreCase(value)) {
                return eat;
            }
        }
        return null;
    }

    public static void deleteEat(String value) {
        for (Eat eat : Eat.values()) {
            if (eat.name().equalsIgnoreCase(value)) {
                eat.
            }
        }
    }
}
