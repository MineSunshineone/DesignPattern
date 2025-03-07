package c3.Prototype;

import java.util.Hashtable;

public class MyFruitStore {

    private static Hashtable fruittable = null;
    private static MyFruitStore fruitStore = null;

    private MyFruitStore(){
        if(fruittable == null){
            fruittable = new Hashtable<Integer,MyFruit>();
        }
    }

    public static MyFruitStore Getfruitstore(){
        if(fruittable == null){
            fruittable = new Hashtable<Integer,MyFruit>();
        }
        return fruittable;
    }

    public void add(Integer key, MyFruit fruit) {
        fruittable.put(key, fruit);

    }

    public MyFruit Get(Integer key) {
        MyFruit fruit = (MyFruit) fruittable.get(key);
        //return fruit; 这种的话就类似于引用了
        return (MyFruit) fruit.clone(); // 复制一个对象，存在一个新的地址里面
    }
}
