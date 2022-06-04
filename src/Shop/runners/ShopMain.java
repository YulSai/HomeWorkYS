package Shop.runners;

import Shop.additional.Shop;
import Shop.additional.Basket;
import Shop.additional.Receipt;
import Shop.additional.product.DiscountProduct;
import Shop.additional.product.PromoProduct;
import Shop.additional.product.api.IProduct;
import Shop.additional.product.StandardProduct;

import java.util.List;
import java.util.Scanner;

/**
 * Класс с точкой входа
 */
public class ShopMain {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.add(new StandardProduct("Молоко", 2.35));
        shop.add(new PromoProduct("Телевизор", 8563.0, 31));
        shop.add(new DiscountProduct("Бананы", 10.0, 50, "битые"));

        job(shop);
    }

    private static void job(Shop shop) {
        Scanner console = new Scanner(System.in);

        Basket basket = shop.takeBasket();

        List<IProduct> products = shop.getProducts();

        do {
            System.out.println("Выбирай продукты, налетай!");
            int index = 0;
            for (IProduct product : products) {
                System.out.println(++index + " - " + product);
            }

            int choice = console.nextInt();

            if (choice <= 0 || choice > index) {
                break;
            }

            IProduct product = products.get(choice - 1);

            System.out.println("Вы выбрали: " + product);
            System.out.print("Сколько хотите взять: ");

            int count = console.nextInt();

            basket.addProductInBaskets(product, count);
        } while (true);

        Receipt receipt = shop.takeReceipt(basket);

        System.out.println("Боже, я столько всего накупил");
        System.out.println(receipt);

        System.out.println("За что я должен заплатить " + receipt.getSum());
    }
}