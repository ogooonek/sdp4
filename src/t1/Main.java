package t1;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Client client1 = new Client("Алексей");
        Client client2 = new Client("Мария");

        order.addObserver(client1);
        order.addObserver(client2);

        order.setStatus("Такси подъезжает");
        order.setStatus("Заказ завершен");
    }
}
