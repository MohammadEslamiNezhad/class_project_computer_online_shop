import java.util.Map;

public class Item {
    private String name;
    private Map<String, String> featuresValues;

    public Item(String name, Map<String, String> featuresValues) {
        this.name = name;
        this.featuresValues = featuresValues;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getFeaturesValues() {
        return featuresValues;
    }
}