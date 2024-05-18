package practices.computer.display;

import java.util.ArrayList;
import java.util.Scanner;

import static practices.computer.Case.MainBoard.printResult;

public class Display {

    static Scanner scanner = new Scanner(System.in) ;
    private int sizeOfYourDisplay;
    // inch ^ 2

    private String displayBrand;
    // HP , Samsung , LG , Asus , G-Plus
    private String displayFunction;
    // gaming , LED , touch

    private boolean hasHdmi ;
    private boolean hasDisplayPort ;
    private boolean hasDvi ;
    private boolean hasVga ;
    // has the port or not .
    private final ArrayList <String> displayBrandsDataBase = new ArrayList<>() ;
    private final ArrayList <String> displayFunctionsDataBase = new ArrayList<>() ;

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
    public void setDisplayBrand() {
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
        displayBrand = displayBrandsDataBase.get(option);
        System.out.println("        ");
    }

    public void setDisplayFunction() {
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
        displayFunction = displayFunctionsDataBase.get(option);
        System.out.println("        ");
    }

    // ---------------------------- / reference type setter / ----------------------------- //
    public void setHasHdmi() {
        hasHdmi = hasPart("HDMI port" , "Display") ;
    }

    public void setHasDisplayPort() {
        hasDisplayPort = hasPart("Display port" , "Display") ;
    }

    public void setHasDvi() {
        hasDvi = hasPart("DVI port" , "Display") ;
    }

    public void setHasVga() {
        hasVga = hasPart("VGA port" , "Display");
    }

    public void setSizeOfYourDisplay() {
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
    }

     // ------------------------------- // getters // --------------------------------------//
    // --------------------------- // primitive type getter // ---------------------------- //
    public void getDisplayBrand() {
        printResult( "display brand", displayBrand);
    }

    public void getDisplayFunction() {
        printResult( "display function", displayFunction);
    }

    // ---------------------------- / reference type getter / ----------------------------- //
    public void getSizeOfYourDisplay() {
        printResult( "display size", String.valueOf(sizeOfYourDisplay));
    }

    public void getHasHdmi() {
        printResult( "has HDMI port", String.valueOf(hasHdmi));
    }

    public void getHasDisplayPort() {
        printResult( "has Display port", String.valueOf(hasDisplayPort));
    }

    public void getHasDvi() {
        printResult( "has DVI port", String.valueOf(hasDvi));
    }

    public void getHasVga() {
        printResult( "has VGA port", String.valueOf(hasVga));
    }

    public Display(){
        setDisplayBrand();
        setDisplayFunction();
        setSizeOfYourDisplay();
        setHasHdmi();
        setHasDisplayPort();
        setHasDvi();
        setHasVga();
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
}

