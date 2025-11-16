package proxy;

import model.Order;

import java.util.List;

public class OrderProxy{
    private final Order.Builder builder;
    private Order realOrder;

    public OrderProxy(Order.Builder builder) {
        this.builder = builder;
    }

    private Order getRealOrder() {
        if (realOrder == null) {
            System.out.println("OrderProxy: создаю настоящий Order...");
            realOrder = builder.build();
        }
        return realOrder;
    }

    public String getDeliveryAddress() {
        return getRealOrder().getDeliveryAddress();
    }

    public double getTotalAmount() {
        return getRealOrder().getTotalAmount();
    }

    public List<String> getItems() {
        return getRealOrder().getItems();
    }
}
