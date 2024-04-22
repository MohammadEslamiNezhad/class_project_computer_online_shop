package myProjects;

import java.util.Scanner;

public class positiveNegativeOrZero {
    public static void main(String Args[]){
        System.out.println(" Hi , I'm a program to show your input number " +
                "positive , negative or zero .");
        Scanner numberScanner = new Scanner(System.in);
        System.out.println(" Enter one of from there commands : ");
        System.out.println(" \"start\" : to start the program . ");
        System.out.println(" \"quit\" : to close the program . ");
        String order = numberScanner.nextLine().trim().toLowerCase();

        while (!(order.equals("quit") || (order.equals("start")))){
            System.out.println(" Error ! try again .");
            System.out.println(" Enter one of from there commands : ");
            System.out.println(" \"start\" : to start the program . ");
            System.out.println(" \"quit\" : to close the program . ");
            order = numberScanner.nextLine().trim().toLowerCase();
            System.out.println("------------------------------------------------------------------");
        }
        Scanner orderScanner = new Scanner(System.in);
        int userInputNumber ;
        while (!(order.equals("quit"))){
            System.out.print(" Type a number . I'll say to you is positive T negative or zero :");
            userInputNumber = numberScanner.nextInt() ;
            if (userInputNumber == 0){System.out.println(" Your number is equals zero . ");}
            else {
                if ( userInputNumber > 0 ){System.out.println(" Your number is positive . ");}
                else {System.out.println(" Your number is negative . ");}
            }
            System.out.println("------------------------------------------------------------------");
            System.out.println(" Enter one of from there commands again : ");
            System.out.println(" \"start\" : to start the program . ");
            System.out.println(" \"quit\" : to close the program . ");
            System.out.print(" ");
            order = orderScanner.nextLine().trim().toLowerCase();
            System.out.println("------------------------------------------------------------------");
            while (!(order.equals("quit") || (order.equals("start")))){
                System.out.println(" Error ! try again .");
                System.out.println(" Enter one of from there commands : ");
                System.out.println(" \"start\" : to start the program . ");
                System.out.println(" \"quit\" : to close the program . ");
                order = orderScanner.nextLine().trim().toLowerCase();
                System.out.println("------------------------------------------------------------------");
            }
        }
    }
}