package practices.computer.Case;
import java.util.ArrayList ;
import java.util.Scanner ;

import static practices.computer.Case.MainBoard.printResult;
public class Power {
    // ------------------------------ // variables // -------------------------------- //
    String powerBrand;
    // Green , Asus , TSCO , ....
    String powerFormFactor;
    // ATX PS2 ,
    int externalPowerNumberWatt ;
    String govahiname80Plus ;
    // gold , bronze , silver , basic
    static Scanner scanner = new Scanner (System.in) ;
    // ------------------------------- // DataBases // -------------------------------- //
    ArrayList <String> powerBrandsDataBase = new ArrayList<> ();
    ArrayList <String> powerFormFactorDataBase = new ArrayList<>() ;
    ArrayList <String> powerGovahiname80PlusStatusDataBase = new ArrayList<> () ;
    // --------------------- // add brands to DataBases // ------------------------ //
    {
        powerBrandsDataBase.add("Green");
        powerBrandsDataBase.add("Asus");
        powerBrandsDataBase.add("TSCO") ;
    }
    {
        powerFormFactorDataBase.add("ATX PS2") ;
        powerFormFactorDataBase.add("ATX12V V2.3") ;
    }
    {
        powerGovahiname80PlusStatusDataBase.add("bronze");
        powerGovahiname80PlusStatusDataBase.add("silver");
        powerGovahiname80PlusStatusDataBase.add("gold");
        powerGovahiname80PlusStatusDataBase.add("basic");
    }
    // ------------------------------- // setters // ---------------------------------- //
    public void setBrand(){
        this.powerBrand = powerBrandsDataBase.get(checkNumberInRange
                (0 , powerBrandsDataBase.size(), "power brand"
                        , powerBrandsDataBase )) ;
    }
    public void setPowerFormFactor(){
        this.powerFormFactor = powerFormFactorDataBase.get
                (checkNumberInRange(0 , powerFormFactorDataBase.size()
                        , "power form factor" , powerFormFactorDataBase)) ;
    }
    public void setGovahiname80Plus(){
        this.govahiname80Plus = powerGovahiname80PlusStatusDataBase.get(checkNumberInRange(
                0 , powerGovahiname80PlusStatusDataBase.size(),
                "power govahiname", powerGovahiname80PlusStatusDataBase) );
    }
    public void setExternalPowerNumberWatt(){
        do{
            System.out.println(" Please enter external power number ") ; 
            System.out.print(" >>> ");
            int checkNumber = scanner.nextInt();
            if (200 > checkNumber || 2000 < checkNumber){
                System.out.println(" !! Error !! Please try again ! ");
            }else {
                this.externalPowerNumberWatt = checkNumber ;
                break;
            }
            
        }while (true);
    }
    
    // ---------------------------- // other methods // ------------------------------- //
    public static void showDataBase(ArrayList dataBase ){
        for (int i = 0 ; i < dataBase.size() ; i ++ ){
            System.out.println(" " + (i + 1) + ". " + dataBase.get(i));
        }
    }
    public static int checkNumberInRange(int firstNumber , int finishedNumber ,
                                         String message , ArrayList dataBase){
        int checkNumber;
        do{
            showDataBase(dataBase) ; 
            System.out.println(" Choose " + message + " and enter its number ") ; 
            System.out.print(" >>> ");
            checkNumber = scanner.nextInt();
            if (firstNumber > checkNumber || finishedNumber < checkNumber){
                System.out.println(" !! Error !! Please try again ! ");
            }else {break;}
            
        }while (true);
        return checkNumber - 1 ;
    }
    // -------------------------------- // getters // ------------------------------- //

    public void getPowerBrand() {
        printResult("power brand",powerBrand);
    }

    public void getPowerFormFactor() {
        printResult("power form factor",powerFormFactor);
    }

    public void getExternalPowerNumberWatt() {
        printResult("external power number watt",
                String.valueOf(externalPowerNumberWatt));
    }

    public void getGovahiname80Plus() {
        printResult("govahiname 80Plus", String.valueOf(govahiname80Plus));
    }

    // ------------------------ // constructor && get instance of class // ------------------------ //
    public Power(){
        setBrand();
        setPowerFormFactor();
        setGovahiname80Plus();
        setExternalPowerNumberWatt();
    }

    public static void getPower(Power power){
        System.out.println("// -------------------------------- " +
                "// Power // ----------------------------- //");
        power.getPowerBrand();
        power.getPowerFormFactor();
        power.getExternalPowerNumberWatt();
        power.getGovahiname80Plus();
    }
}
