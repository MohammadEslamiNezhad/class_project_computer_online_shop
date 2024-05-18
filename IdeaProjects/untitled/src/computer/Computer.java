package practices.computer;

import practices.computer.Case.Case;
import practices.computer.display.Display;
import practices.computer.keyboard.Keyboard;
import practices.computer.mouse.Mouse;

public class Computer {
    Case computerCase ;
    Display computerDisplay ;
    Keyboard computerKeyboard ;
    Mouse computerMouse ;
    public Computer() {
        this.computerCase = setCase();
        this.computerDisplay = setDisplay();
        this.computerKeyboard = setKeyboard();
        this.computerMouse = setMouse();
    }

    public static void main(String args[]){
        Computer computer = setComputer();
        getComputer(computer);
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
