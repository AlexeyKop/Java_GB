package Sem_8_Abstraction;

public interface ActorBehavoir {
    void setMakeOrder(boolean isMakeOrder);
    void setTakeOrder(boolean isTakeOrder);
    boolean isMakeOrder();  // сделал заказ
    boolean isTakeOrder(); // получил заказ
}
