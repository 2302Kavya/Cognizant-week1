public class Main {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 10, 50000);
        Product p2 = new Product(102, "Mouse", 50, 500);

        manager.addProduct(p1);
        manager.addProduct(p2);

        System.out.println("Products in Inventory:");
        manager.displayProducts();

        manager.updateProduct(101, 20);

        System.out.println("\nAfter Update:");
        manager.displayProducts();

        manager.deleteProduct(102);

        System.out.println("\nAfter Delete:");
        manager.displayProducts();
    }
}

