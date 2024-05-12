package practices.computer.Case.storage;

import java.util.Scanner;

public class Storage {
    // ----------------------------------- / variables / ----------------------------------- //
    boolean hasHdd ; 
    boolean hasSsd ;
    // has HDD & SSD
    int volume ; 
    // GB 
    int readSpeed; 
    int writeSpeed ;
    // Gb / sec
    Scanner scanner = new Scanner(System.in) ;

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

    public boolean isHasHdd() {
        return hasHdd;
    }

    public boolean isHasSsd() {
        return hasSsd;
    }

    public int getVolume() {
        return volume;
    }

    public int getReadSpeed() {
        return readSpeed;
    }

    public int getWriteSpeed() {
        return writeSpeed;
    }

}