package t3;

class TaxiOrder {
    private PricingStrategy strategy;

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(double value) {
        return strategy.calculatePrice(value);
    }
}