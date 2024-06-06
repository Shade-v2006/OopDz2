package DZ.DZ_2;

/** ActorBehaviour (Поведение Актера) */
public interface ActorBehaviour {
    void setMakeOrder(boolean makeOrder);

    void setTakeOrder(boolean pickUpOrder); // Забрать заказ

    boolean isMakeOrder();

    boolean isTakeOrder();
}
