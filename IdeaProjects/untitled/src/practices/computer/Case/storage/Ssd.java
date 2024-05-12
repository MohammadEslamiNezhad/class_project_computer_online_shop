package practices.computer.Case.storage;

import java.util.ArrayList;
import java.util.Scanner;

public class Ssd extends Storage {
    // ------------------------------------ / variables / ------------------------------------ //
    private String ssdBrand ;
    // Samsung , lexar , ...
    private final Scanner scanner = new Scanner(System.in) ;

    // ------------------------------------- / DataBase / ------------------------------------ //
    private final ArrayList<String> ssdBrandsDataBase = new ArrayList<>() ;
    // your choice for brand for ssd or hdd most be in there lists .

    // ---------------------------- / add brands to DataBase / ----------------------------- //
    {
        ssdBrandsDataBase.add("Samsung") ;
        ssdBrandsDataBase.add("Lexar") ;
    }
    // ------------------------------------ / set brand / ------------------------------------ //
    public void setBrand() {
        for (int i = 0; i < ssdBrandsDataBase.size() ; i ++ ){
            System.out.println( ( i + 1 ) + ". " + ssdBrandsDataBase.get(i)) ;
        }
        System.out.print(" Choose brand of HDD do you need and enter its number : ") ;
        int option = scanner.nextInt() ;
        this.ssdBrand = ssdBrandsDataBase.get(option);
    }
    // ------------------------------------ / get brand / ------------------------------------ //
    public String getSsdBrand() {
        return ssdBrand;
    }

}