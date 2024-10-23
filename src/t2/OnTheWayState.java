package t2;

class OnTheWayState implements OrderState {
    @Override
    public void nextState(OrderContext context) {
        System.out.println("Заказ завершен.");
        context.setState(new FinishedState());
    }
}