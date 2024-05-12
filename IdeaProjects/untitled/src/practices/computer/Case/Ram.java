package practices.computer.Case;
import java.util.ArrayList ;
import java.util.Scanner ; 
public class Ram {
    // --------------------- // reference type variables // ------------------------ //
    int ramGeneration ; 
    // ddr3 , 4 , 5 , ... 
    int ramFrequency ; 
    // MHz 
    int ramVolume ; 
    // GB 
    
    // --------------------- // primitive type variables // ------------------------ //
    String ramBrand ;
    Scanner scanner = new Scanner(System.in);
    // ------------------------------- // databases // ----------------------------- //
    private final ArrayList <String> ramBrandsDataBase = new ArrayList<>() ;
    
    // -------------------------- // add brands to the database // ------------------------- //
    {
        ramBrandsDataBase.add("kingston") ; 
        ramBrandsDataBase.add("HP") ; 
        ramBrandsDataBase.add("Samsung") ;
    }
    // ----------------------------- // primitive type setters // --------------------------- //
    public void setRamBrand(){
        for (int i = 0 ; i < ramBrandsDataBase.size() ; i ++ ){
            System.out.println(" " + (i + 1) + ". " + ramBrandsDataBase.get(i));
        }
        int option = checkNumberInRange(0,ramBrandsDataBase.size() ,
                " computer RAM ") ;
        ramBrand = ramBrandsDataBase.get(option - 1) ;
    }

    // ------------------------------- // primitive type setters // ----------------------------- //
    public void setRamGeneration(){
        ramGeneration = checkNumberInRange(3,5," RAM generation (From DDR3 to DDR5)");
    }
    public void setRamFrequency() {
        ramFrequency = checkNumberInRange(1000,4000," RAM frequency (MHz)") ;
    }
    public void setRamVolume(){
        ramVolume = checkRamVolumeNumber(checkNumberInRange(0,64," RAM volume " + " ( 2 , 4 , 8 , 16 , 32 , 64 )"));
    }
    // ----------------------------------- // other methods // --------------------------------- //
    
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
}