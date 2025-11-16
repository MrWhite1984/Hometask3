package model;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    private final List<String> items;
    private final String deliveryAddress;
    private final double totalAmount;

    Order (Builder builder)
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.items = builder.items;
        this.deliveryAddress = builder.deliveryAddress;
        this.totalAmount = builder.totalAmount;
    }

    public List<String> getItems()
    {
        return items;
    }
    public String getDeliveryAddress()
    {
        return deliveryAddress;
    }
    public double getTotalAmount(){
        return totalAmount;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder {
        private final List<String> items = new ArrayList<>();
        private String deliveryAddress = "";
        private double totalAmount = 0;

        private Builder() {
        }

        public Builder addItem(String item) {
            this.items.add(item);
            return this;
        }

        public Builder deliveryAddress(String address) {
            this.deliveryAddress = address;
            return this;
        }

        public Builder totalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Order build() {
            if (items.isEmpty()) {
                throw new IllegalStateException("Заказ должен содержать хотя бы один товар");
            }
            if (deliveryAddress.isEmpty()) {
                throw new IllegalStateException("Укажите адрес доставки");
            }
            return new Order(this);
        }
    }
}
