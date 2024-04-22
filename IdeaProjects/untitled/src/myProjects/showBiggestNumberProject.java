package myProjects;

import java.util.Scanner;

public class showBiggestNumberProject {
    public static void main(String args[]) {
        System.out.println(" Hi ; I'm a program to show a the biggest number from " +
                "three numbers wich you type for me ! ");

        Scanner orderScanner = new Scanner(System.in);
        Scanner integerNumber = new Scanner(System.in);
        String order ;
        int theFirstNumber , theSecondNumber , theThirdNumber ;
        do {
            System.out.println(" close : To close the program . ");
            System.out.println( " start : To start the program . ");
            System.out.print(" Type one of there commands : ");
            order = orderScanner.nextLine().trim().toLowerCase() ;
        }while (!(order.equals("close") || order.equals("start") ) ) ;
        while (!order.equals("close")){
            System.out.print(" Enter the first number : ");
            theFirstNumber = integerNumber.nextInt();

            System.out.print(" Enter the second number : ");
            theSecondNumber = integerNumber.nextInt();

            System.out.print(" Enter the third number : ");
            theThirdNumber = integerNumber.nextInt();

            if (theFirstNumber > theSecondNumber) {
                if (theSecondNumber >= theThirdNumber) {
                    System.out.println(" The biggest number is : " + theFirstNumber);
                } else {
                    if (theFirstNumber > theThirdNumber) {
                        System.out.println(" The biggest number is : " + theFirstNumber);
                    } else {
                        System.out.println(" The biggest number is : " + theThirdNumber);
                    }
                }
            } else {
                if (theFirstNumber < theSecondNumber) {
                    if (theFirstNumber >= theThirdNumber) {
                        System.out.println(" The biggest number is : " + theSecondNumber);
                    } else {
                        if (theSecondNumber > theThirdNumber) {
                            System.out.println(" The biggest number is : " + theSecondNumber);
                        } else {
                            System.out.println(" The biggest number is : " + theThirdNumber);
                        }
                    }
                } else {
                    if (theFirstNumber > theThirdNumber) {
                        System.out.println(" The biggest number is : " + theSecondNumber);
                    } else {
                        if (theFirstNumber < theThirdNumber) {
                            System.out.println(" The biggest number is : " + theThirdNumber);
                        } else {
                            System.out.println(" The biggest number is not exist ; ");
                            System.out.println(" Actually numbers are all equals two by two . ");
                        }
                    }
                }
            }
            System.out.println(" ----------------------------------------------------------------- ");
            do {
                System.out.println(" close : To close the program . ");
                System.out.println( " start : To start the program . ");
                System.out.print(" Type one of there commands : ");
                order = orderScanner.nextLine().trim().toLowerCase() ;
            }while (!(order.equals("close") || order.equals("start") ) ) ;
        }
        System.out.println(" OK ! good bye :-( ");
    }
}
