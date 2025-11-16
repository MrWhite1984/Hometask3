package decorator;

import model.Order;

public class BasicOrder implements OrderComponent{
    private final Order order;

    public BasicOrder(Order order) {
        this.order = order;
    }

    @Override
    public String getDescription() {
        return "Заказ на сумму " + order.getTotalAmount();
    }
}
