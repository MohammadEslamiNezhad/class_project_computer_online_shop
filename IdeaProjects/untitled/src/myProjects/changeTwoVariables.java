package myProjects;

import java.util.Scanner;

public class changeTwoVariables {
    public static void main (String args[]){
        System.out.println(" Hi ; I'm a program to change two integer variables which " +
                "you enter to program . ");
        Scanner orderScanner ;
        Scanner integerNumberScanner = new Scanner(System.in);
        String order ;
        int firstNumber , secondNumber ;
        do {
            System.out.println(" Enter one of there commands : ");
            System.out.println(" \"close\" : To close the program . ");
            System.out.println(" \"start\" : To start the program . ");
            orderScanner = new Scanner(System.in);
            order = orderScanner.nextLine().trim().toLowerCase();
            System.out.println("----------------------------------------------------------------------");
        }while (!(order.equals("close") || order.equals("start"))) ;
        while (!order.equals("close")){
            System.out.print(" Enter the first number : ");
            firstNumber = integerNumberScanner.nextInt() ;

            System.out.print(" Enter the second number : ");
            secondNumber = integerNumberScanner.nextInt() ;

            firstNumber = firstNumber + secondNumber ;
            secondNumber = firstNumber - secondNumber ;
            firstNumber = firstNumber - secondNumber ;
            System.out.println(" Your first number : " + firstNumber );
            System.out.println(" Your second number : " + secondNumber );
            System.out.println("----------------------------------------------------------------------");

            do {
                System.out.println(" Enter one of there commands : ");
                System.out.println(" \"close\" : To close the program . ");
                System.out.println(" \"start\" : To start the program . ");
                orderScanner = new Scanner(System.in);
                order = orderScanner.nextLine().trim().toLowerCase();
                System.out.println("-------------------------------------------------------------------");
            }while (!(order.equals("close") || order.equals("start"))) ;
        }
    }
}