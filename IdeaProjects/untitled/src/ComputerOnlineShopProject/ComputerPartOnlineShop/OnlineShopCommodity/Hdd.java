package practices.ComputerPartOnlineShop.OnlineShopCommodity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.*;

public class Hdd extends Storage implements ComputerPart {

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

    // ----------------------------------- / variables / ------------------------------------ //
    private String hddBrand;
    // WD , seagate , ...
    private int rpm;
    // 1000 * RPM

    // ------------------------------------- / DataBase / ------------------------------------ //
    ArrayList<String> hddBrandsDataBase = new ArrayList<>() ;
    JSONArray hddsArray = new JSONArray() ;
    // --------------------------- / add brands to DataBase / ------------------------------- //
    {
        hddBrandsDataBase.add("WD (Western Digital)") ;
        hddBrandsDataBase.add("Seagate") ;
    }
    // ---------------------------------- / set hdd brand / ---------------------------------- //
    @Override
    public String setBrand() {
        this.hddBrand = hddBrandsDataBase.get(checkNumberInRange(0,
                hddBrandsDataBase.size(),"HDD brand", hddBrandsDataBase));
        return hddBrand;
    }

    public int setRpm(){
        System.out.print(" Please enter RPM of your HDD : ");
        rpm = numberScanner.nextInt();
        return rpm;
    }
    // ------------------------------------ / constructor / ------------------------------------ //
    public Hdd(){
        setHasHdd(true);
        setHddsDataBase();
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "hddBrand='" + hddBrand + '\'' +
                ", RPM=" + rpm +
                ", volume=" + volume +
                ", readSpeed=" + readSpeed +
                ", writeSpeed=" + writeSpeed +
                '}';
    }

    public void setHddsDataBase(){
        JSONObject hddObject = new JSONObject();
        hddObject.put("HDD brand", setBrand());
        hddObject.put("HDD model", setStorageModel());
        hddObject.put("HDD volume", setVolume());
        hddObject.put("HDD Read speed", setReadSpeed());
        hddObject.put("HDD Write speed", setWriteSpeed());
        hddObject.put("HDD RPM", setRpm());
        creatDataBase("hddsDataBase.json");
        writeFile(hddObject , hddsArray , "hddsDataBase.json");
    }
}
