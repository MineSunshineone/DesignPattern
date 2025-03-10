package c12.command;

import java.util.HashMap;

public class Order {
    private int ID;
    private HashMap<String, Integer> fruitmap;

    public Order() {
        fruitmap = new HashMap<String, Integer>();
    }
    public String getID(){
        return null;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public HashMap<String, Integer> getFruitmap() {
        return fruitmap;
    }

    public void setFruitmap(String fruitkind, int quantity) {
        this.fruitmap.put(fruitkind,quantity);
    }
}
