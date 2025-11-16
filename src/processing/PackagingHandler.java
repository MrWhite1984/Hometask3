package processing;

import model.Order;

public class PackagingHandler extends OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("Заказ упакован");
        super.handle(order);
    }
}
