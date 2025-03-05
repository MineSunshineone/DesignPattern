package c3.Prototype;

public class Client {
    public static void main(String[] args) {
        MyFruit fr1 = new Apple();
        MyFruit fr2 = (Apple) fr1.clone();

        fr1.display();
        fr2.display();

        System.out.println("fr1:" + fr1.hashCode());
        System.out.println("fr2:" + fr2.hashCode());
    }
}
