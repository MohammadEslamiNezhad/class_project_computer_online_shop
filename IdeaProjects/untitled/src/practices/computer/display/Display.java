package practices.computer.display;

import java.util.ArrayList;
import java.util.Scanner;

public class Display {

    Scanner scanner = new Scanner(System.in) ;
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
        int option ;
        do {
            System.out.println(" Do you have a HDMI port on your display ? ");
            System.out.println("        ");
            System.out.println(" 1. Yes ");
            System.out.println(" 2. No ");
            System.out.print(" >>> ");
            option = scanner.nextInt();
        }while (option != 1 && option != 2) ;
        hasHdmi = (option == 1) ;
        System.out.println("        ");
    }

    public void setHasDisplayPort() {
        int option ;
        do {
            System.out.println(" Do you have a Display port on your display ? ");
            System.out.println("        ");
            System.out.println(" 1. Yes ");
            System.out.println(" 2. No ");
            System.out.print(" >>> ");
            option = scanner.nextInt();
        }while (option != 1 && option != 2) ;
        hasDisplayPort = (option == 1) ;
        System.out.println("        ");
    }

    public void setHasDvi() {
        int option ;
        do {
            System.out.println(" Do you have a DVI port on your display ? ");
            System.out.println("        ");
            System.out.println(" 1. Yes ");
            System.out.println(" 2. No ");
            System.out.print(" >>> ");
            option = scanner.nextInt();
        }while (option != 1 && option != 2) ;
        hasDvi = (option == 1) ;
        System.out.println("        ");
    }

    public void setHasVga() {
        int option ;
        do {
            System.out.println(" Do you have a VGA port on your display ? ");
            System.out.println("        ");
            System.out.println(" 1. Yes ");
            System.out.println(" 2. No ");
            System.out.print(" >>> ");
            option = scanner.nextInt();
        }while (option != 1 && option != 2) ;
        hasVga = (option == 1) ;
        System.out.println("        ");
    }

    public void setSizeOfYourDisplay() {
        int sizeOfYourDisplay ;
        do {
            System.out.println(" How many size of your display (inch ^ 2) ? ");
            System.out.print(" >>> ");
            sizeOfYourDisplay = scanner.nextInt() ;
            if (sizeOfYourDisplay <= 0) {
                System.out.println(" !! Error !! Please enter " +
                        "size of your display correctly !  ");
            }else {break;}
        } while (true) ;
        System.out.println("        ");
    }

     // ------------------------------- // getters // --------------------------------------//
    // --------------------------- // primitive type getter // ---------------------------- //
    public String getDisplayBrand() {
        return displayBrand;
    }

    public String getDisplayFunction() {
        return displayFunction;
    }

    // ---------------------------- / reference type getter / ----------------------------- //
    public float getSizeOfYourDisplay() {
        return sizeOfYourDisplay;
    }

    public boolean isHasHdmi() {
        return hasHdmi;
    }

    public boolean isHasDisplayPort() {
        return hasDisplayPort;
    }

    public boolean isHasDvi() {
        return hasDvi;
    }

    public boolean isHasVga() {
        return hasVga;
    }
}

