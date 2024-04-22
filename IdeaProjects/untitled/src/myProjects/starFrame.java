package myProjects;
import java.util.Scanner ;
public class starFrame {
    public static void main(String Args[]){
        Scanner keyboard = new Scanner(System.in) ;
        print("Your string : ");
        String yourText = keyboard.next();
        printStars(yourText);
        println("* " + yourText + " *");
        printStars(yourText);
    }
    public static void print(String text) {
        System.out.print(text) ;
    }
    public static void println(String text) {
        System.out.println(text) ;
    }
    public static void printStars (String yourText) {
        String starAndSpace = "* " ;
        for ( int starAndSpaceNumber = yourText.length() ; starAndSpaceNumber > 0 ; starAndSpaceNumber -- ){
            if (starAndSpaceNumber != 1 ){
                print(starAndSpace);
            }
            else {println(starAndSpace);}
        }
    }
}
