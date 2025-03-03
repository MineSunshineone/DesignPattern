package c1.FVimplements;

import c1.FVinterface.AFruitAndVegetables;
import c1.Fruit.Fruit;
import c1.Vegetables.Vegetables;
import c1.Vegetables.cabbage;

public class AConV implements AFruitAndVegetables {
    public Vegetables CreateV() {
        return new cabbage();
    }
    public Fruit CreateF() {
        return null;
    }
}
