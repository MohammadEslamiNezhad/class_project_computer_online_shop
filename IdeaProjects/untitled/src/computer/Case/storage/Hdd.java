package practices.computer.Case.storage;

import java.util.ArrayList;
import java.util.Scanner;

import static practices.computer.Case.MainBoard.printResult;
import static practices.computer.Case.Power.checkNumberInRange;

public class Hdd extends Storage {
    // ----------------------------------- / variables / ------------------------------------ //
    private String hddBrand;
    // WD , seagate , ...
    private final float RPM = 7.2f ;
    // 1000 * RPM

    // ------------------------------------- / DataBase / ------------------------------------ //
    ArrayList<String> hddBrandsDataBase = new ArrayList<>() ;
    // --------------------------- / add brands to DataBase / ------------------------------- //
    {
        hddBrandsDataBase.add("WD (Western Digital)") ;
        hddBrandsDataBase.add("Seagate") ;
    }
    // ---------------------------------- / set hdd brand / ---------------------------------- //
    public void setBrand() {
        this.hddBrand = hddBrandsDataBase.get(checkNumberInRange(0,
                hddBrandsDataBase.size(),"HDD brand", hddBrandsDataBase));
    }
    // ------------------------------------ / RPM getter / ----------------------------------- //
    public void getRPM() {
        printResult("RPM" , String.valueOf(RPM).concat("RPM"));
    }
    // ------------------------------------ / get brand / ------------------------------------ //
    public void getHddBrand() {
        printResult("HDD brand" , hddBrand);
    }

    // ------------------------------------ / constructor / ------------------------------------ //
    public Hdd(){
        setHasHdd(true);
        setBrand();
        setVolume();
        setReadSpeed();
        setWriteSpeed();
    }
}