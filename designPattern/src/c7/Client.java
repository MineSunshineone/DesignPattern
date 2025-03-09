package c7;

public class Client {
    public static void main(String[] args) {
        IBrithdayCake brithdayCake = new Cake();
        brithdayCake.show();
        Cream cream = new Cream(brithdayCake);
        cream.putCream();

        Fruit fruit = new Fruit(cream);
        fruit.putFruit();
        fruit.show();
    }
}
