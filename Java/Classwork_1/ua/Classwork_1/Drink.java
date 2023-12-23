package ua.Classwork_1;

public enum Drink {
    // Drinks
    COLA(50),
    WATER(15),
    MILK(40),
    COFFEE(60),
    TEA(30);

    private double price;

    Drink(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public static Drink getDrinkByString(String value)
    {
        String temp = value.toUpperCase();
        for(Drink drink : Drink.values())
        {
            if(drink.name().equals(temp))
            {
                return drink;
            }
        }
        return null;
    }
}
