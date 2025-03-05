package c2.Bui;

public class MealBuilder {
    protected Meal meal = new Meal();

    public void buildFood() {
        System.out.println("建造食物");
    }

    public void buildDrink() {
        System.out.println("建造饮料");
    }

    public Meal getMeal() {
        return new Meal();
    }
}
