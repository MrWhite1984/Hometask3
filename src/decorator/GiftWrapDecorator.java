package decorator;

public class GiftWrapDecorator extends OrderDecorator{
    public GiftWrapDecorator(OrderComponent wrappedOrder) {
        super(wrappedOrder);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nПодарочная упаковка";
    }
}
