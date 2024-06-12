import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private String description;
    private List<String> features; // لیست ویژگی‌ها
    private List<Item> products;

    public Category(String name) {
        this.name = name;
        this.features = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public void addFeature(String feature) {
        features.add(feature);
    }

    public List<String> getFeatures() {
        return features;
    }

    public void addProduct(Item product) {
        products.add(product);
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        // NOTE: I assume you want to add a description field to the Category class
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public List<Item> getProducts() {
        return products;
    }

    // other getters and setters
}