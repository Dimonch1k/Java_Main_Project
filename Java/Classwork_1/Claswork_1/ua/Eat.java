package Claswork_1.ua;

public enum Eat {

    // Food
    BURGER(250),
    PIZZA(250),
    SALAD(130),
    POTATO(150),
    MEAT(400),

    // Drinks
    COLA(50),
    WATER(15),
    MILK(40),
    COFFEE(60),
    TEA(30);




    private int price;

    Eat(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
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
