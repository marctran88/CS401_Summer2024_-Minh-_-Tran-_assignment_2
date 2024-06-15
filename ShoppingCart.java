import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
        System.out.println(product.getName() + " has been added to the cart.");
        System.out.println();
    }

    public void removeProduct(Product product) {
        if (cart.remove(product)) {
            System.out.println(product.getName() + " has been removed from the  card.");
            System.out.println();
        } else {
            System.out.println(product.getName() + " is not in the cart.");
        }
    }

    public void displayCart() {
        double totalPrice = 0;
        System.out.println("Shopping Cart Contents:");
        for (Product product : cart) {
            product.displayDetails();
            System.out.println("------------------------");
            totalPrice += product.getPrice();
        }
        System.out.println("Total Price: $" + totalPrice);
        System.out.println();
    }
}