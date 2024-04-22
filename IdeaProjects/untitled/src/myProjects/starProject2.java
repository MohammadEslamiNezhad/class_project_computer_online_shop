package myProjects;

import java.util.Scanner;

public class starProject2 {
    public static void main(String args[]){
        System.out.println("------------------------------------------" +
                "----------------------------------------------------------");
        System.out.println(" Hey there , I'm a program to show to you an arrays of stars . ");

        Scanner integerNumberScanner ;
        int starNumber ;

        String command ;
        command = starProject.typeCommand() ;

        while ( ! ( command.equals("close") || command.isBlank() || command.isEmpty() ) ){
            integerNumberScanner = new Scanner(System.in);
            System.out.print(" Please enter star number : ");
            starNumber = integerNumberScanner.nextInt();

            for (int i = starNumber; i > 0 ; i--) {
                if (i != starNumber) {
                    System.out.print(" ");
                }
                for (int j = i ; j > 0  &&
                        i != starNumber; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < starNumber - i ; k++) {
                    System.out.print(" ");

                    if (k == starNumber - i - 1 ) {
                        System.out.println("*");
                    }else {
                        System.out.print("*");
                    }
                }
            }

            command = starProject.typeCommand() ;
        }

    }
}
