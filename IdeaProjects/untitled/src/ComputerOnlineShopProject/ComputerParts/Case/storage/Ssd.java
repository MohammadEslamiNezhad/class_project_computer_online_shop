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
    public void setBrand() {
        this.ssdBrand = ssdBrandsDataBase.get(checkNumberInRange(0 ,
                ssdBrandsDataBase.size() , "SSD brand" , ssdBrandsDataBase ));
    }
    // ------------------------------------ / constructor / ------------------------------------ //
    public Ssd(){
        setHasSsd(true);
        setBrand();
        setVolume();
        setReadSpeed();
        setWriteSpeed();
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
        ssdObject.put("SSD brand", ssdBrand);
        ssdObject.put("SSD volume", volume);
        ssdObject.put("SSD Read speed", readSpeed);
        ssdObject.put("SSD Write speed", writeSpeed);
        creatDataBase("ssdsDataBase.json");
        writeFile(ssdObject , ssdsArray , "ssdsDataBase.json");
    }
}
