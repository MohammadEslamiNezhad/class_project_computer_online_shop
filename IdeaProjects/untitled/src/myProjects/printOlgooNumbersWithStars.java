package myProjects;

import java.util.Scanner;

public class printOlgooNumbersWithStars {
    public static void main (String args []){
        System.out.println("-------------------------------------------------------" +
                "----------------------------------------------");
        System.out.println( " Hey there . There is a program to print an array of" +
                " numbers and a star . " );

        Scanner integerNumberScanner ;
        String stringOfNumber ;
        String command ;
        int integerNumber ;

        command = starProject.typeCommand() ;

        while (!command.equals("close")) {
            integerNumberScanner = new Scanner(System.in);
            System.out.print(" Enter integer number : ");
            integerNumber = integerNumberScanner.nextInt();
            for (int i = integerNumber - 1; i > 0; i--) {
                integerNumber = (integerNumber * 10) + i;
            }
            stringOfNumber = String.valueOf(integerNumber);

            for (int i = 0; i < stringOfNumber.length(); i++) {
                System.out.println(stringOfNumber.replace
                        (stringOfNumber.charAt(i),'*'));
            }

            command = starProject.typeCommand() ;
        }
    }
}
