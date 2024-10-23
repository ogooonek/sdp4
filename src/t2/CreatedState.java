package t2;

class CreatedState implements OrderState {
    @Override
    public void nextState(OrderContext context) {
        System.out.println("Заказ подтвержден.");
        context.setState(new ConfirmedState());
    }
}