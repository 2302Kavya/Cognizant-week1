
    import java.util.HashMap;

public class InventoryManager {

    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product Added");
    }

    public void updateProduct(int productId, int quantity) {
        if (inventory.containsKey(productId)) {
            inventory.get(productId).quantity = quantity;
            System.out.println("Product Updated");
        }
    }

    public void deleteProduct(int productId) {
        inventory.remove(productId);
        System.out.println("Product Deleted");
    }

    public void displayProducts() {
        for (Product p : inventory.values()) {
            System.out.println(
                p.productId + " " +
                p.productName + " " +
                p.quantity + " " +
                p.price
            );
        }
    }
}

