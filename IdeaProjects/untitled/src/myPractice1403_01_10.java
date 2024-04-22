import java.util.Locale;
import java.util.Scanner;

public class myPractice1403_01_10 {
    public static void main(String args[]){
        Scanner ageScanner = new Scanner(System.in) ;
        System.out.print("please enter your age :");
        int age = ageScanner.nextInt() ;

        String name = ( age > 18 ) ? "Mobina" : "Faeze" ;
        System.out.println(name);

        boolean isFat = ( age > 18 ) ? false : true ;
        System.out.println(" is she fat ? " + isFat);

        float height = ( age > 18 ) ? 1.70f : 1.40f ;
        System.out.println(height);

        Scanner scanFloatNumbers = new Scanner(System.in).useLocale(Locale.US);
        float nomreCheshm = scanFloatNumbers.nextFloat() ;
        System.out.println(nomreCheshm);


        switch ((int)nomreCheshm) {
            case 1 :
                System.out.println("Abbas Bouazar");
                System.out.println("1985");
                break;
            case 2 :
                System.out.println("Yedoone R dare");
                System.out.println("1385");
                break;
            case 3 :
                System.out.println("Yedoone ein dare");
                System.out.println("3985");
                break;
            case 4 :
                System.out.println("Yedoone boo dare");
                System.out.println("9385");
                break;
            default :
                System.out.println("Kojaye tim man vojood dare ?");
        }

    }
}
