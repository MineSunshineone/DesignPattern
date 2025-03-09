package c7;

public class Cream extends Decorating{
    public void putCream(){
        System.out.println("添加奶油中...");
    }
    public Cream(IBrithdayCake brithdayCake){
        super(brithdayCake);
    }
}
