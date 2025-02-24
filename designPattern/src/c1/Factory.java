package c1;

public class Factory {

    // 构造工厂
    public Fruit CreateFruit(String str){
        if(str.equals("A"))
            return new Apple();
        if(str.equals("B"))
            return new Banana();


        return null;
    }
}
