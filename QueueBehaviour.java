// Методы из интерфейса QueueBehaviour, имитируют работу очереди.

package DZ.DZ_2;

/** QueueBehaviour (Поведение в очереди) */
public interface QueueBehaviour {
    void takeInQueue(Actor actor);

    void takeOrders(); // сделать заказ

    void giveOrders(); // забрать заказы

    void releaseFromQueue(); // выйти из очереди
}