package myProjects;

import java.util.Scanner;

public class fizzBuzzGameProject {
    public static void main(String args[]){
        Scanner anytextScanner = new Scanner(System.in) ;
        System.out.println("Hello ! Welcome");
        System.out.print("This is a Fizz Buzz game and you can play this game by type" +
                " \"start\" after colon (and also you can type \"end\" to close this program) : ");
        String order = anytextScanner.nextLine().toLowerCase() ;

        while (!(order.equals("end")  || order.equals("start"))){
            System.out.println("Error ! please try again . ");
            System.out.print("Type a correct command again : ");
            order = anytextScanner.nextLine().toLowerCase() ;
        }

        int inputNumber ;
        boolean bakhshPazirBar3 , bakhshPazirBar5 ;

        while (!order.equals("end")) {
            System.out.print("to start play fizz buzz game you should enter a integer number : ");
            inputNumber = anytextScanner.nextInt();

            bakhshPazirBar3 = inputNumber % 3 == 0;
            bakhshPazirBar5 = inputNumber % 5 == 0;

            if (bakhshPazirBar3) {
                if (bakhshPazirBar5) {System.out.println("Fizz Buzz ! ");}
                else {System.out.println("Buzz");}
            } else {
                if (bakhshPazirBar5) {System.out.println("Fizz");}
                else {System.out.println(inputNumber);}
            }

            System.out.println("OK ! I'm too happy to met you and play this very simple game . ");
            System.out.println("if you want to play again with me type \"start\" else type" +
                    " \"end\" to close this game . ");

            Scanner scanOrderAgain = new Scanner(System.in) ;
            order = scanOrderAgain.nextLine().toLowerCase() ;

            while (!(order.equals("end")  || order.equals("start"))){
                System.out.print("Error ! please try again .   ");
                order = scanOrderAgain.nextLine().toLowerCase() ;
            }
        }

        System.out.println("Ok . Bye :( ");
    }
}