package practices.computer.Case;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Scanner;

import static practices.computer.Computer.creatDataBase;
import static practices.computer.display.Display.writeFile;

public class Ram {
    // --------------------- // reference type variables // ------------------------ //
    int ramGeneration ; 
    // ddr3 , 4 , 5 , ... 
    int ramFrequency ; 
    // MHz 
    int ramVolume ; 
    // GB 
    JSONArray ramsArray = new JSONArray() ;
    // --------------------- // primitive type variables // ------------------------ //
    String ramBrand ;
    String ramModel ;

    // ------------------------------- // databases // ----------------------------- //
    private final ArrayList <String> ramBrandsDataBase = new ArrayList<>() ;
    
    // -------------------------- // add brands to the database // ------------------------- //
    {
        ramBrandsDataBase.add("kingston") ; 
        ramBrandsDataBase.add("HP") ; 
        ramBrandsDataBase.add("Samsung") ;
    }
    // ----------------------------- // primitive type setters // --------------------------- //
    public String setRamBrand(){
        for (int i = 0 ; i < ramBrandsDataBase.size() ; i ++ ){
            System.out.println(" " + (i + 1) + ". " + ramBrandsDataBase.get(i));
        }
        int option = checkNumberInRange(0,ramBrandsDataBase.size() ,
                " computer RAM ") ;
        ramBrand = ramBrandsDataBase.get(option - 1) ;
        return ramBrand ;
    }

    public String setRamModel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" What is your power model ? ");
        this.ramModel = scanner.nextLine();
        return ramModel;
    }

    public int setRamGeneration(){
        ramGeneration = checkNumberInRange(3,5,
                " RAM generation (From DDR3 to DDR5)");
        return ramGeneration ;
    }
    public int setRamFrequency() {
        ramFrequency = checkNumberInRange(1000,4000,
                " RAM frequency (MHz)") ;
        return ramFrequency ;
    }
    public int setRamVolume(){
        ramVolume = checkRamVolumeNumber(checkNumberInRange(0,64," RAM volume " + " ( 2 , 4 , 8 , 16 , 32 , 64 )"));
        return ramVolume ;
    }

    // ------------------------------------- // getters // ----------------------------------- //

    @Override
    public String toString() {
        return "Ram{" +
                "ramGeneration : " + "DDr" + ramGeneration +
                ", ramFrequency : " + ramFrequency + "MHz" +
                ", ramVolume : " + ramVolume + "GB" +
                ", ramBrand : " + ramBrand +
                ", ramModel : " + ramModel +
                '}';
    }

    // -------------------------------- // other methods // ------------------------------- //

    public static int checkNumberInRange(int firstNumber , int finishedNumber , String message){
        int checkNumber;
        do{
            System.out.print(" Please enter " + message + " of your system : ") ;
            checkNumber = new Scanner(System.in).nextInt();
            if (firstNumber > checkNumber || finishedNumber < checkNumber){
                System.out.println(" !! Error !! Please try again ! ");
            }else {break;}

        }while (true);
        return checkNumber ;
    }
    
    public int checkRamVolumeNumber(int volumeNumber) {
        if (volumeNumber % 2 == 1){
            System.out.println(" !! Error !! Please enter volume number correctly ! ") ; 
            return 0 ; 
        }else {
            return volumeNumber ; 
        }
    }

    // ---------------------------------- // constructor // -------------------------------- //
    public Ram(){
        setRamsDataBase();
    }

    // ------------------------------- // JSON file writer // ------------------------------ //
    public void setRamsDataBase() {
        JSONObject ramObject = new JSONObject();
        ramObject.put("Ram brand", setRamBrand());
        ramObject.put("Ram model", setRamModel());
        ramObject.put("Ram frequency", setRamFrequency());
        ramObject.put("Ram generation", setRamGeneration());
        ramObject.put("Ram volume", setRamVolume());
        creatDataBase("RAMsDataBase.json");
        writeFile(ramObject,ramsArray,"RAMsDataBase.json");
    }
}