package practices.computer.Case.storage;

import java.util.ArrayList;
import java.util.Scanner;

public class Hdd extends Storage {
    // ----------------------------------- / variables / ------------------------------------ //
    private String hddBrand;
    // WD , seagate , ...
    private final float RPM = 7.2f ;
    // 1000 * RPM
    Scanner scanner = new Scanner(System.in) ;
    // ------------------------------------- / DataBase / ------------------------------------ //
    ArrayList<String> hddBrandsDataBase = new ArrayList<>() ;
    // --------------------------- / add brands to DataBase / ------------------------------- //
    {
        hddBrandsDataBase.add("WD (Western Digital)") ;
        hddBrandsDataBase.add("Seagate") ;
    }
    // ---------------------------------- / set hdd brand / ---------------------------------- //
    public void setBrand() {
        for (int i = 0; i < hddBrandsDataBase.size() ; i ++ ){
            System.out.println( ( i + 1 ) + ". " + hddBrandsDataBase.get(i)) ;
        }
        System.out.print(" Choose brand of HDD do you need and enter its number : ") ;
        int option = scanner.nextInt() ;
        this.hddBrand = hddBrandsDataBase.get(option);
    }
    // ------------------------------------ / RPM getter / ----------------------------------- //
    public float getRPM() {
        return RPM;
    }
    // ------------------------------------ / get brand / ------------------------------------ //
    public String getHddBrand() {
        return hddBrand;
    }
}