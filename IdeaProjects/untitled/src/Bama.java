import java.util.Locale;
import java.util.Scanner;

public class Bama {
    public static void main (String Args[]){
        Scanner stringScanner = new Scanner(System.in); // copied
        Scanner integerScanner = new Scanner(System.in); // copied
        Scanner floatScanner = new Scanner(System.in).useLocale(Locale.US) ; // copied
        int index = 50 ; // copied
        Car [] car = new Car [index] ; // copied
        String command = typeCommand(); // for main
        String command2 ;

        while (!command.equals("close")) {
            do {command2 = typeCommand2() ;} while (command2.equals("back"));

//            car[i] = new Car() ; // copied
//
//            System.out.print( " Please enter car axle model" +
//                    " ( front axle , back axle , four wheel drive , all wheel drive ) : " );
//            car[i].setCarAxleModel(stringScanner.nextLine().trim().toLowerCase());
//
//            System.out.print( " Please enter fuel consumption " +
//                    "( in 100 km between 5 and 15 . ) : " ) ;
//            car[i].setFuelConsumption(floatScanner.nextFloat());
//
//            System.out.print( " Please enter volume of bock " +
//                    "( between 40 and 90 litter . ) : " );
//            car[i].setVolumeOfBock(floatScanner.nextFloat());
//
//            System.out.print( " Please enter volume of engine " +
//                    "( between 2 and 4 litter . ) : " ) ;
//            car[i].setVolumeOfEngine(floatScanner.nextFloat());
//
//            System.out.print( " Please enter number of cylinder . " +
//                    "( it just can 4 , 6 and 8 . not anything other ! ) : " ) ;
//            car[i].setNumberOfCylinder(integerScanner.nextInt());
//
//            System.out.print( " Please enter number of gears . " +
//                    "( it can have between 3 and 10 gear ! ) : " ) ;
//            car[i].setNumberOfGears(integerScanner.nextInt());

            System.out.println( " Okay ; Your car has been successfully registered." );
            System.out.println( " now choose . \" close the program \" or " +
                    " \" register other car \" . " );
            command = typeCommand();
        }
    }
    public static String typeCommand() {
        Scanner commandScanner;
        String command1;
        do {
            System.out.println("---------------------------------" +
                    "------------------------------------------------");
            System.out.println( " type a command ( Hint : " +
                    " You type <commands> and I show commands to you . ) " );
            System.out.print(" >>> ");
            commandScanner = new Scanner(System.in) ;
            command1 = commandScanner.nextLine().replace('<' , ' ').
                    replace('>' , ' ').trim().toLowerCase() ;
            System.out.println("--------------------------------------" +
                    "--------------------------------------");

            if (! ( command1.equals ( "close" ) || command1.equals( "start" ) ||
                    command1.equals ( "commands" ) ) )
                System.out.println(" !! Error !! please try again ! ");

            else if (command1.equals("commands")) {
                System.out.println( " close : When you wouldn't run " +
                        "this program , Type close to close the program . \n ");
                System.out.println( " start : When you would start a program " +
                        ", Type start to start the program . \n " );
                System.out.println(" commands : If you want to know" +
                        " a commands or forgot there , won't forgot this command ; " +
                        "If type this command I'll show commands to you \n ");
            }

        } while ( ! ( command1.equals ( "close" ) || command1.equals( "start" )
                || command1.isBlank() || command1.isEmpty()) ) ;
        return command1;
    }
    public static String typeCommand2() {


        Scanner stringScanner = new Scanner(System.in);
        Scanner integerScanner = new Scanner(System.in);
        Scanner floatScanner = new Scanner(System.in).useLocale(Locale.US) ;

        System.out.println( " Welcome to my program :-) " );
        System.out.print( " Please type your command after this prompt . ");
        System.out.println( " ( type commands 2 to show my commands to you ) " );
        System.out.print( " >>> " );
        String command2 = stringScanner.nextLine().trim().toLowerCase();

        switch (command2){

            case "reg -car" :
                System.out.println( " Welcome to the car registration page ! " );
                System.out.println( " Type commands 2-1 to help to you . " );
                System.out.print ( " >>> " );
                String command2_1 = stringScanner.nextLine().trim().toLowerCase() ;
                int theNumberOfCars = 50 ;
                int index = 0 ;
                Car [] car = new Car [theNumberOfCars] ;
                car [index] = new Car() ;
                switch (command2_1){
                    case "reg -owner" :
                        System.out.println( " Welcome to the car owner registration ! " );
                        System.out.print( " What's car owner full name ? " );
                        car[index].fullNameOfCarOwner = stringScanner.nextLine().trim();
                        break;

                    case "reg -brand" :
                        System.out.println(" Welcome to the car model registration ! ");
                        System.out.print( " Please enter model of your car : " );
                        car[index].setBrand(stringScanner.nextLine().trim().toUpperCase());
                        break;

                    case "reg -model" :
                        if (car[index].getBrand().isEmpty()){
                            System.out.println( " !! Error !! You can't register model " +
                                    "without register brand ! " );
                        }else {
                            car[index].setModel(stringScanner.nextLine().trim());
                        }
                        break;

                    case "reg -kilometer" :
                        System.out.println(" Welcome to the car kilometer " +
                                "work registration ! ");
                        System.out.print( " How long has your car worked ? (km) " ) ;
                        System.out.println( " if your machine is new enter zero number .):" );
                        car[index].setKiloMeter(integerScanner.nextInt());
                        break;

                    case "reg -fuel type" :
                        System.out.println(" Welcome to the car fuel type registration ! ");
                        car[index].setFuelType(stringScanner.nextLine().trim().toLowerCase());
                        break;

                    case "reg -gb model" :
                        System.out.println(" Welcome to the car fuel type registration ! ");
                        System.out.print( " Please enter gearbox model " +
                                "( Automatic , Semi Automatic , Manual ) : " ) ;
                        car[index].setGearBoxModel(stringScanner.nextLine().
                                trim().toLowerCase());
                        break;

                    case "commands 2-1" :
                        System.out.println( " reg -owner : To register owner . " );
                        System.out.println( " reg -brand : To register brand . " );
                        System.out.println( " reg -model : To register model . " );
                        System.out.println( " reg -kilometer : To know how much " +
                                "your car has worked (in kilometers). If your car is new," +
                                " enter zero after entering this section." );
                        System.out.println( " reg -fuel type : To register fuel type . " );
                        System.out.println( " reg -gb model : To register gear box model ." );
                        System.out.println( " commands 2-1 : show my commands in " +
                                "car registration page to you . " );
                        System.out.println( " back : for back to the previous menu . " );
                        break;
                    case "back" :
                        System.out.println( " You back to the first menu successfully . " );
                        break;
                    default:
                        System.out.println( " !! Error !!  Please try again ! " );
                }
                break;

            case "commands 2" :
                System.out.println(" commands 2 : to show my commands to you .");
                System.out.println( " back : to back to the first menu ! " );
                break;

            case "back" :
                System.out.println( " You back to the first menu successfully . " );
                break;

            default:
                System.out.println( " !! Error !! please try again ! " );
        }

        return command2 ;
    }
}
