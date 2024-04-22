package myProjects;

import java.util.Scanner;

public class numberReverserProject {
    public static void main (String args[]){
        System.out.println(" Hey there ! I'm a program to reverse numbers which you enter to program ");

        Scanner longNumberScanner = new Scanner(System.in) ;
        Scanner orderScanner = new Scanner(System.in) ;

        String order ;

        do {
            System.out.println(" start : to start the program . " );
            System.out.println(" close : to close the program . " );
            System.out.print(" Choose from two orders : ");
            order = orderScanner.nextLine().toLowerCase().trim();
            if (!(order.equals("close") || order.equals("start")))
                System.out.println(" Error ! please try again ! ");

        }while (!(order.equals("close") || order.equals("start"))) ;

        long userNumber;
        byte yekanOfUserNumber ;
        long reverseOfUserNumber ;

        while (!(order.equals("close"))){
            System.out.print(" Enter number : ");
            userNumber = longNumberScanner.nextLong();
            reverseOfUserNumber = 0 ;
            while (userNumber != 0){
                yekanOfUserNumber = (byte) (userNumber % 10) ;

                reverseOfUserNumber = reverseOfUserNumber * 10 + yekanOfUserNumber ;

                userNumber = userNumber / 10 ;
            }

            System.out.println( " The reverse of your number is : " + reverseOfUserNumber);
            System.out.println("--------------------------------------------------------------");

            do {
                System.out.println(" start : to start the program . " );
                System.out.println(" close : to close the program . " );
                System.out.print(" Choose from two orders : ");
                order = orderScanner.nextLine().toLowerCase().trim();
                if (!(order.equals("close") || order.equals("start")))
                    System.out.println(" Error ! please try again ! ");

            }while (!(order.equals("close") || order.equals("start"))) ;
        }
    }
}
