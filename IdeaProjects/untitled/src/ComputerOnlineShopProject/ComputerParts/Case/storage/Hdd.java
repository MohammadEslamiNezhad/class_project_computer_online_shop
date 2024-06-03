package practices.computer.Case.storage;

import org.json.JSONArray;
import org.json.JSONObject;
import practices.computer.Computer;

import java.util.ArrayList;

import static practices.computer.Case.Power.checkNumberInRange;
import static practices.computer.Computer.creatDataBase;
import static practices.computer.display.Display.writeFile;

public class Hdd extends Storage {
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
    public String setBrand() {
        this.hddBrand = hddBrandsDataBase.get(checkNumberInRange(0,
                hddBrandsDataBase.size(),"HDD brand", hddBrandsDataBase));
        return hddBrand;
    }

    public int setRpm(){
        System.out.print(" Please enter RPM of your HDD : ");
        rpm = Computer.numberScanner.nextInt();
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