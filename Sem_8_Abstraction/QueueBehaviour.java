package Sem_8_Abstraction;

public interface QueueBehaviour {
    void takeInQueue(Actor actor); // встать в очередь
    void takeOrders();  // сделать заказ
    void giveOrders();  // получить заказ
    void releaseFromQueue(); // выйти из очереди
}
