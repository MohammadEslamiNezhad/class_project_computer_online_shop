package practices.computer;

import practices.computer.Case.Case;
import practices.computer.display.Display;
import practices.computer.keyboard.Keyboard;
import practices.computer.mouse.Mouse;

import java.util.HashMap;
import java.util.Scanner;

public class Computer {
    Case computerCase ;
    Display computerDisplay ;
    Keyboard computerKeyboard ;
    Mouse computerMouse ;
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
    static HashMap <String , Computer> computersDataBase = new HashMap<>();
    public Computer() {
        this.computerCase = setCase();
        this.computerDisplay = setDisplay();
        this.computerKeyboard = setKeyboard();
        this.computerMouse = setMouse();
    }

    public static void main(String args[]){
        startOnlineShop();
    }

    public static void startOnlineShop(){
        System.out.println(" Welcome to computer online shop . ");
        System.out.println(" / --------------- // Menu // --------------- /");
        System.out.println(" 1. Register . ");
        System.out.println(" 2. Buy && See systems . ");
        System.out.println(" 0. Exit ");
        System.out.print(" Choose option and enter its number : ");
        int menuOption = numberScanner.nextInt();
        switch (menuOption){
            case 1 :
                computersDataBase.put(setOwner() , setComputer());
                break;
            case 2 :
                searchForComputer();
                break;
            case 0 :
                System.out.println(" OKAY . Bye :-( ");
                break;
            default:
                System.out.println(" !! Error !! Please enter option number correctly !!! ");
        }
        if (menuOption != 0) {
            startOnlineShop();
        }
    }
    public static void searchForComputer(){
        System.out.println(" 1. Owner full name . ");
        System.out.println(" 2. Computer config . ");
        System.out.println(" 0. Exit ");
        System.out.println(" Search by : ");
        int menuOption2 = numberScanner.nextInt();
        if (menuOption2 == 1){
            // search by owner
            getComputer(computersDataBase.get(setOwner()));
        } else if (menuOption2 == 2){
            // search by system computer config
            System.out.println(" I don't have this option but " +
                    "i'll try to add this option . ");
        } else if (menuOption2 == 0 ) {
            startOnlineShop();
        } else {
            System.out.println(" !! Error !! Please enter number correctly !!!");
        }
    }

    // -------------------------------- // set Computer // ----------------------------- //
    public static String setOwner(){
        System.out.println(" Owner registration part ! ");
        System.out.print(" Owner first name : ");
        String ownerFirstName = stringScanner.nextLine().trim().toLowerCase() ;
        System.out.print(" Owner last name : ");
        String ownerLastName = stringScanner.nextLine().trim().toLowerCase();
        return ownerFirstName.concat(ownerLastName);
    }

    // -------------------------------- // set Computer // ----------------------------- //
    public static Computer setComputer(){
        System.out.println(" Computer registration part . ");
        Computer computer = new Computer();
        System.out.println(" !! OKAY !! Your Computer is register ! ");
        return computer ;
    }
    // ------------------------------- // set keyboard // ----------------------------- //
    public static Keyboard setKeyboard() {
        System.out.println(" keyboard registration part . ");
        Keyboard keyboard =  new Keyboard() ;
        System.out.println(" !! OKAY !! Your keyboard is register ! ");
        return keyboard ;
    }

    // ---------------------------------- // set mouse // ------------------------------- //
    public static Mouse setMouse() {
        System.out.println(" mouse registration part . ");
        Mouse mouse =  new Mouse() ;
        System.out.println(" !! OKAY !! Your mouse is register ! ");
        return mouse;
    }

    // --------------------------------- // set display // ------------------------------ //
    public static Display setDisplay() {
        System.out.println(" display registration part . ");
        Display display = new Display() ;
        System.out.println(" !! OKAY !! Your display is register ! ");
        return display ;
    }

    // --------------------------------- // set Case // --------------------------------- //
    public static Case setCase(){
        System.out.println(" Case registration part . ");
        Case computerCase = new Case();
        System.out.println(" !! OKAY !! Your Case is register ! ");
        return computerCase ;
    }

    // ---------------------------------- // getters // ---------------------------------- //
    // -------------------------------- // get Computer // ------------------------------- //
    public static void getComputer(Computer computer){
        computer.computerCase.getCase(computer.computerCase);
        getDisplay(computer.computerDisplay);
        getKeyboard(computer.computerKeyboard);
        getMouse(computer.computerMouse);
    }

    public static void getDisplay(Display display) {
        System.out.println("// --------------------------- // " +
                "Display // --------------------------- //");
        display.getDisplayBrand();
        display.getDisplayFunction();
        display.getSizeOfYourDisplay();
        display.getHasHdmi();
        display.getHasDisplayPort() ;
        display.getHasDvi();
        display.getHasVga();
    }
    public static void getKeyboard(Keyboard keyboard) {
        System.out.println("// --------------------------- // " +
                "Keyboard // --------------------------- //");
        keyboard.getKeyboardBrand();
        keyboard.getKeyboardConnectionType();
        keyboard.getKeyboardFunction();
    }
    public static void getMouse(Mouse mouse) {
        System.out.println("// --------------------------- // " +
                "Mouse // --------------------------- //");
        mouse.getMouseBrand();
        mouse.getMouseConnectionType();
        mouse.getMouseFunction();
    }

}
