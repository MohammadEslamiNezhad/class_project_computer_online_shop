package practices.computer.Case;

import practices.computer.Case.storage.Storage;

import static practices.computer.Case.storage.Storage.buildStorage;

public class Case {
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
    public void getCase(Case computerCase){
        System.out.println(computerCase.toString());
    }

    @Override
    public String toString() {
        return mainBoard.toString() + "\n" + power.toString() + "\n" +
                cpu.toString() + "\n" + ram.toString() + "\n" + storage.toString()
                + "\n" + gpu.toString()+ "\n" ;
    }
}
