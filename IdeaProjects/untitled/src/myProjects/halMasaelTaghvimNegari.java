package myProjects;

import java.util.Arrays;
import java.util.Scanner;

public class halMasaelTaghvimNegari {
    public static void main( String Args[]){
        System.out.println(" برنامه ای برای حل مساپل تقویم نگاری سال دوازدهم درس گسسته رشته ی ریاضی ");
        Scanner integerScanner = new Scanner(System.in) ;
        Scanner stringScanner = new Scanner(System.in) ;
        Scanner booleanScanner = new Scanner(System.in) ;

        System.out.print("year : ");
        int year = integerScanner.nextInt() ;

        System.out.print("month : ");
        int month = integerScanner.nextInt() ;

        System.out.print("day : ");
        int day = integerScanner.nextInt() ;

        String [] weekDays = { "shanbe" , "yekshanbe" , "doshanbe" , "seshanbe" ,
                "charshanbe" , "panjshanbe" , "jome" } ;

        System.out.println("chan shanbe ? (entekhab az list zir)");
        System.out.println(Arrays.toString(weekDays)); ;
        String chandShanbe = stringScanner.nextLine();
        while (!(Arrays.asList(weekDays).contains(chandShanbe))){
            System.out.println("Error ! try again . ");
            System.out.println("chan shanbe ? (entekhab az list zir)");
            System.out.println(Arrays.toString(weekDays)) ;
            chandShanbe = stringScanner.nextLine();
        }

        System.out.print("vahed jolo ya aghab raft (mesl gharn , sal , mah , hafte , rooz ) : ");
        String vahed = stringScanner.nextLine();


        long daysUp ;

        switch (vahed){
            case ("gharn") -> {
                System.out.println("chand gharn ? ");
                int gharn = integerScanner.nextInt();
                System.out.println("ghabl (true) / ba'd (false) : ") ;
                boolean isGhabl = booleanScanner.nextBoolean() ;
                if (year % 4 == 3 ){daysUp = gharn * ( (365 * 100) + 26 );}
                else daysUp = gharn * ( (365 * 100) + 25 );

                if (isGhabl) year -= (gharn * 100);
                else year += (gharn * 100);

                System.out.println(" sal : " + year) ;
                System.out.println(" mah : " + month) ;
                System.out.println(" rooz : " + day) ;

                if (daysUp % 7 == Arrays.asList(weekDays).indexOf(chandShanbe)) {
                    System.out.println("rooz hafte : " + chandShanbe);
                } else {
                    if (daysUp % 7 + Arrays.asList(weekDays).indexOf(chandShanbe) >= 7 ){
                        long chandShanbeIndex =
                                ( daysUp % 7 ) + (Arrays.asList(weekDays).indexOf(chandShanbe)) - 7 ;
                        chandShanbe = weekDays[(int) chandShanbeIndex];
                        System.out.println("rooz hafte : " + chandShanbe);
                    }
                    else {
                        long chandShanbeIndex =
                                ( daysUp % 7 ) + (Arrays.asList(weekDays).indexOf(chandShanbe)) ;
                        chandShanbe = weekDays[(int) chandShanbeIndex];
                        System.out.println("rooz hafte : " + chandShanbe);
                    }
                }
            }
            case ("sal") -> {
                System.out.print("chand sal ?");
                int sal = integerScanner.nextInt();
                System.out.println("ghabl (true) / ba'd (false) : ") ;
                boolean isGhabl = booleanScanner.nextBoolean() ;
                int baghimandeGhadim = year % 4 ;
                if (isGhabl) {year -= sal;}
                else {year += sal;}
                int baghmandeJadid = year % 4 ;
                if (baghmandeJadid == baghimandeGhadim){
                    if (baghmandeJadid == 3){daysUp = (365 * (long) sal) + (sal / 4 );}
                    else {daysUp = (365 * (long) sal) + (sal / 4) ;}
                }else {
                    if ( baghmandeJadid == 3 || baghimandeGhadim == 3 ){
                        daysUp = (365 * (long) sal) + ((sal / 4 )) ;
                    }else {daysUp = (365 * (long) sal) + ((sal / 4 ) - 1) ;}
                }

                if (daysUp % 7 == Arrays.asList(weekDays).indexOf(chandShanbe)) {
                    System.out.println("rooz hafte : " + chandShanbe);
                } else {
                    if (daysUp % 7 + Arrays.asList(weekDays).indexOf(chandShanbe) >= 7 ){
                        long chandShanbeIndex = (isGhabl) ?
                                - ( daysUp % 7 ) + (Arrays.asList(weekDays).indexOf(chandShanbe)) - 7 :
                                ( daysUp % 7 ) + (Arrays.asList(weekDays).indexOf(chandShanbe)) - 7 ;
                        chandShanbe = weekDays[(int) chandShanbeIndex];
                        System.out.println("rooz hafte : " + chandShanbe);
                    }
                    else {
                        long chandShanbeIndex = (isGhabl) ?
                                7 - ( daysUp % 7 ) - (Arrays.asList(weekDays).indexOf(chandShanbe)) :
                                ( daysUp % 7 ) + (Arrays.asList(weekDays).indexOf(chandShanbe)) ;
                        chandShanbe = weekDays[(int) chandShanbeIndex];
                        System.out.println("rooz hafte : " + chandShanbe);
                    }
                }

                System.out.println(" sal :" + year) ;
                System.out.println(" mah : " + month) ;
                System.out.println(" rooz : " + day) ;
            }
            case ("mah") -> {
                System.out.println("chand mah ?");
                int mah = integerScanner.nextInt() ;
                System.out.println("ghabl (true) / ba'd (false) : ") ;
                boolean isGhabl = booleanScanner.nextBoolean() ;
                if (isGhabl){
                    month -= mah ;
                    while (month <= 0){
                        if (month == 0){
                            month = 1 ;
                            break;
                        }
                        month += 12 ;
                        year -- ;
                    }
                }else {
                    month += mah ;
                    while (month > 12){
                        month -= 12 ;
                        year ++ ;
                    }
                    daysUp = (long) mah * 30 ;
                    if (daysUp % 7 == Arrays.asList(weekDays).indexOf(chandShanbe)) {
                        System.out.println("rooz hafte : " + chandShanbe);
                    } else {
                        if (daysUp % 7 + Arrays.asList(weekDays).indexOf(chandShanbe) >= 7 ){
                            long chandShanbeIndex =
                                    ( daysUp % 7 ) + (Arrays.asList(weekDays).indexOf(chandShanbe)) - 7 ;
                            chandShanbe = weekDays[(int) chandShanbeIndex];
                            System.out.println("rooz hafte : " + chandShanbe);
                        }
                        else {
                            long chandShanbeIndex =
                                    ( daysUp % 7 ) + (Arrays.asList(weekDays).indexOf(chandShanbe)) ;
                            chandShanbe = weekDays[(int) chandShanbeIndex];
                            System.out.println("rooz hafte : " + chandShanbe);
                        }
                    }
                }
            }
            case ("hafte") -> {
                System.out.println("chand hafte ? ");
                int hafte = integerScanner.nextInt() ;
                System.out.println("ghabl (true) / ba'd (false) : ") ;
                boolean isGhabl = booleanScanner.nextBoolean() ;

                if (isGhabl){
                    day -= hafte * 7 ;
                    while (day <= 0){
                        if (day == 0 ){
                            day = 1 ;
                            break;
                        }
                        day += 30 ;
                        month -- ;
                    }
                }else {
                    day += hafte * 7 ;
                    while ( day >= 30 ){
                        day -= 30 ;
                        month ++ ;
                    }
                }
            }
            case ("rooz") -> {
                System.out.println("chand rooz ? ");
                int rooz = integerScanner.nextInt();
                System.out.println("ghabl (true) / ba'd (false) : ") ;
                boolean isGhabl = booleanScanner.nextBoolean() ;
                if (isGhabl){
                    day -= rooz;
                    while (day <= 0){
                        if (day == 0 ){
                            day = 1 ;
                            break;
                        }
                        day += 30 ;
                        month -- ;
                    }
                }else {
                    day += rooz ;
                    while (day >= 30){
                        day -= 30 ;
                        month ++ ;
                    }
                }
            }
        }
    }
}
