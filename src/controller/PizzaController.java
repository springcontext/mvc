package controller;

import model.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class PizzaController {

    private final Pizza pizza;

    public PizzaController() {
        this.pizza = new Pizza();
        this.pizza.setGarnish(new ArrayList<>());
    }

    public void setPizzaCrust(String crust) {
        this.pizza.setCrust(crust);
    }

    public void addGarnish(String garnish) {
        this.pizza.addGarnish(garnish);
    }

    public void setGarnish(List<String> garnish) {
        this.pizza.setGarnish(garnish);
    }

    public void addObserver(Observer observer) {
        this.pizza.addObserver(observer);
    }
}
