package practices.computer.keyboard;

import java.util.ArrayList;
import java.util.Scanner;

import static practices.computer.Case.MainBoard.printResult;

public class Keyboard {
    String keyboardBrand;
    String keyboardConnectionType;
    // wire , wireless
    String keyboardFunction;
     // gaming , official

    // ------------------------------- / Brands DataBase / ------------------------------- //
    private final ArrayList <String> keyboardsDataBase = new ArrayList<>() ;
    private final Scanner scanner = new Scanner(System.in) ;


    // ------------------------------ / setters & getters / ------------------------------- //
    // ----------------------------------- / setters / ------------------------------------ //
    // ------------------------------- / DataBase setter / -------------------------------- //
    private void setKeyboardsDataBase() {
        keyboardsDataBase.add("Green") ;
        keyboardsDataBase.add("Logitech") ;
        keyboardsDataBase.add("TSCO") ;
    }
    // ---------------------------- / permetive type setter / ----------------------------- //

    public void setKeyboardBrand() {
        setKeyboardsDataBase();
        for (int i = 0; i < keyboardsDataBase.size() ; i++) {
            System.out.println(" " + (i + 1) + ". " + keyboardsDataBase.get(i));
        }
        System.out.println("        ");
        int option ;
        do {
            System.out.print(" Choose keyboard brand and enter its number : ");
            option = scanner.nextInt() - 1  ;
            if (option < 0 || option >= keyboardsDataBase.size()) {
                System.out.println(" !! Error !! Please enter option correctly ! ");
            } else {break;}
        } while (true) ;
        this.keyboardBrand = keyboardsDataBase.get(option);
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

    public void getKeyboardBrand() {
        printResult("keyboard brand" , keyboardBrand);
    }

    public void getKeyboardConnectionType() {
        printResult("keyboard connection type" , keyboardConnectionType);
    }

    public void getKeyboardFunction() {
        printResult("keyboard Function" , keyboardFunction);
    }

    public Keyboard() {
        setKeyboardBrand();
        setKeyboardConnectionType();
        setKeyboardFunction();
    }
}
