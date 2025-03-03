package c1.FVimplements;

import c1.FVinterface.BFruitAndVegetables;
import c1.Fruit.Apple;
import c1.Fruit.Fruit;
import c1.Vegetables.Vegetables;

public class BConF implements BFruitAndVegetables {
    public Fruit CreateF() {
        return new Apple();
    }
    public Vegetables CreateV() {
        return null;
    }
}
