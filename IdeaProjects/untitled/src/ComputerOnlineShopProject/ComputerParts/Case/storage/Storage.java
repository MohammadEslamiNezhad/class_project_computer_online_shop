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
        Storage.hasHdd = hasHdd ;
    }
    public void setHasSsd(boolean hasSsd){
        Storage.hasSsd = hasSsd ;
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
        printResult("has HDD" , String.valueOf(hasHdd)); // fixme (comments missed for this method)
    } // fixme (erase this method)

    public void getHasSsd() {
        printResult("has SSD" , String.valueOf(hasSsd));
    } // fixme (erase this method)

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
            Hdd hdd = (Hdd) storage;
            System.out.println(hdd) ;
        }
        storage.getHasSsd();
        if (hasSsd){
            System.out.println("// -------------------------------- " +
                    "// SSD // ----------------------------- //");
            Ssd ssd = (Ssd) storage;
            System.out.println(ssd);
        }
    }

}