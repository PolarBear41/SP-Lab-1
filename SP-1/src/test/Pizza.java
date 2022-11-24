package test;

public class Pizza extends Abs {
    public Pizza(String name, int prise) {
        super(name, prise);
    }

    @Override
    public void addVisitor(DishVisitor v) {
        v.visitPizza(this);
    }
    
}