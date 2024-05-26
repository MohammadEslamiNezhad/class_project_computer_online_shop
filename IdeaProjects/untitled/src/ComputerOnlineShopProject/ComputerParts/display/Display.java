package practices.computer.display;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static practices.computer.Case.MainBoard.printResult;
import static practices.computer.Computer.creatDataBase;

public class Display {

    static Scanner scanner = new Scanner(System.in) ;
    private int sizeOfYourDisplay;
    // inch ^ 2

    private String displayBrand;
    // HP , Samsung , LG , Asus , G-Plus
    private String displayFunction;
    // gaming , LED , touch
    static final String dataBaseFileName = "DisplaysDataBase.json" ;

    private boolean hasHdmi ;
    private boolean hasDisplayPort ;
    private boolean hasDvi ;
    private boolean hasVga ;
    // has the port or not .
    private final ArrayList <String> displayBrandsDataBase = new ArrayList<>() ;
    private final ArrayList <String> displayFunctionsDataBase = new ArrayList<>() ;
    static JSONArray displaysArray = new JSONArray() ;
    // ----------------------------- / setters & getters / ------------------------------ //
    // ---------------------------------- / setters / ------------------------------------ //
    // ------------------------------ / DataBase setter / ------------------------------- //

    public void setDisplayBrandsDataBase() {
        displayBrandsDataBase.add("LG") ;
        displayBrandsDataBase.add("Samsung") ;
        displayBrandsDataBase.add("G-Plus") ;
        displayBrandsDataBase.add("HP") ;
        displayBrandsDataBase.add("Asus") ;
    }

    public void setDisplayFunctionsDataBase() {
        displayFunctionsDataBase.add("Gaming") ;
        displayFunctionsDataBase.add("Touch") ;
        displayFunctionsDataBase.add("LED") ;
    }

    // ---------------------------- / primetive type setter / ----------------------------- //
    public String setDisplayBrand() {
        setDisplayBrandsDataBase();
        int option ;
        do {
            System.out.println( " Choose brand of your display and enter its number . " );
            for (int i = 0; i < displayBrandsDataBase.size(); i++) {
                System.out.println(" " + (i + 1) + ". " + displayBrandsDataBase.get(i));
            }
            System.out.print(" >>> ");
            option = scanner.nextInt() - 1  ;
            if (option < 0 || option >= displayBrandsDataBase.size()) {
                System.out.println(" !! Error !! Please enter option correctly ! ");
            } else {break;}
        } while (true) ;
        System.out.println("        ");
        displayBrand = displayBrandsDataBase.get(option);
        return displayBrand ;
    }

    public String setDisplayFunction() {
        setDisplayFunctionsDataBase();
        int option ;
        do {
            System.out.println( " Choose function of your display and enter its number . " );
            for (int i = 0; i < displayFunctionsDataBase.size(); i++) {
                System.out.println(" " + (i + 1) + ". " + displayFunctionsDataBase.get(i));
            }
            System.out.print(" >>> ");
            option = scanner.nextInt() - 1  ;
            if (option < 0 || option >= displayFunctionsDataBase.size()) {
                System.out.println(" !! Error !! Please enter option correctly ! ");
            } else {break;}
        } while (true) ;
        System.out.println("        ");
        displayFunction = displayFunctionsDataBase.get(option);
        return displayFunction ;
    }

    // ---------------------------- / reference type setter / ----------------------------- //
    public boolean setHasHdmi() {
        hasHdmi = hasPart("HDMI port" , "Display") ;
        return hasHdmi ;
    }

    public boolean setHasDisplayPort() {
        hasDisplayPort = hasPart("Display port" , "Display") ;
        return hasDisplayPort;
    }

    public boolean setHasDvi() {
        hasDvi = hasPart("DVI port" , "Display") ;
        return hasDvi ;
    }

    public boolean setHasVga() {
        hasVga = hasPart("VGA port" , "Display");
        return hasVga ;
    }

    public float setSizeOfYourDisplay() {
        int sizeOfYourDisplay ;
        do {
            System.out.println(" How many size of your display (inch ^ 2) ? ");
            System.out.print(" >>> ");
            sizeOfYourDisplay = scanner.nextInt() ;
            if (sizeOfYourDisplay <= 10) {
                System.out.println(" !! Error !! Please enter " +
                        "size of your display correctly !  ");
            }else {
                this.sizeOfYourDisplay = sizeOfYourDisplay;
                break;
            }
        } while (true) ;
        System.out.println("        ");
        return sizeOfYourDisplay ;
    }

     // -------------------------------- // getter // --------------------------------------//

    @Override
    public String toString() {
        return "Display{" +
                "\"sizeOfYourDisplay\" : \"" + sizeOfYourDisplay + '\"' +
                ", \"displayBrand\" : \"" + displayBrand + '\"' +
                ", \"displayFunction\" : \"" + displayFunction + '\"' +
                ", \"hasHdmi\" : \"" + hasHdmi + '\"' +
                ", \"hasDisplayPort\" : \"" + hasDisplayPort + '\"' +
                ", \"hasDvi\" : \"" + hasDvi + '\"' +
                ", \"hasVga\" : \"" + hasVga + '\"' +
                '}';
    }

    public Display(){
        setDisplaysDataBase(this);
    }

    // -------------------------------- / other methods / --------------------------------- //
    public static boolean hasPart(String part , String whole){
        int option;
        do {
            System.out.println(" Do you have a " + part + " on your " + whole + " ? ");
            System.out.println("        ");
            System.out.println(" 0. No ");
            System.out.println(" 1. Yes ");
            System.out.print(" >>> ");
            option = scanner.nextInt();
            System.out.println("        ");
        } while (option != 1 && option != 0);
        return (option == 1);
    }

    public static void setDisplaysDataBase(Display display) {
        JSONObject displayObject = new JSONObject();
        displayObject.put("Display brand", display.setDisplayBrand());
        displayObject.put("Display function", display.setDisplayFunction());
        displayObject.put("Size of your display", display.setSizeOfYourDisplay());
        displayObject.put("Has HDMI port", display.setHasHdmi());
        displayObject.put("Has Display port", display.setHasDisplayPort());
        displayObject.put("Has VGA port", display.setHasVga());
        displayObject.put("Has DVI port", display.setHasDvi());
        creatDataBase(dataBaseFileName);
        writeFile(displayObject,displaysArray, dataBaseFileName);
    }

    public static void writeFile(JSONObject computerPartJsonObject , JSONArray computerPartArray , String dataBaseFileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(dataBaseFileName))) {
            String line;
            StringBuilder jsonContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            if (!jsonContent.isEmpty()) {
                computerPartArray = new JSONArray(jsonContent.toString());
            } else {
                computerPartArray = new JSONArray();
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            computerPartArray = new JSONArray();
        }

        computerPartArray.put(computerPartJsonObject);

        try (FileWriter file = new FileWriter(dataBaseFileName)) {
            file.write(computerPartArray.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
