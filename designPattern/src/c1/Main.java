package c1;

import c1.Config.XMLUtil;
import c1.Factory.Factory;
import c1.Fruit.Fruit;

public class Main {
    public static void main(String[] args) {

        Factory factory = (Factory) XMLUtil.getBean();

        Fruit fruit = factory.CreateFruit();

        fruit.eat();

    }
}
