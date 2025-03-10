package c12.command;

public class client {
    public static void main(String[] args) {
        //创建多个订单
        Order order1 = new Order();
        order1.setID(1);
        order1.setFruitmap("苹果", 1);
        order1.setFruitmap("橘子", 2);
        order1.setFruitmap("葡萄", 3);

        Order order2 = new Order();
        order2.setID(2);
        order2.setFruitmap("香蕉", 2);
        order1.setFruitmap("苹果", 4);

        //创建操作者
        Operator op = new Operator();
        //将多个订单封装成命令对象
        OrderCommand command = new OrderCommand(op, order1);
        OrderCommand command2 = new OrderCommand(op, order2);
        //创建调用者填充命令列表
        WaitorInvoker waitor = new WaitorInvoker();
        waitor.addCommand(command);
        waitor.addCommand(command2);
        //执行
        waitor.notifyCommand();
    }
}
