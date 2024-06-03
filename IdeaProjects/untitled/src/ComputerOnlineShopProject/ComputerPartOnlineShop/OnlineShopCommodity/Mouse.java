package practices.ComputerPartOnlineShop.OnlineShopCommodity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Scanner;

import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.creatDataBase;
import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.writeFile;

public class Mouse {

    Scanner scanner = new Scanner(System.in) ;
        // for scan data from user

    String mouseBrand;
    // Asus , Logitech , A4tech
    String mouseConnectionType;
    // wire , wireless

    String mouseFunction;
    // gaming , official

    static final String dataBaseFileName = "miceDataBase.json";
    ArrayList<String> miceBrandDataBase =  new ArrayList<>() ;
    // brands must be in this list
    static JSONArray miceArray = new JSONArray();

    // ------------------------------ / setters & getters / ------------------------------- //
    // ----------------------------------- / setters / ------------------------------------ //
    // ------------------------------- / DataBase setter / -------------------------------- //
    public void addMiceBrandDataBase() {
        miceBrandDataBase.add("Asus");
        miceBrandDataBase.add("A4tech");
        miceBrandDataBase.add("Logitech");
    }

    // --------------------------------------- / setters / ----------------------------------- //
    public String setMouseBrand() {
        addMiceBrandDataBase();
        for (int i = 0; i < miceBrandDataBase.size() ; i++) {
            System.out.println(" " + (i + 1) + ". " + miceBrandDataBase.get(i));
        }
        System.out.println("        ");
        int option ;
        do {
            System.out.print(" Choose keyboard brand and enter its number : ");
            option = scanner.nextInt() - 1  ;
            if (option < 0 || option >= miceBrandDataBase.size()) {
                System.out.println(" !! Error !! Please enter option correctly ! ");
            } else {break;}
        } while (true) ;
        mouseBrand = miceBrandDataBase.get(option);
        return mouseBrand;
    }
    public String setMouseConnectionType() {
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
                mouseConnectionType = "Wireless" ;
                break;

            case 2 :
                mouseConnectionType = "Wire" ;
        }
        return mouseConnectionType;
    }

    public String setMouseFunction() {
        int option ;
        do {
            System.out.println(" 1. Gaming ");
            System.out.println(" 2. Official ");
            System.out.println("           ");
            System.out.print(" Choose mouse function and enter its number : ");
            option = scanner.nextInt() ;

            if (option <= 0 || option > 2) {
                System.out.println(" !! Error !! Please enter option correctly ! ");
            } else {break;}
        }while (true) ;

        switch (option) {
            case  1 :
                mouseFunction = "Gaming" ;
                break;

            case 2 :
                mouseFunction = "Official" ;
        }
        System.out.println(" !! OKAY !! You have a " + mouseFunction + " mouse . ");
        return mouseFunction;
    }
    // -------------------------------- / object getter / ---------------------------------- //
    @Override
    public String toString() {
        return "Mouse{" +
                "mouseBrand='" + mouseBrand + '\'' +
                ", mouseConnectionType='" + mouseConnectionType + '\'' +
                ", mouseFunction='" + mouseFunction + '\'' +
                '}';
    }
    // --------------------------------- / constructor / ----------------------------------- //
    public Mouse(){
        setMiceDataBase();
    }
    // ------------------------------- / set JSON file  / --------------------------------- //
    public void setMiceDataBase() {
        JSONObject mouseObject = new JSONObject();
        mouseObject.put("Mouse brand", setMouseBrand());
        mouseObject.put("Mouse connection type", setMouseConnectionType());
        mouseObject.put("Mouse function", setMouseFunction());

        creatDataBase(dataBaseFileName);
        writeFile(mouseObject , miceArray , dataBaseFileName);
    }
}
