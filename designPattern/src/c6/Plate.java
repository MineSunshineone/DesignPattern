package c6;

import java.util.ArrayList;

public class Plate extends MyElement {
    private ArrayList list = new ArrayList();

    public void add(MyElement element) {
        list.add(element);
    }

    public void remove(MyElement element) {
        list.remove(element);
    }

    public void eat() {
        for(Object obj : list) {
            ((MyElement)obj).eat();
        }
    }

}
