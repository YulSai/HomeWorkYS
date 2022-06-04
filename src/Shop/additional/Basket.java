package Shop.additional;

import Shop.additional.product.api.IProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс с описанием объекта Basket
 */
public class Basket {
    private final List<ProductInBasket> productInBaskets;

    public Basket() {
        this.productInBaskets = new ArrayList<>();
    }

    public List<ProductInBasket> getProductInBaskets() {
        return productInBaskets;
    }

    public void addProductInBaskets(IProduct product, int count) {
        this.productInBaskets.add(new ProductInBasket(product, count));
    }
}