package myProjects;

import java.util.Scanner;

public class projectSoodOfVam {
    public static void main(String args[]){
        Scanner scanInformation = new Scanner(System.in) ;
        System.out.println(" In barname baray mohasebe ghest hay yek vam tarahi shode ast . ");

        System.out.print("Mablagh vam (Milion toman) : ");
        float mablaghOfVam = scanInformation.nextFloat();

        System.out.print("Darsad sood salane: ");
        float percentOfSoodInAYear = scanInformation.nextFloat() ;

        System.out.print("Bazpardakht chan sale ? ");
        int ghestBazpardakhtYearNumber = scanInformation.nextInt();
        int ghestNumber = ghestBazpardakhtYearNumber * 12 ;

        float percentOfSoodInAMonth = percentOfSoodInAYear / 12 / 100 ; // 12 for month , 100 for %

        double mablaghGhest = ((Math.pow((1 + percentOfSoodInAMonth),(ghestNumber))) // Math.pow ( a , b ) for tavan
                * percentOfSoodInAMonth * mablaghOfVam) /
                (Math.pow((1 + percentOfSoodInAMonth),(ghestNumber)) - 1 ) ;
        System.out.println("Mablagh har ghest " + mablaghGhest + " Milion toman .") ;
         double mablaghSoodKol = (ghestNumber * mablaghGhest) - mablaghOfVam ;
        System.out.println("Mablagh Sood Kol : " + mablaghSoodKol + " Milion toman .");
    }
}
