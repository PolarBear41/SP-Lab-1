package test;

public class Pasta extends Abs {

    public Pasta(String name, int prise) {
        super(name, prise);
    }

    @Override
    public void addVisitor(DishVisitor v) {
        v.visitPasta(this);
    }
    
}