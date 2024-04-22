package myProjects;
import java.util.Scanner ;

public class starProject {
    public static void main(String Args[]) {

        System.out.println(" Hey there ! I'm a program to creat an array of starts . ");

        String command = typeCommand();

        Scanner starNumberScanner = new Scanner(System.in) ;
        int starNumber ;
        int i ;
        int j ;
        int k ;
        int l ;
        int m ;
        String starWithSpace = " *" ;

        while (! command.equals( "close" ) ){
            System.out.print("numbers of stars : ");
             starNumber = starNumberScanner.nextInt() ;

            for (i = starNumber  ; i >= 1 ; i-=2 ){

                for ( j = i ; j > 0 ; j-- ){
                    for ( k = ( ( starNumber - i ) / 2 ); (k > 0 && j == i) ; k --)
                        System.out.print("  ") ;

                    if (j != 1 ) System.out.print(starWithSpace);
                    else {
                        System.out.println (starWithSpace);
                        if (i != 1 ) {continue;}
                        for ( k = i + 2 ; k <= starNumber ; k += 2 ){
                            for ( l = k ; l >= 1 ; l-- ){
                                for ( m = ( starNumber - l ) / 2 ;
                                      ( ( m > 0 && l == k ) && ( l != starNumber ) ) ; m -- )
                                {System.out.print("  ");}

                                if ( l != 1 ) { System.out.print(starWithSpace); }
                                else { System.out.println(starWithSpace); }
                            }
                        }
                    }
                }
            }
            command = typeCommand();
        }
    }

    public static String typeCommand() {
        Scanner commandScanner;
        String command;
        do {
            System.out.println("------------------------------------------" +
                    "----------------------------------------------------------");
            System.out.println( " type a command ( Hint : " +
                    " You type <commands> and I show commands to you . ) " );
            System.out.print(" >>> ");
            commandScanner = new Scanner(System.in) ;
            command = commandScanner.nextLine().replace('<' , ' ').
                    replace('>' , ' ').trim().toLowerCase() ;
            System.out.println("------------------------------------------" +
                    "----------------------------------------------------------");

            if (! ( command.equals ( "close" ) || command.equals( "start" ) ||
                    command.equals ( "commands" ) ) )
                System.out.println(" !! Error !! please try again ! ");

            else if (command.equals("commands")) {
                System.out.println( " close : When you wouldn't run this program , Type close" +
                        " to close the program . \n ");
                System.out.println( " start : When you would start a program , Type start to " +
                        "start the program . \n " );
                System.out.println(" commands : If you want to know a commands or forgot there ," +
                        " won't forgot this command ; If type this command " +
                        " I'll show commands to you \n ");
            }

        } while ( ! ( command.equals ( "close" ) || command.equals( "start" )
                || command.isBlank() || command.isEmpty()) ) ;
        return command;
    }
}