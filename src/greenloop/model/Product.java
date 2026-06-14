package greenloop.model;

public class Product {
    private String productId;
    private String name;
    private double price;
    private String ecoRating;

    public Product(String productId, String name, double price, String ecoRating) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.ecoRating = ecoRating;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getEcoRating() { return ecoRating; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setEcoRating(String ecoRating) { this.ecoRating = ecoRating; }
}