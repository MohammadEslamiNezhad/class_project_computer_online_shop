package practices.computer.Case.storage;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static practices.computer.Case.MainBoard.printResult;
import static practices.computer.Case.Power.checkNumberInRange;
import static practices.computer.Computer.creatDataBase;
import static practices.computer.display.Display.writeFile;

public class Hdd extends Storage {
    // ----------------------------------- / variables / ------------------------------------ //
    private String hddBrand;
    // WD , seagate , ...
    private final float RPM = 7.2f ;
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
    public void setBrand() {
        this.hddBrand = hddBrandsDataBase.get(checkNumberInRange(0,
                hddBrandsDataBase.size(),"HDD brand", hddBrandsDataBase));
    }

    // ------------------------------------ / constructor / ------------------------------------ //
    public Hdd(){
        setHasHdd(true);
        setBrand();
        setVolume();
        setReadSpeed();
        setWriteSpeed();
        setHddsDataBase();
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "hddBrand='" + hddBrand + '\'' +
                ", RPM=" + RPM +
                ", volume=" + volume +
                ", readSpeed=" + readSpeed +
                ", writeSpeed=" + writeSpeed +
                '}';
    }

    public void setHddsDataBase(){
        JSONObject hddObject = new JSONObject();
        hddObject.put("HDD brand", hddBrand);
        hddObject.put("HDD volume", volume);
        hddObject.put("HDD Read speed", readSpeed);
        hddObject.put("HDD Write speed", writeSpeed);
        hddObject.put("HDD RPM", RPM);
        creatDataBase("hddsDataBase.json");
        writeFile(hddObject , hddsArray , "hddsDataBase.json");
    }
}