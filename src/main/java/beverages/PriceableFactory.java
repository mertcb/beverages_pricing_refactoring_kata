package beverages;

public class PriceableFactory {
    private Priceable beverage;

    private PriceableFactory(Priceable beverage) {
        this.beverage = beverage;
    }

    public static CoffeeBuilder coffee() {
        return new CoffeeBuilder();
    }

    public static PriceableFactory tea() {
        return new PriceableFactory(new Tea());
    }

    public static PriceableFactory hotChocolate() {
        return new PriceableFactory(new HotChocolate());
    }

    public Priceable make() {
        return beverage;
    }

    public PriceableFactory withMilk() {
        beverage = new WithMilk(beverage);

        return this;
    }

    public PriceableFactory withCream() {
        beverage = new WithCream(beverage);

        return this;
    }

    public PriceableFactory withCinnamon() {
        beverage = new WithCinnamon(beverage);

        return this;
    }

    public static class CoffeeBuilder {
        private Priceable beverage;

        private CoffeeBuilder() {
            this.beverage = new Coffee();
        }

        public Priceable make() {
            return beverage;
        }

        public CoffeeBuilder withMilk() {
            beverage = new WithMilk(beverage);
            return this;
        }

        public CoffeeBuilder withCinnamon() {
            beverage = new WithCinnamon(beverage);
            return this;
        }

        public CoffeeBuilder withCream() {
            beverage = new WithCream(beverage);
            return this;
        }
    }

    public static class TeaBuilder {
        private Priceable beverage;

        private TeaBuilder() {
            this.beverage = new Tea();
        }

        public Priceable make() {
            return beverage;
        }

        public TeaBuilder withMilk() {
            beverage = new WithMilk(beverage);
            return this;
        }

        public TeaBuilder withCinnamon() {
            beverage = new WithCinnamon(beverage);
            return this;
        }
    }

    public static class HotChocolateBuilder {
        private Priceable beverage;

        private HotChocolateBuilder() {
            this.beverage = new HotChocolate();
        }

        public Priceable make() {
            return beverage;
        }

        public HotChocolateBuilder withCinnamon() {
            beverage = new WithCinnamon(beverage);
            return this;
        }

        public HotChocolateBuilder withCream() {
            beverage = new WithCream(beverage);
            return this;
        }
    }
}
