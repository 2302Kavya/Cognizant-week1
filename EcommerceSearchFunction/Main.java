import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "TV", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Mouse", "Accessories")
        };
        Arrays.sort(products);

        Product result =
        SearchOperations.binarySearch(products, "Mobile");

        if (result != null) {
            System.out.println("Product Found: "
                    + result.productName);
        } else {
            System.out.println("Product Not Found");
        }
    }
}

