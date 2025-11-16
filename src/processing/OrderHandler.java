package processing;

import model.Order;

public abstract class OrderHandler {
    private OrderHandler next;

    public void setNext(OrderHandler next)
    {
        this.next = next;
    }

    public void handle(Order order)
    {
        if(next != null)
            next.handle(order);
    }
}
