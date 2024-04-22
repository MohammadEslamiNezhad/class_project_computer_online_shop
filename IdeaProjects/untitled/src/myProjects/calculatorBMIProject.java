package myProjects;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class calculatorBMIProject {
    public static void main(String args[]){
        Scanner floatScanner = new Scanner(System.in).useLocale(Locale.US) ;
        Scanner scannerString = new Scanner(System.in) ;
        System.out.println(" A program to calculate your " +
                " BMI from your ghad and vazn wich you tell to mee : ");
        System.out.print(" type one of this options :");
        System.out.print( " \"close\" or press enter : " );
        String order = scannerString.nextLine();

        while (!order.equals("close")){
            System.out.print(" Vazn (Kg) :  ");
            float yourVazn = floatScanner.nextFloat() ;

            System.out.print(" Ghad (cm) : ");
            float yourGhadCentiMeter = floatScanner.nextFloat();
            float yourGhad = yourGhadCentiMeter / 100 ;

            float yourBMI = yourVazn / ( yourGhad * yourGhad ) ;
            System.out.println(" Your BMI : " + yourBMI ) ;

            if (yourBMI < 18) {System.out.println(" خیلی لاغری ! یکم بخور جون بگیری . ");}
            else if (yourBMI <= 24){ System.out.println(" نرمال ؟ خوبه ! با همین رژیم غذایی پیش برو . ");}
            else{ System.out.println(" چقدر چاقی تو !! یکم رژیم بگیر ورزش کن خودتو به کشتن نده ");}

            System.out.println(" type one of this options : ");
            System.out.print( " \"close\" or press enter : " );
            order = scannerString.nextLine();
            }
        }
    }
