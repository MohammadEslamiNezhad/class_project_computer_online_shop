import java.util.Scanner;

public class AbbasBouazar {
    public static void main(String args[]){
        Human human1 = new Human() ;
        Scanner stringDataTypeHuman1Scanner = new Scanner(System.in) ;

        human1.firstName = "Abbas" ;
        human1.lastName = "Bouazar" ;
        human1.fullName = human1.firstName + human1.lastName ;

        human1.age = 35 ;
        human1.weight = 60f ;
        human1.height = 1.8f ;

        System.out.print( " Mr \" Abbas Bouazar \" , What's your blood group ? " );
        human1.bloodGroup = stringDataTypeHuman1Scanner.nextLine() ;

        System.out.println( " First name : " + human1.firstName);
        System.out.println( " Last name : " + human1.lastName) ;
        System.out.println( " Full name : " + human1.fullName) ;
        System.out.println( " Your blood group is : " + human1.bloodGroup ) ;
        System.out.println( " Age : " + human1.age);
        System.out.println( " Height : " + human1.height);
        System.out.println( " Weight : " + human1.weight);
        Human.giveBirthdayDate();
    }
}
