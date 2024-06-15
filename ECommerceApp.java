public class ECommerceApp {
    public static void main(String[] args) {
        // Create product instances
        Book book1 = new Book("B001", "Java Programming", 29.99, "Author A", "Programming");
        Electronics electronics1 = new Electronics("E001", "Smartphone", 699.99, "Brand X", 24);
        Clothing clothing1 = new Clothing("C001", "T-Shirt", 19.99, "M", "Cotton");

        // Create a shopping cart instance
        ShoppingCart cart = new ShoppingCart();

        // Add products to the cart
        cart.addProduct(book1);
        cart.addProduct(electronics1);
        cart.addProduct(clothing1);

        // Display cart contents and total price
        cart.displayCart();

        // Remove a product from the cart
        cart.removeProduct(book1);

        // Display cart contents and total price again
        cart.displayCart();
    }
}