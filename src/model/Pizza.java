package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

public class Pizza extends Observable {

    private String crust;

    private List<String> garnish;

    public String getCrust() {
        return crust;
    }

    public List<String> getGarnish() {
        return garnish;
    }

    public void addGarnish(String garnish) {
        this.garnish.add(garnish);

        this.setChanged();
        this.notifyObservers(data());
    }

    public void setCrust(String crust) {
        this.crust = crust;

        this.setChanged();
        this.notifyObservers(data());
    }

    public void setGarnish(List<String> garnish) {
        this.garnish = garnish;

        this.setChanged();
        this.notifyObservers(data());
    }

    public Map<String, Object> data() {
        Map<String, Object> content = new HashMap<>();

        content.put("crust", this.crust);
        content.put("garnish", this.garnish);

        return content;
    }
}
