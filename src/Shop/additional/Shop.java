package Shop.additional;

import Shop.additional.product.api.IProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс с описанием объекта Shop
 */
public class Shop {
    private final List<IProduct> products;

    public Shop() {
        this.products = new ArrayList<>();
    }

    public List<IProduct> getProducts() {
        return products;
    }

    public void add(IProduct product) {
        this.products.add(product);
    }

    public Basket takeBasket() {
        return new Basket();
    }

    public Receipt takeReceipt(Basket basket) {
        List<String> rows = new ArrayList<>();

        double sum = 0;
        for (ProductInBasket productInBasket : basket.getProductInBaskets()) {
            rows.add(productInBasket.toString());
            sum += productInBasket.getPrice();
        }

        return new Receipt(rows, sum);
    }
}