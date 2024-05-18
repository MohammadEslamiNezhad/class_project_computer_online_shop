package practices.computer.Case.storage;

import java.util.ArrayList;
import java.util.Scanner;

import static practices.computer.Case.Power.checkNumberInRange;
import static practices.computer.Case.MainBoard.printResult;

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
        this.ssdBrand = ssdBrandsDataBase.get(checkNumberInRange(0 ,
                ssdBrandsDataBase.size() , "SSD brand" , ssdBrandsDataBase ));
    }
    // ------------------------------------ / get brand / ------------------------------------ //
    public void getSsdBrand() {
        printResult( "SSD brand" , ssdBrand);
    }

    // ------------------------------------ / constructor / ------------------------------------ //
    public Ssd(){
        setHasSsd(true);
        setBrand();
        setVolume();
        setReadSpeed();
        setWriteSpeed();
    }
}