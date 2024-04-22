package myProjects;

import java.util.Scanner;

public class printStarsProject {
    public static void main (String args[]){
        System.out.println( " Hey there ! I'm a program to print starts for you . " ) ;
        String command ;

        command = starProject.typeCommand() ;

        Scanner numberScanner ;
        int starNumber , i , j ;

        while (!(command.equals("close"))){

            numberScanner = new Scanner(System.in) ;
            System.out.print( " Please enter star number : " ) ;
            starNumber = numberScanner.nextInt() ;

            for ( i = 1; i <= starNumber; i++) {
                for ( j = 0; j < i; j++) {
                    if (j != i - 1 )  System.out.print("* ");
                    else  System.out.println("* ");
                }
            }

            command = starProject.typeCommand() ;
        }
    }
}
