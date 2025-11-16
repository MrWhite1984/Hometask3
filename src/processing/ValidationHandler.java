package processing;

import model.Order;

public class ValidationHandler extends OrderHandler
{
    @Override
    public void handle(Order order) {
        System.out.println("Проверка валидности заказа");
        if(order.getItems().isEmpty() || order.getDeliveryAddress().isEmpty()){
            System.out.println("Ошибка валидации");
            return;
        }
        System.out.println("Валидация прошла успешно");
        super.handle(order);
    }
}
