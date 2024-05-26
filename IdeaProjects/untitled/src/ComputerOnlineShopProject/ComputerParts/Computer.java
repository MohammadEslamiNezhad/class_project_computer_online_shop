package practices.computer;

import practices.computer.Case.Case;
import practices.computer.display.Display;
import practices.computer.keyboard.Keyboard;
import practices.computer.mouse.Mouse;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static practices.computer.Case.Case.*;
import static practices.computer.display.Display.setDisplaysDataBase;

public class Computer {
    Case computerCase ;
    Display computerDisplay ;
    Keyboard computerKeyboard ;
    Mouse computerMouse ;
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
    static ArrayList <Computer> computersDataBase = new ArrayList<>();

    public static void main(String args[]){
        creatDataBase("MyProgramData.json");
        startOnlineShop();
    }

    public static void startOnlineShop(){
        System.out.println(" Welcome to computer online shop . ");
        System.out.println(" / --------------- // Menu // --------------- /");
        System.out.println(" 1. Register part. ");
        System.out.println(" 2. Buy && See systems . ");
        System.out.println(" 0. Exit ");
        System.out.print(" Choose option and enter its number : ");
        int menuOption = numberScanner.nextInt();
        switch (menuOption){
            case 1 :
                registerComputerParts();
                break;
            case 2 :
                searchForComputerParts();
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
    public static void registerComputerParts(){
        System.out.println(" 1. Keyboard ");
        System.out.println(" 2. Mouse ");
        System.out.println(" 3. Display ");
        System.out.println(" 4. Case ");
        System.out.println(" 5. MainBoard ");
        System.out.println(" 6. CPU ");
        System.out.println(" 7. RAM ");
        System.out.println(" 8. Storage ");
        System.out.println(" 9. Power ");
        System.out.println(" 10. GPU ");
        System.out.println(" 0. Exit ");
        System.out.print(" register : ");
        int menuOption1 = numberScanner.nextInt();
        switch (menuOption1){
            case 1 :
                setKeyboard() ;
                break;

            case 2 :
                setMouse() ;
                break;

            case 3 :
                setDisplay() ;
                break;

            case 4 :
                setCase();
                break;

            case 5 :
                setMainBoard();
                break;

            case 6 :
                setCpu();
                break;

            case 7 :
                setRam();
                break;

            case 8 :
                setStorage();
                break;

            case 9 :
                setPower();
                break;

            case 10 :
                setGpu();
                break;

            case 0 :
                System.out.println(" OKAY . Bye :-( ");
                break;

            default:
                System.out.println(" !! Error !! Please enter option number correctly !!! ");
        }
        if (menuOption1 != 0 ){
            registerComputerParts();
        }
    }
    public static void searchForComputerParts(){
        System.out.println(" 1. Keyboard config . ");
        System.out.println(" 2. Mouse config . ");
        System.out.println(" 3. Display config . ");
        System.out.println(" 4. Case config . ");
        System.out.println(" 0. Exit ");
        System.out.print(" Search by : ");
        int menuOption2 = numberScanner.nextInt();
        switch (menuOption2){
            case 1 :
                Keyboard buyerKeyboard = setKeyboard() ;
                for (Computer i : computersDataBase) {
                    if (i.computerKeyboard.toString().equals(buyerKeyboard.toString())) {
                        System.out.println(i.computerKeyboard.toString());
                    }
                }
                break;
            case 2 :
                Mouse buyerMouse = setMouse() ;
                for (Computer i : computersDataBase) {
                    if (i.computerMouse.toString().equals(buyerMouse.toString())) {
                        System.out.println(i.computerMouse.toString());
                    }
                }
                break;

            case 3 :
                Display buyerDisplay = setDisplay() ;
                for (Computer i : computersDataBase) {
                    if (i.computerDisplay.toString().equals(buyerDisplay.toString())) {
                        System.out.println(i.computerDisplay.toString());
                    }
                }
                break;
            case 4 :
                Case buyerComputerCase = setCase() ;
                for (Computer i : computersDataBase) {
                    if (i.computerCase.equals(buyerComputerCase)) {
                        i.computerCase.getCase(buyerComputerCase);
                    }
                }
                break;

            case 0 :
                System.out.println(" OKAY . Bye :-( ");
                break;

            default:
                System.out.println(" !! Error !! Please enter option number correctly !!! ");
        }
        if (menuOption2 != 0 ){
            searchForComputerParts();
        } else {
            startOnlineShop();
        }
    }

    // --------------------------------- // set Owner // ---------------------------------- //
    public static String setOwner(){
        System.out.println(" Owner registration part ! ");
        System.out.print(" Owner first name : ");
        String ownerFirstName = stringScanner.nextLine().trim().toLowerCase() ;
        System.out.print(" Owner last name : ");
        String ownerLastName = stringScanner.nextLine().trim().toLowerCase();
        return ownerFirstName.concat(ownerLastName);
    }

    // ----------------------------- // set keyboard // ------------------------------- //
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
        Display display = new Display();
        System.out.println(" !! OKAY !! Your display is register ! ");
        return display;
    }

    // --------------------------------- // set Case // --------------------------------- //
    public static Case setCase(){
        System.out.println(" Case registration part . ");
        Case computerCase = new Case();
        System.out.println(" !! OKAY !! Your Case is register ! ");
        return computerCase ;
    }

    public static void creatDataBase(String dataBaseName){
        try{
            File projectDataBase = new File(dataBaseName);
            if (projectDataBase.createNewFile()){
                System.out.println(" File " + projectDataBase.getName() + " created ! ");
            }else {
                System.out.println(" File already exists . ");
            }
        }catch (IOException ioException){
            System.out.println( " An error occurred . ");
            ioException.printStackTrace();
        }
    }
}
