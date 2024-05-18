package practices.computer.Case;

import java.util.ArrayList;

import static practices.computer.Case.Power.checkNumberInRange;
import static practices.computer.Case.Cpu.*;
import static practices.computer.display.Display.hasPart;

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
    public void setMainBoardBrand(){
        mainBoardBrand = mainBoardBrandsDataBase.get( checkNumberInRange(1,
                mainBoardBrandsDataBase.size(), "MainBoard brand" ,
                mainBoardBrandsDataBase) );
    }
    public void setNetworkCard(){
        networkCard = networkCardsDataBase.get( checkNumberInRange(1,
                networkCardsDataBase.size(), "Network Card type" ,
                networkCardsDataBase) );
    }
    public void setMaximumMemoryVolume(){
        maximumMemoryVolume = maximumVolumeOfMemoryDataBase.get(checkNumberInList(
                maximumVolumeOfMemoryDataBase,
                "maximum volume of memory in your main board")) ;
    }
    public void setMemoryGeneration(){
        memoryGeneration = generationOfMemoryDataBase.get(checkNumberInList(
                generationOfMemoryDataBase,
                "Memory generation (DDR3 or 4 or 5 )")) ;
    }
    public void setHasSata3Slot(){
        hasSata3Slot = hasPart("SATA3 slot" , "MainBoard");
    }

    public void setHasM2Slot() {
       hasM2Slot = hasPart("M.2 slot" , "MainBoard");;
    }


    public void setHasHdmi() {
        hasHdmi = hasPart("HDMI port" , "MainBoard");
    }

    public void setHasDisplayPort() {
        hasDisplayPort = hasPart("Display Port" , "MainBoard");
    }

    public void setHasDvi() {
        hasDvi = hasPart("DVI port" , "MainBoard");
    }

    public void setHasVga() {
        hasVga = hasPart("VGA port" , "MainBoard");
    }

    // --------------------------------- // getters // --------------------------------- //

    public void getHasM2Slot() {
        printResult("MainBoard has M.2 Slot" , String.valueOf(hasM2Slot)) ;
    }

    public void getHasSata3Slot() {
        printResult("MainBoard has Sata3 Slot" , String.valueOf(hasSata3Slot)) ;
    }

    public void getHasHdmi() {
        printResult("MainBoard has HDMI port" , String.valueOf(hasHdmi)) ;
    }

    public void getHasDisplayPort() {
        printResult("MainBoard has Display port" , String.valueOf(hasDisplayPort)) ;
    }

    public void getHasDvi() {
        printResult("MainBoard has DVI port" , String.valueOf(hasDvi)) ;
    }

    public void getHasVga() {
        printResult("MainBoard has VGA port" , String.valueOf(hasVga)) ;
    }

    public void getMaximumMemoryVolume() {
        printResult( "maximum memory volume" ,
                String.valueOf(maximumMemoryVolume).concat("GB")) ;
    }

    public void getMemoryGeneration() {
        printResult( "MainBoard memory generation" ,
                "DDR".concat(String.valueOf(memoryGeneration) ) ) ;
    }

    public void getNetworkCard() {
        printResult( "MainBoard network card" , networkCard);
    }

    public void getMainBoardBrand() {
        printResult("MainBoard brand" , mainBoardBrand);
    }
    // -------------------------- // other methods // --------------------------- //
    public static void printResult(String title , String titleValue){
        System.out.println(" Your " + title + " : " + titleValue);
    }
    // --------------------- // constructor && get instance of class// -------------------- //
    public MainBoard(){
        setMainBoardBrand();
        setNetworkCard();
        setMemoryGeneration();
        setMaximumMemoryVolume();
        // -------------------------- // set HAS methods // --------------------------- //
        setHasM2Slot();
        setHasSata3Slot();
        setHasDisplayPort();
        setHasHdmi();
        setHasDvi();
        setHasVga();
    }

    public static void getMainBoard(MainBoard mainBoard) {
        System.out.println("// -------------------------------- " +
                "// MainBoard // ----------------------------- //");
        mainBoard.getMainBoardBrand();
        mainBoard.getNetworkCard();
        mainBoard.getMaximumMemoryVolume();
        mainBoard.getMemoryGeneration();
        // -------------------------- // get HAS methods // --------------------------- //
        mainBoard.getHasDvi();
        mainBoard.getHasDisplayPort();
        mainBoard.getHasVga();
        mainBoard.getHasHdmi();
        mainBoard.getHasM2Slot();
        mainBoard.getHasSata3Slot();
    }
}
