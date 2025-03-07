package c4.Ada;

import c3.Prototype.MyFruit;

//public class Adapter extends OldJuicer implements NewJuicer {
//
//    public String newPort(MyFruit fruit1, MyFruit fruit2) {
//        String str1 = onePort(fruit1);
//        String str2 = onePort(fruit2);
//
//        return str1 + str2 + "混合";
//    }
//}

public class Adapter implements NewJuicer {
    private OldJuicer oldJuicer = new OldJuicer();
    public String newPort(MyFruit fruit1, MyFruit fruit2) {
        String str1 = oldJuicer.onePort(fruit1);
        String str2 = oldJuicer.onePort(fruit2);

        return str1 + str2 + "混合";
    }

}
