package practices.computer.Case;

import practices.computer.Case.storage.Storage;

import java.util.Scanner;

// import get methods
import static practices.computer.Case.Cpu.getCpu;
import static practices.computer.Case.Gpu.getGpu;
import static practices.computer.Case.MainBoard.getMainBoard;
import static practices.computer.Case.Power.getPower;
import static practices.computer.Case.Ram.getRam;
import static practices.computer.Case.storage.Storage.buildStorage;
import static practices.computer.Case.storage.Storage.getStorage;

public class Case {
    static Scanner scanner = new Scanner(System.in);
    MainBoard mainBoard ;
    Power power;
    Cpu cpu;
    Ram ram;
    Storage storage;
    Gpu gpu;
    public Case (){
        this.mainBoard = setMainBoard();
        this.power = setPower();
        this.cpu = setCpu();
        this.ram = setRam();
        this.storage = setStorage();
        this.gpu = setGpu();
    }
    // ---------------------------------- // set storage // ------------------------------ //
    public static Storage setStorage(){
        return buildStorage() ;
    }

    // ----------------------------------- // set power // -------------------------------- //
    public static Power setPower(){
        System.out.println(" power registration part . ");
        Power power = new Power() ;
        System.out.println(" !! OKAY !! Your power is register ! ");
        return power ;
    }

    // ------------------------------------ // set RAM // --------------------------------- //
    public static Ram setRam(){
        System.out.println(" RAM registration part . ");
        Ram ram = new Ram() ;
        System.out.println(" !! OKAY !! Your RAM is register ! ");
        return ram ;
    }

    // ------------------------------------ // set CPU // --------------------------------- //
    public static Cpu setCpu(){
        System.out.println(" CPU registration part . ");
        Cpu cpu = new Cpu();
        System.out.println(" !! OKAY !! Your CPU is register ! ");
        return cpu ;
    }

    // --------------------------------- // set MainBoard // ------------------------------ //
    public static MainBoard setMainBoard(){
        System.out.println(" MainBoard registration part . ");
        MainBoard mainBoard = new MainBoard();
        System.out.println(" !! OKAY !! Your MainBoard is register ! ");
        return mainBoard ;
    }
    // ------------------------------------ // set GPU // --------------------------------- //
    public static Gpu setGpu(){
        System.out.println(" GPU registration part . ");
        Gpu gpu = new Gpu() ;
        System.out.println(" !! OKAY !! Your GPU is register ! ");
        return gpu;
    }
    public void getCase(Case comuterCase){
        System.out.println("// -------------------------------- " +
                "// Case // ----------------------------- //");
        getMainBoard(comuterCase.mainBoard);
        getPower(comuterCase.power);
        getCpu(comuterCase.cpu);
        getRam(comuterCase.ram);
        getStorage(comuterCase.storage);
        getGpu(comuterCase.gpu);
    }

}
