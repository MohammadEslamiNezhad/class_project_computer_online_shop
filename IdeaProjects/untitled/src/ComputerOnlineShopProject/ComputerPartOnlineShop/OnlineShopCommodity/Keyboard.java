package practices.ComputerPartOnlineShop.OnlineShopCommodity;

import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.creatDataBase;
import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.writeFile;

public class Keyboard implements ComputerPart{
    String keyboardBrand;
    String keyboardConnectionType;
    // wire , wireless
    String keyboardFunction;
    // gaming , official
    final String dataBaseFileName = "keyboardsDataBase.json";

    JSONArray keyboardsArray = new JSONArray();

    // ------------------------------- / Brands DataBase / ------------------------------- //
    private final ArrayList<String> keyboardBrandsDataBase = new ArrayList<>() ;
    private final Scanner scanner = new Scanner(System.in) ;

    // ----------------------------- / setters & getters / ------------------------------ //
    // ---------------------------------- / setters / ----------------------------------- //
    // ------------------------------ / DataBase setter / ------------------------------- //
    private void setKeyboardBrandsDataBase() {
        keyboardBrandsDataBase.add("Green") ;
        keyboardBrandsDataBase.add("Logitech") ;
        keyboardBrandsDataBase.add("TSCO") ;
    }
    // ------------------------------- / variables setter / -------------------------------- //

    public String setKeyboardBrand() {
        setKeyboardBrandsDataBase();
        for (int i = 0; i < keyboardBrandsDataBase.size() ; i++) {
            System.out.println(" " + (i + 1) + ". " + keyboardBrandsDataBase.get(i));
        }
        System.out.println("        ");
        int option ;
        do {
            System.out.print(" Choose keyboard brand and enter its number : ");
            option = scanner.nextInt() - 1  ;
            if (option < 0 || option >= keyboardBrandsDataBase.size()) {
                System.out.println(" !! Error !! Please enter option correctly ! ");
            } else {break;}
        } while (true) ;
        this.keyboardBrand = keyboardBrandsDataBase.get(option);
        System.out.println(" " + keyboardBrand + " Very nice choice ! ");
        return keyboardBrand;
    }
    public String setKeyboardConnectionType() {
        int option ;
        do {
            System.out.println(" 1. Wireless ");
            System.out.println(" 2. Wire ");
            System.out.println("            ");
            System.out.print(" Choose mouse connection type and enter its number : ");
            option = scanner.nextInt();

            if (option <= 0 || option > 2) {
                System.out.println(" !! Error !! Please enter option correctly ! ");
            } else {break;}
        }while (true) ;

        switch (option) {
            case  1 :
                keyboardConnectionType = "Wireless" ;
                break;

            case 2 :
                keyboardConnectionType = "Wire" ;
        }
        System.out.println(" You have a " + keyboardConnectionType + " keyboard . ");
        return keyboardConnectionType;
    }

    public String setKeyboardFunction() {
        int option ;
        do {
            System.out.println(" 1. Gaming ");
            System.out.println(" 2. Official ");
            System.out.println("           ");
            System.out.print(" Choose keyboard function and enter its number : ");
            option = scanner.nextInt() ;

            if (option <= 0 || option > 2) {
                System.out.println(" !! Error !! Please enter option correctly ! ");
            } else {break;}
        }while (true) ;

        switch (option) {
            case  1 :
                keyboardFunction = "Gaming" ;
                break;

            case 2 :
                keyboardFunction = "Official" ;
        }
        System.out.println(" !! OKAY !! You have a " + keyboardFunction + " keyboard . ");
        return keyboardFunction;
    }

    // ---------------------------------- / object getter / ----------------------------------- //

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardBrand='" + keyboardBrand + '\'' +
                ", keyboardConnectionType='" + keyboardConnectionType + '\'' +
                ", keyboardFunction='" + keyboardFunction + '\'' +
                '}';
    }

    // --------------------------------- / constructor / ----------------------------------- //
    public Keyboard() {
            setKeyBoardsDataBase();
    }
    // ------------------------------- / set JSON file  / --------------------------------- //
    public void setKeyBoardsDataBase(){
        JSONObject keyboardObject = new JSONObject();
        keyboardObject.put("Keyboard brand", setKeyboardBrand());
        keyboardObject.put("Keyboard connection type", setKeyboardConnectionType());
        keyboardObject.put("Keyboard function", setKeyboardFunction());
        creatDataBase(dataBaseFileName);
        writeFile(keyboardObject , keyboardsArray , dataBaseFileName);
    }

    @Override
    public void setStore(int store) {

    }

    @Override
    public void setOwnerUserName(String ownerUserName) {

    }

    @Override
    public String setBrand() {setKeyboardBrandsDataBase();
        for (int i = 0; i < keyboardBrandsDataBase.size() ; i++) {
            System.out.println(" " + (i + 1) + ". " + keyboardBrandsDataBase.get(i));
        }
        System.out.println("        ");
        int option ;
        do {
            System.out.print(" Choose keyboard brand and enter its number : ");
            option = scanner.nextInt() - 1  ;
            if (option < 0 || option >= keyboardBrandsDataBase.size()) {
                System.out.println(" !! Error !! Please enter option correctly ! ");
            } else {break;}
        } while (true) ;
        this.keyboardBrand = keyboardBrandsDataBase.get(option);
        System.out.println(" " + keyboardBrand + " Very nice choice ! ");
        return keyboardBrand;
    }

    @Override
    public void setModel(String model) {

    }

    @Override
    public void setPrice(long price) {

    }

    @Override
    public int getStore() {
        return 0;
    }

    @Override
    public String getOwnerUserName() {
        return null;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public long getPrice() {
        return 0;
    }
}
