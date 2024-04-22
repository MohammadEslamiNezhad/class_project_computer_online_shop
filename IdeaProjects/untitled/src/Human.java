import java.util.Scanner;

public class Human {

    int boyFriendNumber = 0 ;
    int girlFriendsNumber = 0 ;
    int friendNumber = boyFriendNumber + girlFriendsNumber ;
    int sisterNumber = 0 ;
    int brotherNumber = 0 ;
    int siblingNumber = sisterNumber + brotherNumber ;
    int age ;

    String firstName;
    String lastName ;
    String fullName = firstName + lastName ;
    String bloodGroup ;
    String nationalCode ;
    String shnasnameSerial ;


    float height ;
    float weight ;
    float eyeScore ;

    boolean hasWife ;
    boolean hasGlass ;

    public static void giveBirthdayDate() {

        Scanner birthdayDateScanner = new Scanner(System.in) ;

        int birthdayYear ;
        int birthdayMonth ;
        int birthdayDay ;
        do {
            System.out.print( " Please enter your birthday year : " );
            birthdayYear = birthdayDateScanner.nextInt();
            if (birthdayYear <= 1300 || birthdayYear > 1403) {
                System.out.println(" Error !! please try again ! ");
            }
        }while (birthdayYear <= 1300 || birthdayYear > 1403) ;

        if (birthdayYear == 1403){

            System.out.print( " Please enter your birthday month : " );
            birthdayMonth = birthdayDateScanner.nextInt();
            while (birthdayMonth != 1){
                System.out.println( " Error !! please try again ! " ) ;
                System.out.print( " Please enter your birthday month : " );
                birthdayMonth = birthdayDateScanner.nextInt();
            }

            System.out.print(" Please enter your birthday day : ");
            birthdayDay = birthdayDateScanner.nextInt();

            while (!(birthdayDay > 0 && birthdayDay <= 28)){
                System.out.println( " Error !! please try again ! " ) ;
                System.out.print(" Please enter your birthday day : ");
                birthdayDay = birthdayDateScanner.nextInt();
            }
        }else {

            do {
                System.out.print( " Please enter your birthday month : " );
                birthdayMonth = birthdayDateScanner.nextInt();
                if (birthdayMonth <= 0 || birthdayMonth > 12){
                    System.out.println( " Error !! please try again ! " ) ;
                }

            }while (birthdayMonth <= 0 || birthdayMonth > 12) ;

            do {
                System.out.print( " Please enter your birthday day : " );
                birthdayDay = birthdayDateScanner.nextInt();
                if (birthdayDay >= 0) {
                    if (birthdayDay > 31) {
                        System.out.println(" Error !! please try again ! ");
                    } else if ( birthdayDay == 31 && birthdayMonth > 6) {
                        System.out.println(" Error !! please try again ! ");
                    } else if ( birthdayYear % 4 != 3 && birthdayDay == 30 && birthdayMonth == 12) {
                        System.out.println(" Error !! please try again ! ");
                    }
                }
            }while (birthdayDay <= 0 || birthdayDay > 31) ;

        }
        System.out.println(" Your birthday date is : "
                + birthdayYear + " / " + birthdayMonth + " / " + birthdayDay );
    }
}
