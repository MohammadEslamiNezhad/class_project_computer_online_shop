package practices.ComputerPartOnlineShop.OnlineShopCommodity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.stringScanner;
import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.numberScanner;
import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.writeFile;
import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.creatDataBase;

public class Display {
    private int sizeOfYourDisplay;
    // inch

    private String displayBrand;
    // HP , Samsung , LG , Asus , G-Plus
    private String displayModel ;
    private String displayFunction;
    // gaming , LED , touch
    static final String dataBaseFileName = "DisplaysDataBase.json" ;

    private boolean hasHdmi ;
    private boolean hasDisplayPort ;
    private boolean hasDvi ;
    private boolean hasVga ;
    // has the port or not .
    private final ArrayList<String> displayBrandsDataBase = new ArrayList<>() ;
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
         displayFunctionsDataBase.add("Gaming");
         displayFunctionsDataBase.add("Drawing");
         displayFunctionsDataBase.add("Official");
     }

     // ---------------------------- / variables setters / ----------------------------- //
     public String setDisplayBrand() {
         setDisplayBrandsDataBase();
         int option ;
         do {
             System.out.println( " Choose brand of your display and enter its number . " );
             for (int i = 0; i < displayBrandsDataBase.size(); i++) {
                 System.out.println(" " + (i + 1) + ". " + displayBrandsDataBase.get(i));
             }
             System.out.print(" >>> ");
             option = numberScanner.nextInt() - 1  ;
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
             option = numberScanner.nextInt() - 1  ;
             if (option < 0 || option >= displayFunctionsDataBase.size()) {
                 System.out.println(" !! Error !! Please enter option correctly ! ");
             } else {break;}
         } while (true) ;
         System.out.println("        ");
         displayFunction = displayFunctionsDataBase.get(option);
         return displayFunction ;
     }
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
             sizeOfYourDisplay = numberScanner.nextInt() ;
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

     public String setDisplayModel() {
         System.out.print(" Enter your display model :");
         this.displayModel = stringScanner.nextLine();
         return displayModel;
     }
     // ------------------------------- // getter // -------------------------------------//

    @Override
    public String toString() {
        return "Display{" +
                "sizeOfYourDisplay=" + sizeOfYourDisplay +
                ", displayBrand='" + displayBrand + '\'' +
                ", displayModel='" + displayModel + '\'' +
                ", displayFunction='" + displayFunction + '\'' +
                ", hasHdmi=" + hasHdmi +
                ", hasDisplayPort=" + hasDisplayPort +
                ", hasDvi=" + hasDvi +
                ", hasVga=" + hasVga +
                '}';
    }

    public Display(){
            setDisplaysDataBase();
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
             option = numberScanner.nextInt();
             System.out.println("        ");
         } while (option != 1 && option != 0);
         return (option == 1);
     }

    public void setDisplaysDataBase() {
         JSONObject displayObject = new JSONObject();
         displayObject.put("Display brand", setDisplayBrand());
         displayObject.put("Display model" , setDisplayModel());
         displayObject.put("Display function", setDisplayFunction());
         displayObject.put("Size of your display", setSizeOfYourDisplay());
         displayObject.put("Has HDMI port", setHasHdmi());
         displayObject.put("Has Display port", setHasDisplayPort());
         displayObject.put("Has VGA port", setHasVga());
         displayObject.put("Has DVI port", setHasDvi());
         creatDataBase(dataBaseFileName);
         writeFile(displayObject,displaysArray, dataBaseFileName);
    }
}