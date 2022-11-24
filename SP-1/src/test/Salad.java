package test;

public class Salad extends Abs {
    public Salad(String name, int prise) {
        super(name, prise);
    }

    @Override
    public void addVisitor(DishVisitor v) {
        v.visitSalad(this);
    }
    
}