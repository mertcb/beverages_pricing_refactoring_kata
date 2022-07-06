package unit_tests;

import beverages.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {

    public static final double REGULAR_COFFE_PRICE = 1.20;
    public static final double REGULAR_TEA_PRICE = 1.50;
    public static final double HOT_CHOCOLATE_REGULAR_PRICE = 1.45;

    public static final double CREAM_OVERHEAD = 0.15;
    public static final double MILK_OVERHEAD = 0.10;


    @Test
    public void computes_coffee_price() {
        Priceable coffee = PriceableFactory.coffee().make();
        assertThat(coffee.price(), is(closeTo(REGULAR_COFFE_PRICE, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Priceable tea = PriceableFactory.tea().make();
        assertThat(tea.price(), is(closeTo(REGULAR_TEA_PRICE, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Priceable hotChocolate = PriceableFactory.hotChocolate().make();
        assertThat(hotChocolate.price(), is(closeTo(HOT_CHOCOLATE_REGULAR_PRICE, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Priceable teaWithMilk = PriceableFactory.tea().withMilk().make();
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Priceable coffeeWithMilk = PriceableFactory.coffee().withMilk().make();
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Priceable coffeeWithMilkAndCream = PriceableFactory.coffee().withMilk().withCream().make();
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(HOT_CHOCOLATE_REGULAR_PRICE, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        Priceable hotChocolateWithCream = PriceableFactory.hotChocolate().withCream().make();
        assertThat(hotChocolateWithCream.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_tea_with_cream_price()
    {
        Priceable hotChocolateWithCream = PriceableFactory.tea().withCream().make();
        assertThat(hotChocolateWithCream.price(), is(closeTo(1.65, 0.001)));
    }
}
