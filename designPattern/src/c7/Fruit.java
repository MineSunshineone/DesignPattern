package c7;

public class Fruit extends Decorating{
    public void putFruit(){
        System.out.println("放水果中...");
    }

    public Fruit(IBrithdayCake brithdayCake){
        super(brithdayCake);
    }
}
