
import java.util.HashMap;
import java.util.Map;

public class Item {
    String itemName ; 
    String category ;
    int price ;
    int quantity ;
    Map<String, String> features = new HashMap<>() ;
    public Item(String itemName,Map<String, String> features ,int price,int quantity  ) {

    }
}
