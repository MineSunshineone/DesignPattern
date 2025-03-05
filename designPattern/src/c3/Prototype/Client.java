package c3.Prototype;

public class Client {
    public static void main(String[] args) {
        MyFruit fr1 = new Apple();
        MyFruit fr2 = (Apple) fr1.clone();

        fr1.display();
        fr2.display();
        System.out.println("fr1:" + fr1.hashCode());
        System.out.println("fr2:" + fr2.hashCode());

        //小结：如果是类似于 a = b，那么这两个对象的HashCode会是一样的，也就相当于引用，二者为同一块内存地址
        //如果是 a = b.clone(), 两者的HashCode不一样，有点像传参进去，复制了一个新的对象，存在一块新的地址里
        //这么复制，可以减少创建对象（复杂创建）时候的开销
    }
}
