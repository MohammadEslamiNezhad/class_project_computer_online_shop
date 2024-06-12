import java.util.ArrayList;
import java.util.List;

public class Category  {
    private String name;
    private static List<String> features;
    private static List<Item> products;

    public Category(String name) {
        this.name = name;
        features = new ArrayList<>();
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getFeatures() {
        return features;
    }

    public List<Item> getProducts() {
        return products;
    }
    public static void showProducts() {
        for (Item item : products){
            for (String feature : features){
                System.out.println( feature + " : " + item.features.get(feature));
            }
        }
    }
    public void addProduct(Item product) {
        products.add(product);
    }

    public void addFeature(String feature) {
        features.add(feature);
    }
}