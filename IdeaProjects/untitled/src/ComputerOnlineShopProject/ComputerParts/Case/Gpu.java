package practices.computer.Case;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static practices.computer.Case.MainBoard.printResult;
import static practices.computer.Case.Power.checkNumberInRange;
import static practices.computer.Case.Ram.checkNumberInRange;
import static practices.computer.Computer.creatDataBase;
import static practices.computer.display.Display.hasPart;
import static practices.computer.display.Display.writeFile;

public class Gpu {
    // ----------------------------------- // variables // -------------------------------- //
    private int memoryType ;
    // Gddr4 , 5 , 6 ...
    private int memoryVolume ;
    // GB
    private int bossBitsNumber ;
    // 64 , 256 , 128 , 512

    private boolean hasHdmi ;
    private boolean hasDisplayPort ;
    private boolean hasDvi ;
    private boolean hasVga ;
    // has the port or not .

    private String gpuBrand;
    // nvidia , amd , Asus , GIGABYTE

    // --------------------------------- // DataBases // ------------------------------ //
    ArrayList<String> gpuBrandsDataBase = new ArrayList<>();
    {
        gpuBrandsDataBase.add("GIGABYTE") ;
        gpuBrandsDataBase.add("nvidia") ;
        gpuBrandsDataBase.add("Asus") ;
        gpuBrandsDataBase.add("AMD") ;
    }
    ArrayList<Integer> gpuVolumesDataBase = new ArrayList<>();
    {
        gpuVolumesDataBase.add(8);
        gpuVolumesDataBase.add(16);
        gpuVolumesDataBase.add(32);
        gpuVolumesDataBase.add(64);
        gpuVolumesDataBase.add(128);
        gpuVolumesDataBase.add(256);
    }
    ArrayList<Integer> gpuBitsNumberDataBase = new ArrayList<>();
    {
        gpuBitsNumberDataBase.add(32);
        gpuBitsNumberDataBase.add(64);
        gpuBitsNumberDataBase.add(128);
        gpuBitsNumberDataBase.add(256);
        gpuBitsNumberDataBase.add(512);
        gpuBitsNumberDataBase.add(1024);
    }
    JSONArray gpusArray = new JSONArray() ;

    // ---------------------------------- // setters // -------------------------------- //

    public void setGpuBrand() {
        gpuBrand = gpuBrandsDataBase.get(checkNumberInRange(1,
                gpuBrandsDataBase.size(), "GPU brand" , gpuBrandsDataBase));
    }
    public void setMemoryType() {
        memoryType = checkNumberInRange(4,6 ,
                "your gpu type ( GDDR4 , 5 , 6 ) ") ;
    }

    public void setMemoryVolume() {
        memoryVolume = gpuVolumesDataBase.get(checkNumberInRange(0,
                gpuVolumesDataBase.size(), "GPU memory volume(GB)"
                ,gpuVolumesDataBase));
    }

    public void setBossBitsNumber() {
        bossBitsNumber = gpuVolumesDataBase.get(checkNumberInRange(0,
                gpuBitsNumberDataBase.size(), "gpu boss bits number" ,
                gpuBitsNumberDataBase));
    }

    public void setHasHdmi() {
        hasHdmi = hasPart("HDMI port" , "GPU");
    }

    public void setHasDisplayPort() {
        hasDisplayPort = hasPart("Display port"
                , "GPU");
    }

    public void setHasDvi() {
        hasDvi = hasPart("DVI port" , "GPU");
    }

    public void setHasVga() {
        hasVga = hasPart("VGA port" , "GPU");
    }

    // ---------------------------------- // getters // -------------------------------- //
    @Override
    public String toString() {
        return "Gpu{" +
                "memoryType=" + memoryType +
                ", memoryVolume=" + memoryVolume +
                ", bossBitsNumber=" + bossBitsNumber +
                ", hasHdmi=" + hasHdmi +
                ", hasDisplayPort=" + hasDisplayPort +
                ", hasDvi=" + hasDvi +
                ", hasVga=" + hasVga +
                ", gpuBrand='" + gpuBrand + '\'' +
                '}';
    }
    // -------------------- // constructor && getter instance of class // ------------------ //
    public Gpu(){
        setGpuBrand();
        setMemoryType();
        setMemoryVolume();
        setBossBitsNumber();
        setHasHdmi();
        setHasDisplayPort();
        setHasDvi();
        setHasVga();
        setGpusDataBase();
    }


    public void setGpusDataBase() {
        JSONObject gpuObject = new JSONObject();
        gpuObject.put("GPU brand", gpuBrand);
        gpuObject.put("GPU ", bossBitsNumber);
        gpuObject.put("GPU ", memoryVolume);
        gpuObject.put("GPU ", memoryType);
        gpuObject.put("GPU ", hasHdmi);
        gpuObject.put("GPU ", hasDisplayPort);
        gpuObject.put("GPU ", hasDvi);
        gpuObject.put("GPU ", hasVga);
        creatDataBase("GPUsDataBase.json");
        writeFile(gpuObject,gpusArray,"GPUsDataBase.json");
    }
}