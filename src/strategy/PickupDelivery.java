package strategy;

public class PickupDelivery implements DeliveryStrategy{
    @Override
    public String getDescription() {
        return "Самовывоз из пункта выдачи";
    }
}
