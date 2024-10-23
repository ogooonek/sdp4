package t3;

class FixedPricing implements PricingStrategy {
    @Override
    public double calculatePrice(double value) {
        return 300;
    }
}