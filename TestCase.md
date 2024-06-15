Overview

This document describes the test cases and observations for the E-Commerce App implemented in Java.

Test Cases

Test Case 1: Add Products to Shopping Cart
. Description: Add multiple products to the shopping card and verify that they are added correctly.
. Steps:
    1. Create instance of Book, Electronics, and Clothing.
    2. Add these products to the shopping cart.
    3. Display the contents of the shopping cart.
. Expected Result: The shopping cart should display all added products with their respective details and the total price.
. Actual Result: All products are added successfully, and their details along with the total price are displayed correctly.

Test Case 2: Remove Product from Shopping Cart
. Description: Remove a product from the shopping cart and verify that it is removed correctly.
. Steps:
    1. Add products to the shopping cart (from Test Case 1).
    2. Remove one product from the shopping cart.
    3. Display the contents of the shopping cart.
. Expected Result: The shopping cart should display the remaining products and the update total price.
. Actual Result: The product is removed successfully, and the remaining products along with the updated total price are displayed correctly.


Test Case 3: Display Empty Shopping Cart
. Description: Verify the behavior of displaying an empty shopping cart.
. Steps:
    1. Create a new ShoppingCart instance.
    2. Display the contents of the empty shopping cart.
. Expected Result: The shopping cart should indicate that it is empty, and the total price should be $0.00
. Actual Result: The empty shopping cart is displayed correctly with a total price of $0.00


Test Case 4: Display Product Details
. Description: Verify that product details are displayed correctly for different product type.
. Steps:
    1. Create instances of Book, Electronics, and Clothing.
    2. Call the displayDetails method on each product instance.
. Expected Result: Each product should display its specific details (e.g., author and genre for books, brand and warranty period for electronics, size and material for clothing).
. Actual Result: The product details for book, electronics, and clothing are displayed correctly with all specific attributes.


Test Case 5: Total Price Calculation
. Description: Verify that the total price in the shopping cart is calculated correctly.
. Steps:
    1. Add multiple products to the shopping cart with known prices.
    2. Display the contents of the shopping cart and check the total price.
. Expected Result: The total price should be the sum of the prices of all products in the shopping cart.
. Actual Result: The total price is calculated correctly as the sum of the prices of all products in the shopping cart.