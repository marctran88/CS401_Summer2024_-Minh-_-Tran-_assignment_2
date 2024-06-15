public class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    public Electronics(String id, String name, double price, String brand, int warrantyPeriod) {
        super(id, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}