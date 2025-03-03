package c1.FVimplements;

import c1.FVinterface.BFruitAndVegetables;
import c1.Fruit.Fruit;
import c1.Vegetables.Vegetables;
import c1.Vegetables.tomato;

public class BConV implements BFruitAndVegetables {
    public Vegetables CreateV() {
        return new tomato();
    }
    public Fruit CreateF() {
        return null;
    }
}
