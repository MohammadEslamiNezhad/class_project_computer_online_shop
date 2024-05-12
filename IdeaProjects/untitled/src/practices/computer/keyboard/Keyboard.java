package practices.computer.keyboard;

import java.util.ArrayList;
import java.util.Scanner;

public class Keyboard {
    String brand ;
    String connectionType ; 
    // wire , wireless
    String function ; 
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

    public void setBrand() {
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
        this.brand = keyboardsDataBase.get(option);
        System.out.println(" " + getBrand() + " Very nice choice ! ");
    }

    public void setConnectionType() {
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
                connectionType = "Wireless" ;
                break;

            case 2 :
                connectionType = "Wire" ;
        }
        System.out.println(" You have a " + getConnectionType() + " keyboard . ");
    }

    public void setFunction() {

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
                function = "Gaming" ;
                break;

            case 2 :
                function = "Official" ;
        }
        System.out.println(" !! OKAY !! You have a " + getFunction() + " keyboard . ");
    }

    // ----------------------------------- / getters / ------------------------------------ //
    // ---------------------------- / permetive type getters / ---------------------------- //

    public String getBrand() {
        return brand;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public String getFunction() {
        return function;
    }

}
