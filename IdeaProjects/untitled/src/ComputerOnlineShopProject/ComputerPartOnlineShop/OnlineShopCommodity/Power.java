package practices.ComputerPartOnlineShop.OnlineShopCommodity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Scanner;

import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.*;

public class Power implements ComputerPart{

    // ------------------------------ // variables // -------------------------------- //
    String powerBrand;
    // Green , Asus , TSCO , ....
    String powerModel ;
    int externalPowerNumberWatt ;
    String govahiname80Plus ;
    // gold , bronze , silver , basic
    static Scanner scanner = new Scanner (System.in) ;

    // ------------------------------- // DataBases // -------------------------------- //
    ArrayList<String> powerBrandsDataBase = new ArrayList<> ();
    ArrayList <String> powerGovahiname80PlusStatusDataBase = new ArrayList<> () ;
    JSONArray powersArray = new JSONArray() ;
    // --------------------- // add brands to DataBases // ------------------------ //
    {
        powerBrandsDataBase.add("Green");
        powerBrandsDataBase.add("Asus");
    }
    {
        powerGovahiname80PlusStatusDataBase.add("bronze");
        powerGovahiname80PlusStatusDataBase.add("silver");
        powerGovahiname80PlusStatusDataBase.add("gold");
        powerGovahiname80PlusStatusDataBase.add("basic");
    }

    // ------------------------------- // setters // ---------------------------------- //
    public String setBrand(){
        this.powerBrand = powerBrandsDataBase.get(checkNumberInRange
                (0 , powerBrandsDataBase.size(), "power brand"
                        , powerBrandsDataBase )) ;
        return powerBrand ;
    }
    public String setPowerModel() {
        System.out.print(" Please enter your power model :");
        this.powerModel = stringScanner.nextLine();
        return powerModel;
    }
    public String setGovahiname80Plus(){
        this.govahiname80Plus = powerGovahiname80PlusStatusDataBase.get(checkNumberInRange(
                0 , powerGovahiname80PlusStatusDataBase.size(),
                "power govahiname", powerGovahiname80PlusStatusDataBase) );
        return govahiname80Plus ;
    }
    public int setExternalPowerNumberWatt(){
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
        return externalPowerNumberWatt ;
    }

    // ----------------------------------- // getters // ---------------------------------- //
    @Override
    public String toString() {
        return "Power{" +
                "powerBrand='" + powerBrand + '\'' +
                "powerModel='" + powerModel + '\'' +
                ", externalPowerNumberWatt=" + externalPowerNumberWatt +
                ", govahiname80Plus='" + govahiname80Plus + '\'' +
                '}';
    }
    // ---------------------------------- // constructor // --------------------------------- //
    public Power(){
        setPowersDataBase();
    }

    // -------------------------------- // set JSON file // ------------------------------- //
    public void setPowersDataBase() {
        JSONObject powerObject = new JSONObject();
        powerObject.put("Power brand", setBrand());
        powerObject.put("Power model", setPowerModel());
        powerObject.put("External power number (Watt)", setExternalPowerNumberWatt());
        powerObject.put("Power govahiname 80Plus", setGovahiname80Plus());
        creatDataBase("PowersDataBase.json");
        writeFile(powerObject,powersArray,"PowersDataBase.json");
    }

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
        return null ;
    }

    @Override
    public String getModel() {
        return null ;
    }

    @Override
    public long getPrice() {
        return 0 ;
    }
}
