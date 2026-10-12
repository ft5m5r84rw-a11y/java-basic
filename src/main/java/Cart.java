
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> products;


    public Cart() {
        products = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, products.get(product) + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    public double getTotalPrice() {
        double total = 0;

        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            double price = product.getPrice();
            total = total + price * quantity;
        }
        return total;
    }

    public int getProductCount() {
        int count = 0;

        for (int quantity : products.values()) {
            count = count + quantity;
        }
        return count;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Молоко", 110);
        Product product2 = new Product("Хлеб", 80);
        Product product3 = new Product("Масло", 250);
        Cart cart = new Cart();

        cart.addProduct(product1, 1);
        cart.addProduct(product2, 2);
        cart.addProduct(product3, 1);

        System.out.println("Общее количество товаров: " + cart.getProductCount());
        System.out.println("Общаяя сумма покупок: " + cart.getTotalPrice());
    }


}
