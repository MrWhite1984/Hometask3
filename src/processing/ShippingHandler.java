package processing;

import model.Order;

public class ShippingHandler extends OrderHandler{
    @Override
    public void handle(Order order) {
        System.out.println("Заказ отправлен");
    }
}
