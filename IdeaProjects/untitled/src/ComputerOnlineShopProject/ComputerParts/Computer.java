package practices.computer;

import practices.computer.Case.*;
import practices.computer.Case.storage.Storage;
import practices.computer.display.Display;
import practices.computer.keyboard.Keyboard;
import practices.computer.mouse.Mouse;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static practices.computer.Case.storage.Storage.buildStorage;

public class Computer {
    Display computerDisplay ;
    Keyboard computerKeyboard ;
    Mouse computerMouse ;
    public static Scanner numberScanner = new Scanner(System.in);
    public static Scanner stringScanner = new Scanner(System.in);
    static ArrayList <Computer> computersDataBase = new ArrayList<>();

    public static void main(String args[]){
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
        System.out.println(" 4. MainBoard ");
        System.out.println(" 5. CPU ");
        System.out.println(" 6. RAM ");
        System.out.println(" 7. Storage ");
        System.out.println(" 8. Power ");
        System.out.println(" 9. GPU ");
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
                setMainBoard();
                break;

            case 5 :
                setCpu();
                break;

            case 6 :
                setRam();
                break;

            case 7 :
                setStorage();
                break;

            case 8 :
                setPower();
                break;

            case 9 :
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
        System.out.println(" 1. Keyboard ");
        System.out.println(" 2. Mouse ");
        System.out.println(" 3. Display ");
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

    // ---------------------------------- // set storage // ------------------------------ //
    public static Storage setStorage() {
        return buildStorage();
    }

    // ----------------------------------- // set power // -------------------------------- //
    public static Power setPower() {
        System.out.println(" power registration part . ");
        Power power = new Power();
        System.out.println(" !! OKAY !! Your power is register ! ");
        return power;
    }

    // ------------------------------------ // set RAM // --------------------------------- //
    public static Ram setRam() {
        System.out.println(" RAM registration part . ");
        Ram ram = new Ram();
        System.out.println(" !! OKAY !! Your RAM is register ! ");
        return ram;
    }

    // ------------------------------------ // set CPU // --------------------------------- //
    public static Cpu setCpu() {
        System.out.println(" CPU registration part . ");
        Cpu cpu = new Cpu();
        System.out.println(" !! OKAY !! Your CPU is register ! ");
        return cpu;
    }

    // --------------------------------- // set MainBoard // ------------------------------ //
    public static MainBoard setMainBoard() {
        System.out.println(" MainBoard registration part . ");
        MainBoard mainBoard = new MainBoard();
        System.out.println(" !! OKAY !! Your MainBoard is register ! ");
        return mainBoard;
    }

    // ------------------------------------ // set GPU // --------------------------------- //
    public static Gpu setGpu() {
        System.out.println(" GPU registration part . ");
        Gpu gpu = new Gpu();
        System.out.println(" !! OKAY !! Your GPU is register ! ");
        return gpu;
    }
    public static void creatDataBase(String dataBaseName){
        try{
            File projectDataBase = new File(dataBaseName);
            if (projectDataBase.createNewFile()){
//                System.out.println(" File " + projectDataBase.getName() + " created ! ");
            }else {
//                System.out.println(" File already exists . ");
            }
        }catch (IOException ioException){
            System.out.println( " An error occurred . ");
            ioException.printStackTrace();
        }
    }
}
