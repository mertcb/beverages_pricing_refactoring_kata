package beverages;

public class WithCinnamon implements Priceable {
    private final Priceable beverage;

    public WithCinnamon(Priceable beverage) {
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() + 0.05;
    }
}
