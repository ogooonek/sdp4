package t3;

class DistancePricing implements PricingStrategy {
    @Override
    public double calculatePrice(double distance) {
        return distance * 10;
    }
}