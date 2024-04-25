package myProjects;

import src.TaghvimNegari.Day;
import src.TaghvimNegari.Month;
import src.TaghvimNegari.Year;

import java.util.Scanner;

public class halMasaelTaghvimNegari {
    public static void main( String Args[]){
        /// What does my program do ?
        System.out.println(" برنامه ای برای حل مساپل تقویم نگاری" +
                " سال دوازدهم فصل سوم درس ریاضیات گسسته رشته ی ریاضی ");

        // Creat a new object from classes .
        Day day = new Day() ;
        Month month = new Month() ;
        Year year = new Year() ;
        Scanner numberScanner = new Scanner(System.in) ;

        // Scan initial day from user .
        System.out.println( " Now we ask initial date from you . " ) ;
        // Initial day
        System.out.print( " Please enter initial day : " );
        day.setInitialDay(numberScanner.nextInt());
        // Initial month
        System.out.print( " Please enter initial month : " );
        month.setInitialMonth(numberScanner.nextInt());
        // Initial year
        System.out.print( " Please enter initial year : " );
        year.setInitialYear(numberScanner.nextInt());

        System.out.println( " Initial year is : " + year.getInitialYear() + " / "
                + month.getInitialMonth() + " / " + day.getInitialDay() );

        String which ;
        do {
            Scanner stringScanner = new Scanner(System.in) ;
            System.out.print( " Which ( year , month , day ) ? " );
            which = stringScanner.nextLine().trim().toLowerCase();

        }while (!(which.equals("year") || which.equals("month") || which.equals("day")));

        Scanner booleanScanner = new Scanner(System.in) ;
        System.out.print( " next ( answer by true / false ) ? " );
        boolean isNext = booleanScanner.nextBoolean() ;

        System.out.print( " How many ? " );
        int howMany = numberScanner.nextInt() ;

        if (isNext){
            switch (which) {
                case "year" :
                    System.out.println( " changing year ! " );
                    day.setFinalDay(day.getInitialDay());
                    month.setFinalMonth(0);
                    year.setFinalYear(howMany);
                    break;
                case "month" :
                    System.out.println( " changing month ! " );
                    day.setFinalDay(0);
                    month.setFinalMonth(howMany);
                    year.setFinalYear(0);
                    break;
                case "day" :
                    System.out.println( " changing day ! " );
                    day.setFinalDay(howMany);
                    month.setFinalMonth(0);
                    year.setFinalYear(0);
                    break;
                default:
                    System.out.println( " Not exist ! " );
            }
        }else {
            switch (which) {
                case "year" :
                    System.out.println( " changing year ! " );
                    day.setFinalDay(0);
                    month.setFinalMonth(0);
                    year.setFinalYear(-howMany);
                    break;
                case "month" :
                    day.setFinalDay(0);
                    month.setFinalMonth( -(howMany));
                    year.setFinalYear(0);
                    break;
                case "day" :
                    day.setFinalDay( - howMany );
                    month.setFinalMonth(0);
                    year.setFinalYear(0);
                    break;
                default:
                    System.out.println( " Not exist ! " );
            }
        }
        System.out.println( " Your final date is : " + year.getFinalYear() +
                " / " + month.getFinalMonth() + " / " + day.getFinalDay() );
    }
}
