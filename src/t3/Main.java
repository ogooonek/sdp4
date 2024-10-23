package t3;

public class Main {
    public static void main(String[] args) {
        TaxiOrder order = new TaxiOrder();


        order.setStrategy(new DistancePricing());
        System.out.println("Стоимость по расстоянию: " + order.calculatePrice(15)); // 15 км


        order.setStrategy(new TimePricing());
        System.out.println("Стоимость по времени: " + order.calculatePrice(30)); // 30 минут

        order.setStrategy(new FixedPricing());
        System.out.println("Фиксированная стоимость: " + order.calculatePrice(0));
    }
}