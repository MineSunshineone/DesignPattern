package c1;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();

        Fruit fruit = factory.CreateFruit("A");

        fruit.eat();

    }
    public String factory (String frutname){
        if(frutname.equals("Apple"))
            return "Apple";
        if(frutname.equals("Banana"))
            return "Banana";
        return null;
    }
}
