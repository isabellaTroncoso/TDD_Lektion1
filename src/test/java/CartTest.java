import static org.junit.jupiter.api.Assertions.*;

import com.isabella.lektion1.Cart;
import com.isabella.lektion1.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CartTest {
    @Test
    @DisplayName("Adding products and returns correct total")
    void addProductsAndReturnsCorrectTotal() {
        Cart cart = new Cart();
        cart.addProduct(new Product("Banan", 10.0));
        cart.addProduct(new Product("Äpple", 5.0));

        assertEquals(15.0, cart.getTotal());
    }

    @Test
    @DisplayName("Applying 20% discount returns correct total")
    void applyingDiscount_returnsCorrectTotal() {
        Cart cart = new Cart();
        cart.addProduct(new Product("T-shirt", 100.0));
        cart.addProduct(new Product("Keps", 50.0));

        assertEquals(120.0, cart.getTotalWithDiscount(20));
    }

}
