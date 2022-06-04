package Shop.additional.product;

import Shop.additional.product.api.IProduct;

/**
 * Класс с описанием объекта PromoProduct
 */
public class PromoProduct extends StandardProduct implements IProduct {
    private final int discount;

    public PromoProduct(String title, Double price, int discount) {
        super(title, price);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public Double getPrice() {
        double discountPrise = super.getPrice();
        return discountPrise - (discountPrise * discount / 100);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Скидка - " + discount + "%";
    }
}