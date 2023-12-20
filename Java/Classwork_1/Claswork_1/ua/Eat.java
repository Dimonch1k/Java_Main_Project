package Claswork_1.ua;

public enum Eat {

    // Food
    BURGER(250),
    PIZZA(300),
    SALAD(130),
    POTATO(150),
    MEAT(400);


    private double price;
    Eat(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public static Eat getEatByString(String value)
    {
        String temp = value.toUpperCase();
        for(Eat eat : Eat.values())
        {
            if(eat.name().equals(temp))
            {
                return eat;
            }
        }
        return null;
    }
}
