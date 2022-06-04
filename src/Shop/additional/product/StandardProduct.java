package Shop.additional.product;

import Shop.additional.product.api.IProduct;

/**
 * Класс с описанием объекта PromoProduct
 */
public class StandardProduct implements IProduct {
    private final String title;
    private final Double price;

    public StandardProduct(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + '\'' + ", Цена - " + price;
    }
}