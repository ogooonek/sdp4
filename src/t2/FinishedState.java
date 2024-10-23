package t2;

class FinishedState implements OrderState {
    @Override
    public void nextState(OrderContext context) {
        System.out.println("Заказ уже завершен.");
    }
}