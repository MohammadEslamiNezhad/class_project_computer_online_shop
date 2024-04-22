package myProjects;

import java.util.Locale;
import java.util.Scanner;

public class thermoChanger {
    public static void main (String args [] ){

        Scanner scannerObject = new Scanner(System.in) ;
        Scanner floaScanner = new Scanner(System.in).useLocale(Locale.US) ;
        float celcious ;
        float kelvin ;
        float farenhite ;

        System.out.println(" یکایی که میخوای باهاش کار کنی رو انتخاب کن ");
        System.out.println( " K : کلوین , C : سلسیوس , F : فارنهایت  ");
        System.out.println( " You can close th program by \"close\" command .");
        System.out.print( " حرف مورد نظرت رو تایپ کن : ");
        String yeka = scannerObject.nextLine() ;

        while ( !yeka.equals("close") ) {
            switch (yeka) {
                case "K" -> {
                    System.out.print(" دما چند درجه ی کلوینه ؟ ");
                    kelvin = floaScanner.nextFloat();
                    celcious = kelvin - 273.15f ;
                    farenhite = ((9f / 5f) * (celcious) + 32);
                    System.out.println(celcious + " C ");
                    System.out.println(farenhite + " F ");
                }
                case "F" -> {
                    System.out.print(" دما چند درجه ی فارنهایته ؟ ");
                    farenhite = floaScanner.nextFloat();
                    celcious = ((farenhite - 32) * (5f / 9f));
                    kelvin = celcious + 273.15f ;
                    System.out.println(celcious + " C ");
                    System.out.println(kelvin + " K ");
                }
                case "C" -> {
                    System.out.print(" دما چند درجه سلسیوسه ؟ ");
                    celcious = floaScanner.nextFloat();
                    kelvin = celcious + 273.15f ;
                    farenhite = ((9f / 5f) * (celcious) + 32);
                    System.out.println(kelvin + " K ");
                    System.out.println(farenhite + " F ");
                }
                default -> {
                    System.out.print(" Error ! please try again : ");
                    yeka = scannerObject.nextLine();
                    continue;
                }
            }
            System.out.println(" یکایی که میخوای باهاش کار کنی رو انتخاب کن " ) ;
            System.out.println( " K : کلوین , C : سلسیوس , F : فارنهایت  " ) ;
            System.out.println( " You can close th program by \"close\" command . " );
            System.out.print( " حرف مورد نظرت رو تایپ کن : ");
            yeka = scannerObject.nextLine() ;
        }
    }
}