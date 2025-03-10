package c12.command;

public class Operator {
    public void MarkFinished(Order order) {
        String str ="";
        for (String key : order.getFruitmap().keySet()) {
            str += key + " " + order.getFruitmap().get(key) + "份 ";
        }
        System.out.println("完成" + str);
    }
}
