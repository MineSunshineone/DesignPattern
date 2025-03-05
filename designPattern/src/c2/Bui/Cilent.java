package c2.Bui;

public class Cilent {
    public static void main(String[] args) {
        MealBuilder mb = (MealBuilder) XMLUtil.getBean();

        KFCwaiter waiter = new KFCwaiter();

        waiter.setMealBuilder(mb);

        Meal meal = waiter.construct();

        System.out.println("套餐组成：");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());


    }
}
