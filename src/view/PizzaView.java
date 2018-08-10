package view;

import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class PizzaView implements Observer {

    public void display(String crust, List<String> garnish) {
        String result = "{";

        result += "\"crust\": \"" + crust + "\",";

        if (garnish != null && !garnish.isEmpty()) {

            result += "\"garnish\": [";

            for (String g : garnish) {
                result += "\"" + g + "\",";
            }

            result = PizzaView.removeLastCharacter(result);

            result += "]";
        } else {
            result = PizzaView.removeLastCharacter(result);
        }

        result += "}";

        System.out.println(result);
    }

    private static String removeLastCharacter(String str) {
        str = str.substring(0, str.length() -1);
        return str;
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("The model changed!");

        Map<String, Object> data = (Map<String, Object>) arg;

        String crust = (String) data.get("crust");
        List<String> garnish = (List<String>) data.get("garnish");

        this.display(crust, garnish);
    }
}