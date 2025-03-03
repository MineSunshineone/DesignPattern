package c1.Factory;

import c1.Fruit.Banana;
import c1.Fruit.Fruit;

public class BFactory extends Factory {
    public Fruit CreateFruit() {
        return new Banana();
    }
}
