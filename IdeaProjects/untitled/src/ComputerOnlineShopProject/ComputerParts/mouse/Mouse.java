package practices.computer.mouse;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Scanner;

import static practices.computer.Computer.creatDataBase;
import static practices.computer.display.Display.writeFile;

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
    ArrayList <String> miceBrandDataBase =  new ArrayList<>() ;
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

    // ---------------------------- / primitive type setter / ----------------------------- //
    public void setMouseBrand() {
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
    }
    public void setMouseConnectionType() {
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
    }

    public void setMouseFunction() {
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
    }

    // ---------------------------------- / getter / ----------------------------------- //
    @Override
    public String toString() {
        return "Mouse{" +
                "mouseBrand : \"" + mouseBrand + '\"' +
                ", mouseConnectionType : \"" + mouseConnectionType + '\"' +
                ", mouseFunction : \"" + mouseFunction + '\"' +
                '}';
    }

    // --------------------------------- / constructor / ----------------------------------- //
    public Mouse(){
        setMouseBrand();
        setMouseConnectionType();
        setMouseFunction();
        setMiceDataBase(this);
    }
    public static void setMiceDataBase(Mouse mouse) {
        JSONObject mouseObject = new JSONObject();
        mouseObject.put("Mouse brand", mouse.mouseBrand);
        mouseObject.put("Mouse connection type", mouse.mouseConnectionType);
        mouseObject.put("Mouse function", mouse.mouseFunction);

        creatDataBase(dataBaseFileName);
        writeFile(mouseObject , miceArray , dataBaseFileName);
    }
}
