package beverages;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class WithCinammonTest {

    public static final double REGULAR_COFFEE_PRICE = 1.2;
    public static final double REGULAR_TEA_PRICE = 1.5;
    public static final double CINNAMON_OVERHEAD = 0.05;
    private static final double REGULAR_HOT_CHOCOLATE_PRICE = 1.45;

    @Test
    public void adds_fifteen_cents_to_original_price()
    {
        HotChocolate hotChocolate = new HotChocolate();
        WithCinnamon hotChocolateWithCinnamon = new WithCinnamon(hotChocolate);
        assertThat(REGULAR_HOT_CHOCOLATE_PRICE + CINNAMON_OVERHEAD, is(closeTo(hotChocolateWithCinnamon.price(), 0.001 )) );
    }
}