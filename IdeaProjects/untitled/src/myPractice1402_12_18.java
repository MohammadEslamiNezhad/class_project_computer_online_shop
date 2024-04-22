public class myPractice1402_12_18 {
    public static void main(String[] args) {
        print("Hello and welcome ! ");
        print("My name is Mohammad . ") ;
        print("I'm from Iran . ") ;
        print("I'll be a programmer ! ") ;
        int integerNumber = 10 ;
        integerNumber ++ ;
        double doubleNumber = 0.165413213102102 ;
        float floatNumber = 3.1135F ;
        String name = "Mohammad" ;
        char startCharName = 'n' ;

        while ( integerNumber > 0 ){
            integerNumber --  ;
            print("Hello");
        }
        do {
            integerNumber ++ ;
            print("Bye");
        }while (integerNumber < 11) ;

        for ( int i = 0 ; i <= 5 ; i++ ){
            if (i == 2) {
                print("i = 2");
            }
            else {
                print("i = " + i ) ;
            }
        }
        System.out.println(integerNumber);
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        print(name);
        System.out.println(startCharName);

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

    }
    public static void print(String text ){
        System.out.println(text);
    }
}