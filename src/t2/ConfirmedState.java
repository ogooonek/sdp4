package t2;

class ConfirmedState implements OrderState {
    @Override
    public void nextState(OrderContext context) {
        System.out.println("Такси в пути.");
        context.setState(new OnTheWayState());
    }
}