package myProjects;

import java.util.Scanner;

public class sumOfDonbaleHesabi {
    public static void main(String args[]){
        System.out.println(" Hi ; I'm a program to sum of jomalat donbale hesabi by" +
                " input the first , the end and ghadr nesbat of this donbale . ");
        Scanner orderScanner = new Scanner(System.in) ;
        String order ;

        Scanner integerNumberScanner = new Scanner(System.in) ;
        int theFirstNumber ;
        int theEndNumber ;
        int ghadrNesbat ;
        int teadad ;
        int sumOfNumbers ;

        do {
            System.out.print(" For start program type \"start\" and " +
                    "for close program type \"close\" : ");
            order = orderScanner.nextLine() ;
            System.out.println(" ----------------------------------------------------------- ");
        }while (!(order.equals("close") || order.equals("start") )) ;

        while (!order.equals("close")){

            do {
                System.out.println(" Be care full : If (your the end number - your the first number) " +
                        " isn't bakhsh pazir bar ghadr nesbat you must type again all of numbers ! ");

                System.out.print(" Enter the first number : ");
                theFirstNumber = integerNumberScanner.nextInt() ;

                System.out.print(" Enter the end number : ");
                theEndNumber = integerNumberScanner.nextInt() ;

                if ( -(theEndNumber) == theFirstNumber) {
                    ghadrNesbat = (theEndNumber - theFirstNumber > 0) ? 1 : -1 ;

                    System.out.println(" The sum of your donbale is : " + 0);
                    System.out.println(" --------------------------------------------------------- ");

                    do {
                        System.out.print(" For start program type \"start\" and " +
                                "for close program type \"close\" : ");
                        order = orderScanner.nextLine() ;
                        System.out.println(" ----------------------------------------------------- ");
                    }while (!(order.equals("close") || order.equals("start") )) ;
                    if (order.equals("close"))
                        break;
                    else
                        continue;
                }

                System.out.print(" Enter the ghadr nesbat : ");
                ghadrNesbat = integerNumberScanner.nextInt() ;

                System.out.println(" ----------------------------------------------------------- ");

            } while ( ( ( theEndNumber - theFirstNumber ) % ghadrNesbat != 0)
                    || ( ( ( theEndNumber - theFirstNumber ) > 0 && ghadrNesbat < 0 )
                    || ( ( theEndNumber - theFirstNumber ) < 0 && ghadrNesbat > 0 ) )
                    || theFirstNumber == theEndNumber
                    || ( ( theEndNumber - theFirstNumber ) < ghadrNesbat ) ) ;

            if (order.equals("close") ){break;}
            else if (-(theEndNumber) == theFirstNumber) {continue;}

            teadad = ( ( ( theEndNumber - theFirstNumber ) / ghadrNesbat) + 1 ) ;
            sumOfNumbers = ( theEndNumber + theFirstNumber ) * ( teadad / 2 ) ;
            System.out.println(" The sum of your donbale is : " + sumOfNumbers );

            System.out.println(" ----------------------------------------------------------- ");

            do {
                System.out.print(" For start program type \"start\" " +
                        "and for close program type \"close\" : ");
                order = orderScanner.nextLine() ;
                System.out.println(" ----------------------------------------------------------- ");

            }while (!(order.equals("close") || order.equals("start") )) ;
        }
        System.out.println(" Ok . See you later ;-) ");
    }
}
