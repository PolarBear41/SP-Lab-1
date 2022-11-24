package test;

public interface DishVisitor {
    public void visitSalad(Salad s);
    public void visitPasta(Pasta p);
    public void visitPizza(Pizza p);
}