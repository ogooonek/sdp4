package t2;

class OrderContext {
    private OrderState state;

    public OrderContext() {
        state = new CreatedState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void proceedToNextState() {
        state.nextState(this);
    }
}