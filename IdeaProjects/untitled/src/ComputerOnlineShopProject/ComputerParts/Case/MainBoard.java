package practices.computer.Case;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import static practices.computer.Case.Power.checkNumberInRange;
import static practices.computer.Case.Cpu.*;
import static practices.computer.Computer.creatDataBase;
import static practices.computer.display.Display.hasPart;
import static practices.computer.display.Display.writeFile;

public class MainBoard {
    // -------------------------------- // Variables // --------------------------------- //
    boolean hasM2Slot ;
    boolean hasSata3Slot ;
    boolean hasHdmi ;
    boolean hasDisplayPort ;
    boolean hasDvi ;
    boolean hasVga ;

    int maximumMemoryVolume ;
    int memoryGeneration ;

    String networkCard ;
    String mainBoardBrand;

    // --------------------------------- // DataBase // ---------------------------------- //
    ArrayList <String> mainBoardBrandsDataBase = new ArrayList<>();
    ArrayList <String> networkCardsDataBase = new ArrayList<>();
    ArrayList <Integer> maximumVolumeOfMemoryDataBase = new ArrayList<>();
    ArrayList <Integer> generationOfMemoryDataBase = new ArrayList<>();
    JSONArray mainBoardsArray = new JSONArray() ;
    // -------------------------- // add brands to DataBase // --------------------------- //
    {
        mainBoardBrandsDataBase.add("Asus") ;
        mainBoardBrandsDataBase.add("GIGABYTE");
        mainBoardBrandsDataBase.add("MSI");
    }
    {
        networkCardsDataBase.add("Ethernet");
        networkCardsDataBase.add("Fast Ethernet");
        networkCardsDataBase.add("Gigabit Ethernet");
        networkCardsDataBase.add("Wireless");
        networkCardsDataBase.add("Optical Fiber");
    }
    {
        maximumVolumeOfMemoryDataBase.add(16);
        maximumVolumeOfMemoryDataBase.add(32);
        maximumVolumeOfMemoryDataBase.add(64);
    }
    {
        generationOfMemoryDataBase.add(3);
        generationOfMemoryDataBase.add(4);
        generationOfMemoryDataBase.add(5);
    }
    // --------------------------------- // setters // --------------------------------- //
    public String setMainBoardBrand(){
        mainBoardBrand = mainBoardBrandsDataBase.get( checkNumberInRange(1,
                mainBoardBrandsDataBase.size(), "MainBoard brand" ,
                mainBoardBrandsDataBase) );
        return mainBoardBrand;
    }
    public String setNetworkCard(){
        networkCard = networkCardsDataBase.get( checkNumberInRange(1,
                networkCardsDataBase.size(), "Network Card type" ,
                networkCardsDataBase) );
        return networkCard;
    }
    public int setMaximumMemoryVolume(){
        maximumMemoryVolume = maximumVolumeOfMemoryDataBase.get(checkNumberInList(
                maximumVolumeOfMemoryDataBase,
                "maximum volume of memory in your main board")) ;
        return maximumMemoryVolume;
    }
    public int setMemoryGeneration(){
        memoryGeneration = generationOfMemoryDataBase.get(checkNumberInList(
                generationOfMemoryDataBase,
                "Memory generation (DDR3 or 4 or 5 )")) ;
        return memoryGeneration;
    }
    public boolean setHasSata3Slot(){
        hasSata3Slot = hasPart("SATA3 slot" , "MainBoard");
        return hasSata3Slot;
    }

    public boolean setHasM2Slot() {
       hasM2Slot = hasPart("M.2 slot" , "MainBoard");
       return hasM2Slot;
    }


    public boolean setHasHdmi() {
        hasHdmi = hasPart("HDMI port" , "MainBoard");
        return hasHdmi;
    }

    public boolean setHasDisplayPort() {
        hasDisplayPort = hasPart("Display Port" , "MainBoard");
        return hasDisplayPort;
    }

    public boolean setHasDvi() {
        hasDvi = hasPart("DVI port" , "MainBoard");
        return hasDvi;
    }

    public boolean setHasVga() {
        hasVga = hasPart("VGA port" , "MainBoard");
        return hasVga;
    }

    // ----------------------------------- // getter// ------------------------------------ //
    @Override
    public String toString() {
        return "MainBoard{" +
                "hasM2Slot=" + hasM2Slot +
                ", hasSata3Slot=" + hasSata3Slot +
                ", hasHdmi=" + hasHdmi +
                ", hasDisplayPort=" + hasDisplayPort +
                ", hasDvi=" + hasDvi +
                ", hasVga=" + hasVga +
                ", maximumMemoryVolume=" + maximumMemoryVolume +
                ", memoryGeneration=" + memoryGeneration +
                ", networkCard='" + networkCard + '\'' +
                ", mainBoardBrand='" + mainBoardBrand + '\'' +
                '}';
    }
    // -------------------------------- // other methods // --------------------------------- //
    public static void printResult(String title , String titleValue){
        System.out.println(" Your " + title + " : " + titleValue);
    }
    // ----------------------------------- // constructor// -------------------------------- //
    public MainBoard(){
        setMainBoardsDataBase();
    }

    public void setMainBoardsDataBase(){
        JSONObject mainBoardObject = new JSONObject();
        mainBoardObject.put("MainBoard brand", setMainBoardBrand());
        mainBoardObject.put("MainBoard network card", setNetworkCard());
        mainBoardObject.put("MainBoard memory generation", setMemoryGeneration());
        mainBoardObject.put("MainBoard maximum memory volume", setMaximumMemoryVolume());
        mainBoardObject.put("MainBoard has M.2 slot", setHasM2Slot());
        mainBoardObject.put("MainBoard has SATA3 slot", setHasSata3Slot());
        mainBoardObject.put("MainBoard has HDMI", setHasHdmi());
        mainBoardObject.put("MainBoard has Display port", setHasDisplayPort());
        mainBoardObject.put("MainBoard has VGA", setHasVga());
        mainBoardObject.put("MainBoard has DVI", setHasDvi());
        creatDataBase("MainBoardsDataBase.json");
        writeFile(mainBoardObject , mainBoardsArray,"MainBoardsDataBase.json");
    }

}