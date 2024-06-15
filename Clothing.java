public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String id, String name, double price, String size, String material) {
        super(id, name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}