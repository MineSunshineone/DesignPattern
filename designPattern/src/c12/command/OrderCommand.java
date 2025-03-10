package c12.command;

public class OrderCommand implements command {
    private Order order;
    private Operator recevier;

    public OrderCommand(Operator recevier, Order order) {
        this.order = order;
        this.recevier = recevier;
    }

    @Override
    public void execute() {
        System.out.println(order.getID() + "的成品 " );
        recevier.MarkFinished(order);
    }
}
