package strategy;

public class CourierDelivery implements DeliveryStrategy{
    @Override
    public String getDescription() {
        return "Выбрана доставка курьером";
    }
}
