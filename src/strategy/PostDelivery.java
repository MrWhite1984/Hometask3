package strategy;

public class PostDelivery implements DeliveryStrategy{
    @Override
    public String getDescription() {
        return "Доставка по почте";
    }
}
