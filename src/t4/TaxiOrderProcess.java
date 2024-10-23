package t4;

class TaxiOrderProcess extends OrderProcess {
    @Override
    protected void checkAvailability() {
        System.out.println("Проверка наличия такси...");
    }

    @Override
    protected void calculateCost() {
        System.out.println("Расчет стоимости поездки...");
    }

    @Override
    protected void confirmOrder() {
        System.out.println("Подтверждение заказа...");
    }
}