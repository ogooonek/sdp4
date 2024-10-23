package t3;

class TimePricing implements PricingStrategy {
    @Override
    public double calculatePrice(double time) {
        return time * 5; // 5 руб/минута
    }
}