package test;

public interface Dish {
    public String getName();
    public int getPrice();
    public void addVisitor(DishVisitor v);
}