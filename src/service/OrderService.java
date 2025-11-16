package service;

import strategy.DeliveryStrategy;

public class OrderService {
    private DeliveryStrategy deliveryStrategy;

    public OrderService(DeliveryStrategy deliveryStrategy)
    {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy)
    {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void processOrder(double orderTotal)
    {
        System.out.println("=== Обработка заказа ===");
        System.out.println("Сумма заказа: " + orderTotal);
        System.out.println("Доставка: " + deliveryStrategy.getDescription());
    }
}
