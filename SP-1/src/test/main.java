package test;

public class main {
    public static void main(String[] args) {
        Order o1 = new Order();
        Suborder s1 = new Suborder();
        Suborder s2 = new Suborder();

        o1.addSuborder(s1);
        o1.addSuborder(s2);

        s1.addDish(new Pasta("paste 1", 15));
        s1.addDish(new Pizza("pizza1", 23));
        s1.addDish(new Pizza("pizza2", 26));
        s1.addDish(new Salad("salata1", 30));
        s2.addDish(new Pizza("pizza 3", 27));
        s2.addDish(new Pizza("pizza 4",38));

        Calculator pc = new Calculator();
        o1.addVisitor(pc);
        pc.print();
    }
    
}