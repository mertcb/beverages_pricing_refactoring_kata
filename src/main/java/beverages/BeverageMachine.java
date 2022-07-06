package beverages;

public class BeverageMachine {
    private Priceable beverage;
    private BeverageMachine(Priceable beverage) {
        this.beverage = beverage;
    }

    public static BeverageMachine coffee()
    {
        return new BeverageMachine(new Coffee());
    }

    public static BeverageMachine tea()
    {
        return new BeverageMachine(new Tea());
    }

    public static BeverageMachine hotChocolate()
    {
        return new BeverageMachine(new HotChocolate());
    }

    public Priceable make()
    {
        return beverage;
    }

    public BeverageMachine withMilk()
    {
        beverage = new WithMilk(beverage);

        return this;
    }

    public BeverageMachine withCream()
    {
        beverage = new WithCream(beverage);

        return this;
    }

    public BeverageMachine withCinnamon()
    {
        beverage = new WithCinnamon(beverage);

        return this;
    }
}
