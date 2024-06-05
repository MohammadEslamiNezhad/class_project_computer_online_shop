package practices.ComputerPartOnlineShop.OnlineShopCommodity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.*;

public class Ssd extends Storage implements ComputerPart {

    @Override
    public void setStore(int store) {}

    @Override
    public void setOwnerUserName(String ownerUserName) {}

    @Override
    public void setModel(String model) {}


    @Override
    public void setPrice(long price) {}


    @Override
    public int getStore() {
        return 0;
    }

    @Override
    public String getOwnerUserName() {
        return null;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public long getPrice() {
        return 0;
    }

    // ------------------------------------ / variables / ------------------------------------ //
    private String ssdBrand ;
    // Samsung , lexar , ...

    // ------------------------------------- / DataBase / ------------------------------------ //
    private final ArrayList<String> ssdBrandsDataBase = new ArrayList<>() ;
    // your choice for brand for ssd or hdd most be in there lists .
    JSONArray ssdsArray = new JSONArray() ;
    // ---------------------------- / add brands to DataBase / ----------------------------- //
    {
        ssdBrandsDataBase.add("Samsung") ;
        ssdBrandsDataBase.add("Lexar") ;
    }
    // ------------------------------------ / set brand / ------------------------------------ //
    @Override
    public String setBrand() {
        ssdBrand = ssdBrandsDataBase.get(checkNumberInRange(0 ,
                ssdBrandsDataBase.size() , "SSD brand" , ssdBrandsDataBase ));
        return ssdBrand;
    }
    // ------------------------------------ / constructor / ----------------------------------- //
    public Ssd(){
        setHasSsd(true);
        setSsdsDataBase();
    }

    @Override
    public String toString() {
        return "Ssd{" +
                "ssdBrand='" + ssdBrand + '\'' +
                ", volume=" + volume +
                ", readSpeed=" + readSpeed +
                ", writeSpeed=" + writeSpeed +
                '}';
    }

    public void setSsdsDataBase(){
        JSONObject ssdObject = new JSONObject();
        ssdObject.put("SSD brand", setBrand());
        ssdObject.put("SSD model", setStorageModel());
        ssdObject.put("SSD volume", setVolume());
        ssdObject.put("SSD Read speed", setReadSpeed());
        ssdObject.put("SSD Write speed", setWriteSpeed());
        creatDataBase("ssdsDataBase.json");
        writeFile(ssdObject , ssdsArray , "ssdsDataBase.json");
    }
}
