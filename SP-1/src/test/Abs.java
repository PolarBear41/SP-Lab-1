package test;

public abstract class Abs implements Dish {
    protected String name;
    protected int price;

    public Abs(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}