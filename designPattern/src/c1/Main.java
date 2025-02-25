package c1;

public class Main {
    public static void main(String[] args) {

        Factory factory = (Factory) XMLUtil.getBean();

        Fruit fruit = factory.CreateFruit();

        fruit.eat();

    }
}
