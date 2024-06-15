# CS401 E-Commerce App

## Overview
This project is a simple e-commerce system implemented in Java using object-oriented programming concepts. The system includes various types of products, a shopping cart, and methods to manage the products and cart.

## Project Structure
The project consists of the following classes:
- 'Product': A base class representing a generic products.
- 'Book': A subclass of 'Product' representing books.
- 'Electronics': A subclass of 'Product' representing electronic items.
- 'Clothing': A subclass of 'Product' representing clothing items.
- 'ShoppingCart': A class to represent a shopping cart holding a collection of products.
- 'ECommerceApp': The main class to simulate the e-commerce system.

## Classes and Their Responsibilities

### Product.java
- Represents a generic product with attributes like 'id', 'name', and 'price'.
- Methods to display product details and access the product's attributes.

### Book.java
- Subclass of 'Product' representing books.
- Additional attributes: 'author' and 'genre'.
- Overrides 'displayDetails' method to display book-specific details.

### Electronics.java
- Subclass of 'Product' representing electronics items.
- Additional attributes: 'brand' and ' warrantyPeriod'.
- Overrides 'displayDetails' method to display electronics-specific details.

### Clothing.java
- Subclass of 'Product' representing clothing items.
- Additional attributes: 'size' and 'material'.
- Overrides 'displayDetails' method to display clothing-specific details.

### ShoppingCart.java
- Represents a shopping cart holding a collection of products.
- Methods to add products to the card, remove products from the cart, and display the cart's contents along with the total price.

### ECommerceApp.java
- Main class to simulate the e-commerce system.
- Create instances of different product types.
- Demonstrates adding and removing products from the shopping cart.
- Displays the contents of the shopping card and the total price.

## Expected Output
When the application runs, it will:
1. Create instances of 'Book', 'Electronics', and 'Clothing'.
2. Add these products to the shopping cart.
3. Display the contents of the shopping cart along with the total price.
4. Remove a product from the shopping cart.
5. Display the updated contents of the shopping cart and the new total price.

### Example Output
Java Programming has been added to the cart.

Smartphone has been added to the cart.

T-Shirt has been added to the cart.

Shopping Cart Contents:
ID: B001
Name: Java Programming
Price: $29.99
Author: Author A
Genre: Programming
------------------------
ID: E001
Name: Smartphone
Price: $699.99
Brand: Brand X
Warranty Period: 24 months
------------------------
ID: C001
Name: T-Shirt
Price: $19.99
Size: M
Material: Cotton
------------------------
Total Price: $749.97

Java Programming has been removed from the  card.

Shopping Cart Contents:
ID: E001
Name: Smartphone
Price: $699.99
Brand: Brand X
Warranty Period: 24 months
------------------------
ID: C001
Name: T-Shirt
Price: $19.99
Size: M
Material: Cotton
------------------------
Total Price: $719.98