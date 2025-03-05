package c3.Prototype;

import java.util.HashMap;

public class MyFruitStore {
    public static HashMap fruittable = new HashMap<Integer, MyFruit>();

    public void Add(Integer key, MyFruit fruit) {
        fruittable.put(key, fruit);

    }

    public MyFruit Get(Integer key) {
        MyFruit fruit = (MyFruit) fruittable.get(key);
        //return fruit; 这种的话就类似于引用了
        return (MyFruit) fruit.clone(); // 复制一个对象，存在一个新的地址里面
    }
}
