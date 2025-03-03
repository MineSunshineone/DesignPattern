package c1.Factory;

import c1.Fruit.Apple;
import c1.Fruit.Fruit;

public class AFactory extends Factory {
    public Fruit CreateFruit() {
        return new Apple();
    }
}
