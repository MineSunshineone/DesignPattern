package c4.Ada;

import c3.Prototype.MyFruit;
import c3.Prototype.MyFruitStore;

public class OldJuicer {

    public String onePort(MyFruit fruit) {
        String str = fruit.Get() + "果汁";
        return str;
    }

}
