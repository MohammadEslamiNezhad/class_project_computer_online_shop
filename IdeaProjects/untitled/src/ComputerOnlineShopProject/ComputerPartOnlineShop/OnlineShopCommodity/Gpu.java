package practices.ComputerPartOnlineShop.OnlineShopCommodity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import static practices.ComputerPartOnlineShop.OnlineShopCommodity.Display.hasPart;
import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.*;

public class Gpu implements ComputerPart{
    @Override
    public void setStore(int store) {

    }

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
        return null ;
    }

    @Override
    public String getBrand() {
        return gpuBrand ;
    }

    @Override
    public String getModel() {
        return null ;
    }

    @Override
    public long getPrice() {
        return 0 ;
    }

    // ----------------------------------- // variables // -------------------------------- //
    private int memoryType ;
    // GDdr4 , 5 , 6 ...
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
        gpuVolumesDataBase.add(512);
        gpuVolumesDataBase.add(1024);
        gpuVolumesDataBase.add(2056);
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
    @Override
    public String setBrand() {
        gpuBrand = gpuBrandsDataBase.get(checkNumberInRange(1,
                gpuBrandsDataBase.size(), "GPU brand" , gpuBrandsDataBase));
        return gpuBrand ;
    }
    public int setMemoryType() {
        memoryType = checkNumberInRange(4,6 ,
                "your gpu type ( GDdr4 , 5 , 6 ) ") ;
        return memoryType ;
    }

    public int setMemoryVolume() {
        memoryVolume = gpuVolumesDataBase.get(checkNumberInRange(0,
                gpuVolumesDataBase.size(), "GPU memory volume(GB)"
                ,gpuVolumesDataBase));
        return memoryVolume;
    }

    public int setBossBitsNumber() {
        bossBitsNumber = gpuVolumesDataBase.get(checkNumberInRange(0,
                gpuBitsNumberDataBase.size(), "gpu boss bits number" ,
                gpuBitsNumberDataBase));
        return bossBitsNumber ;
    }

    public boolean setHasHdmi() {
        hasHdmi = hasPart("HDMI port" , "GPU");
        return hasHdmi ;
    }

    public boolean setHasDisplayPort() {
        hasDisplayPort = hasPart("Display port"
                , "GPU");
        return hasDisplayPort ;
    }

    public boolean setHasDvi() {
        hasDvi = hasPart("DVI port" , "GPU");
        return hasDvi ;
    }

    public boolean setHasVga() {
        hasVga = hasPart("VGA port" , "GPU");
        return hasVga ;
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

    // ---------------------------------- // constructor // -------------------------------- //
    public Gpu(){
        setGpusDataBase();
    }

    // --------------------------------- // set JSON file // -------------------------------- //
    public void setGpusDataBase() {
        JSONObject gpuObject = new JSONObject();
        gpuObject.put("GPU brand", setBrand());
        gpuObject.put("GPU ", setBossBitsNumber());
        gpuObject.put("GPU ", setMemoryVolume());
        gpuObject.put("GPU ", setMemoryType());
        gpuObject.put("GPU ", setHasHdmi());
        gpuObject.put("GPU ", setHasDisplayPort());
        gpuObject.put("GPU ", setHasVga());
        gpuObject.put("GPU ", setHasDvi());
        creatDataBase("GPUsDataBase.json");
        writeFile(gpuObject,gpusArray,"GPUsDataBase.json");
    }
}
