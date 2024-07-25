public class Product {
    private final double cost;
    private final int quantity;

    public Product(String productName, double cost, int quantity) {
        this.cost = cost;
        this.quantity = quantity;
    }

    public void totalCost() {
        double totalCost = cost * quantity;
        System.out.println("Total cost is " + totalCost);
    }

    public void printProduct() {
        System.out.println("Gallon of gas costs " + cost + " and " + quantity + " units were purchased");
    }

    public static void main(String[] args) {
        Product gas = new Product("Gas", 4.0, 10);
        gas.printProduct();
        gas.totalCost();
    }
}
