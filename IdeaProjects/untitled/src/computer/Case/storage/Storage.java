package practices.computer.Case.storage;

import java.util.Scanner;

import static practices.computer.Case.MainBoard.printResult;

public class Storage {
    // ----------------------------------- / variables / ----------------------------------- //
    static boolean hasHdd ;
    static boolean hasSsd ;
    // has HDD & SSD
    int volume ; 
    // GB 
    int readSpeed; 
    int writeSpeed ;
    // Gb / sec
    static Scanner scanner = new Scanner(System.in) ;

    // ------------------------------------ / setters / ------------------------------------ //
    public void setHasHdd(boolean hasHdd){
        this.hasHdd = hasHdd ;
    }
    public void setHasSsd(boolean hasSsd){
        this.hasSsd = hasSsd ;
    }
    public void setVolume(){
        do{
            System.out.print( " Please enter volume (GB) : " );
            int checkNumber = scanner.nextInt();
            if (checkNumber < 100){
                System.out.println(" !! Error !! Please try again ! ");
            }else {
                this.volume = checkNumber ;
                break;
            }
        }while (true);
    }
    public void setReadSpeed(){
        do{
            System.out.print( " Please enter read speed (Mb/sec) : " );
            int checkNumber = scanner.nextInt();
            if (checkNumber < 100){
                System.out.println(" !! Error !! Please try again ! ");
            }else {
                this.readSpeed = checkNumber ;
                break;
            }
        }while (true);
    }
    public void setWriteSpeed(){
        do{
            System.out.print( " Please enter write speed (Mb/sec) : " );
            int checkNumber = scanner.nextInt();
            if (checkNumber < 100){
                System.out.println(" !! Error !! Please try again ! ");
            }else {
                this.writeSpeed = checkNumber ;
                break;
            }
        }while (true);
    }

    // ------------------------------------ / getters / ------------------------------------ //
    public void getHasHdd() {
        printResult("has HDD" , String.valueOf(hasHdd));
    }

    public void getHasSsd() {
        printResult("has SSD" , String.valueOf(hasSsd));
    }

    public void getVolume() {
        printResult("volume " , String.valueOf(volume).concat("GB"));
    }

    public void getReadSpeed() {
        printResult("read speed" , String.valueOf(readSpeed).concat("MB/sec"));
    }

    public void getWriteSpeed() {
        printResult("write speed" , String.valueOf(writeSpeed).concat("MB/sec"));
    }

    // --------------------- / constructor && get instance of class / --------------------- //
    public static Storage buildStorage(){
        Storage storage;
        System.out.println(" storage registration part . ");
        System.out.println(" Enter number of storage .");
        System.out.println(" 1. HDD ");
        System.out.println(" 2. SSD ");
        System.out.print(" >>> ");
        int option = scanner.nextInt();
        if (option == 1 ){
            storage = setHdd() ;
        }else{
            storage = setSsd() ;
        }
        System.out.println(" !! OKAY !! Your storage is register ! ");
        return storage;
    }
    public static Ssd setSsd(){
        System.out.println(" SSD registration part . ");
        Ssd ssd = new Ssd() ;
        System.out.println(" !! OKAY !! Your SSD is register ! ");
        return ssd;
    }
    public static Hdd setHdd(){
        System.out.println(" HDD registration part . ");
        Hdd hdd = new Hdd() ;
        System.out.println(" !! OKAY !! Your HDD is register ! ");
        return hdd ;
    }

    public static void getStorage(Storage storage){
        System.out.println("// -------------------------------- " +
                "// Storage // ----------------------------- //");
        storage.getHasHdd();
        if (hasHdd){
            System.out.println("// -------------------------------- " +
                    "// HDD // ----------------------------- //");
            getHdd((Hdd) storage);
        }
        storage.getHasSsd();
        if (hasSsd){
            System.out.println("// -------------------------------- " +
                    "// SSD // ----------------------------- //");
            getSsd((Ssd) storage);
        }
    }
    public static void getSsd(Ssd ssd) {
        ssd.getVolume();
        ssd.getReadSpeed();
        ssd.getWriteSpeed();
        ssd.getSsdBrand();
    }
    public static void getHdd(Hdd hdd) {
        hdd.getVolume();
        hdd.getReadSpeed();
        hdd.getWriteSpeed();
        hdd.getHddBrand();
        hdd.getRPM();
    }
}