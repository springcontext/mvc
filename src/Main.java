import controller.PizzaController;
import view.PizzaView;

public class Main {

    public static void main(String args[]) {

        PizzaView pizzaView = new PizzaView();

        PizzaController pizzaController = new PizzaController();

        pizzaController.addObserver(pizzaView);

        pizzaController.setPizzaCrust("Thin");

        pizzaController.addGarnish("Tomato sauce");
        pizzaController.addGarnish("Ham");
        pizzaController.addGarnish("Mozzarella");
    }
}