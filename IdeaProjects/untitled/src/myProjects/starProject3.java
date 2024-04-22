package myProjects;

import java.util.Scanner;

public class starProject3 {
    public static void main(String args[]){
        System.out.println( " Hey there . I'm a program to show you an array of stars . " );

        String command ;
        int i , j , starNumber ;
        Scanner starNumberScanner ;


        command = starProject.typeCommand();

        while (!(command.equals("close"))){
            starNumberScanner = new Scanner(System.in);
            System.out.print(" Please enter star number : ");
            starNumber = starNumberScanner.nextInt();

            String doubleSpace, spaceWithStar;
            doubleSpace = "  ";
            spaceWithStar = " *";

            for (i = 0; i < starNumber; i++) {
                for (j = 0; j < starNumber - i; j++) {
                    System.out.print(doubleSpace);
                }
                for (j = 0; j <= i; j++) {
                    System.out.print(spaceWithStar);
                }
                System.out.println(" ");
            }
            command = starProject.typeCommand() ;
        }
    }
}
