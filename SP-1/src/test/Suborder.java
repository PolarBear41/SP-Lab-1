package test;

import java.util.ArrayList;
import java.util.List;

public class Suborder {
    private List<Dish> dishes;

    public Suborder() {
        dishes = new ArrayList<>();
    }

    public void addDish(Dish d) {
        dishes.add(d);
    }

    public void addVisitor(DishVisitor v) {
        for (Dish dish : dishes) {
            dish.addVisitor(v);
        }
    }
}