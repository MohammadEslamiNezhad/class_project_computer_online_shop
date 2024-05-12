package practices.computer;

import practices.computer.Case.*;
import practices.computer.Case.storage.Hdd;
import practices.computer.Case.storage.Ssd;
import practices.computer.Case.storage.Storage;
import practices.computer.display.Display;
import practices.computer.keyboard.Keyboard;
import practices.computer.mouse.Mouse;

import java.util.Scanner;

public class Computer {
    public Computer(Display display , Mouse mouse , Keyboard keyboard , Case computerCase) {

    }
    // default constructor
    static Scanner scanner = new Scanner(System.in) ;

    public static void main(String args[]){
        setKeyboard();
        setMouse();
        setDisplay();
        setStorage();
        setPower();
        setRam();
    }
    // --------------------------------- // set keyboard // ------------------------------ //
    public static void setKeyboard() {
        Keyboard keyboard = new Keyboard() ;
        System.out.println(" You must have a keyboard for your computer . ");
        System.out.println(" Tell me what's your key board brand , " +
                "is wireless or not and is gaming or official . ");
        keyboard.setBrand();
        keyboard.setConnectionType();
        keyboard.setFunction() ;
        System.out.println(" !! OKAY !! Your keyboard is register ! ");
    }
    // ----------------------------------- // set mouse // -------------------------------- //
    public static void setMouse() {
        Mouse mouse = new Mouse() ;
        System.out.println(" You must have a mouse for your computer . ");
        System.out.println(" Tell me what's your mouse brand , " +
                "is wireless or not and is gaming or official . ");
        mouse.setMouseBrand();
        mouse.setMouseConnectionType();
        mouse.setMouseFunction();
        System.out.println(" !! OKAY !! Your mouse is register ! ");
    }
    // ---------------------------------- // set display // ------------------------------- //
    public static void setDisplay() {
        Display display = new Display() ;
        System.out.println(" You must have a display for your computer . ");
        System.out.println(" Tell me what's your display brand , is gaming , official " +
                "or just LED , has HDMI , VGA , DVI , Display and " +
                "finally your size of display (inch ^ 2) . ");
        display.setDisplayBrand();
        display.setDisplayFunction();
        display.setSizeOfYourDisplay();
        display.setHasHdmi();
        display.setHasDisplayPort();
        display.setHasDvi();
        display.setHasVga();
        System.out.println(" !! OKAY !! Your display is register ! ");
    }
    // ----------------------------------- // set case // --------------------------------- //
    // ---------------------------------- // set storage // ------------------------------ //
    public static void setStorage(){
        System.out.println(" You must have a storage for your computer . ");
        System.out.println(" Tell me are you have SSD or HDD ? if you have one of there " +
                "what brand and how many read & write speed and " +
                "how much volume of there . ");
        System.out.println(" 1. HDD ");
        System.out.println(" 2. SSD ");
        System.out.println(" Enter number of storage . if you use ssd and hdd together " +
                ", choose one of this option and tell useful information about it , " +
                "and finally set another storage . ");
        System.out.print(" >>> ");
        int option = scanner.nextInt();
        if (option == 1 ){
            setHdd() ;
        }else{
            setSsd() ;
        }
        new Storage();
    }
    public static void setSsd(){
        Ssd ssd = new Ssd() ;
        ssd.setHasSsd(true);
        ssd.setBrand();
        ssd.setVolume();
        ssd.setReadSpeed();
        ssd.setWriteSpeed();
    }
    public static void setHdd(){
        Hdd hdd = new Hdd() ;
        hdd.setHasHdd(true);
        hdd.setBrand();
        hdd.setVolume();
        hdd.setReadSpeed();
        hdd.setWriteSpeed();
    }
    // ----------------------------------- // set power // -------------------------------- //
    public static void setPower(){
        Power power = new Power() ;
        power.setBrand();
        power.setExternalPowerNumberWatt();
        power.setPowerFormFactor();
        power.setGovahiname80Plus();
    }
    // ------------------------------------ // set RAM // --------------------------------- //
    public static void setRam(){
        Ram ram = new Ram() ;
        ram.setRamBrand();
        ram.setRamGeneration();
        ram.setRamVolume();
        ram.setRamFrequency();
    }
}
