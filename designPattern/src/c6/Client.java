package c6;

public class Client {
    public static void main(String[] args) {
        MyElement obj1, obj2, obj3, obj4, obj5;
        Plate plate1, plate2, plate3;
        obj1 = new Apple();
        obj2 = new Banana();
        obj3 = new Pear();
        obj4 = new Apple();
        obj5 = new Banana();

        plate1 = new Plate();
        plate1.add(obj1);
        plate1.add(obj2);

        plate2 = new Plate();
        plate2.add(obj3);
        plate2.add(obj4);

        plate3 = new Plate();
        plate3.add(obj5);
        plate3.add(plate1);
        plate3.add(plate2);

        plate3.eat();
    }
}
