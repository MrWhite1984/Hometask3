package processing;

import model.Order;

public class PaymentHandler extends OrderHandler{
    @Override
    public void handle(Order order) {
        System.out.println("Обработка оплаты");
        if(order.getTotalAmount() == 0){
            System.out.println("Сумма некорректна");
            return;
        }
        System.out.println("Оплата на сумму " + order.getTotalAmount() + " прошла");
        super.handle(order);
    }
}
