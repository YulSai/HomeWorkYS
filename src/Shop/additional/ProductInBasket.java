package Shop.additional;

import Shop.additional.product.api.IProduct;

/**
 * Класс с описанием объекта ProductInBasket
 */
public class ProductInBasket {
    IProduct product;
    int count;

    public ProductInBasket(IProduct product, int count) {
        this.product = product;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public IProduct getProduct() {
        return product;
    }

    public double getPrice() {
        return count * product.getPrice();
    }

    @Override
    public String toString() {
        return product.toString() + ", Количество - " + count + ", Сумма - " + getPrice();
    }
}