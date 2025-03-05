package c3.Prototype;

import java.lang.Cloneable;

public class MyFruit implements Cloneable {
    protected String kind;

    public void display() {
        System.out.println(kind);
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }
        return obj;
    }
}
