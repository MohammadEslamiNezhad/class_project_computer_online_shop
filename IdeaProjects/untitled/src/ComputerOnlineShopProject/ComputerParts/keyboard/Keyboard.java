package practices.computer.keyboard;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static practices.computer.Computer.creatDataBase;
import static practices.computer.display.Display.writeFile;

public class Keyboard {
    String keyboardBrand;
    String keyboardConnectionType;
    // wire , wireless
    String keyboardFunction;
     // gaming , official
    final String dataBaseFileName = "keyboardsDataBase.json";

    JSONArray keyboardsArray = new JSONArray();

    // ------------------------------- / Brands DataBase / ------------------------------- //
    private final ArrayList <String> keyboardBrandsDataBase = new ArrayList<>() ;
    private final Scanner scanner = new Scanner(System.in) ;


    // ------------------------------ / setters & getters / ------------------------------- //
    // ----------------------------------- / setters / ------------------------------------ //
    // ------------------------------- / DataBase setter / -------------------------------- //
    private void setKeyboardBrandsDataBase() {
        keyboardBrandsDataBase.add("Green") ;
        keyboardBrandsDataBase.add("Logitech") ;
        keyboardBrandsDataBase.add("TSCO") ;
    }
    // ---------------------------- / permetive type setter / ----------------------------- //

    public void setKeyboardBrand() {
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
    }

    public void setKeyboardConnectionType() {
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
    }

    public void setKeyboardFunction() {

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
    }

    // ----------------------------------- / getters / ------------------------------------ //
    // ---------------------------- / primitive type getters / ---------------------------- //
    @Override
    public String toString() {
        return "Keyboard {" +
                "keyboardBrand : \"" + keyboardBrand + '\"' +
                ", keyboardConnectionType : \"" + keyboardConnectionType + '\"' +
                ", keyboardFunction : \"" + keyboardFunction + '\"' +
                '}';
    }
    public Keyboard() {
        setKeyboardBrand();
        setKeyboardConnectionType();
        setKeyboardFunction();
        setKeyBoardsDataBase();
    }
    public void setKeyBoardsDataBase(){
        JSONObject keyboardObject = new JSONObject();
        keyboardObject.put("Keyboard brand", keyboardBrand);
        keyboardObject.put("Keyboard connection type", keyboardConnectionType);
        keyboardObject.put("Keyboard function", keyboardFunction);
        creatDataBase(dataBaseFileName);
        writeFile(keyboardObject , keyboardsArray , dataBaseFileName);
    }
}
