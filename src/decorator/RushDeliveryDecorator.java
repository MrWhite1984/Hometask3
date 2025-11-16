package decorator;

public class RushDeliveryDecorator extends OrderDecorator{
    public RushDeliveryDecorator(OrderComponent wrappedOrder) {
        super(wrappedOrder);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nБыстрая доставка";
    }
}
