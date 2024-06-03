package practices.computer.Case.storage;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static practices.computer.Case.Power.checkNumberInRange;
import static practices.computer.Case.MainBoard.printResult;
import static practices.computer.Computer.creatDataBase;
import static practices.computer.display.Display.writeFile;

public class Ssd extends Storage {
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
