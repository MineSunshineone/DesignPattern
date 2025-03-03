package c1.FVimplements;

import c1.FVinterface.AFruitAndVegetables;
import c1.Fruit.Banana;
import c1.Fruit.Fruit;
import c1.Vegetables.Vegetables;

public class AConF implements AFruitAndVegetables {
    public Fruit CreateF() {
        return new Banana();
    }
    public Vegetables CreateV() {
        return null;
    }
}
