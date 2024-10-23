package t2;

public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.proceedToNextState();
        order.proceedToNextState();
        order.proceedToNextState();
    }
}