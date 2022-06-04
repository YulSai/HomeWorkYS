package Shop.additional.product;

import Shop.additional.product.api.IProduct;

/**
 * Класс с описанием объекта PromoProduct
 */
public class DiscountProduct extends PromoProduct implements IProduct {
    private final String cause;

    public DiscountProduct(String title, Double price, int discount, String cause) {
        super(title, price, discount);
        this.cause = cause;
    }

    public String getCause() {
        return cause;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public Double getPrice() {
        return super.getPrice();

    }

    @Override
    public String toString() {
        return super.toString() +
                ", Уценка - " + cause;
    }
}