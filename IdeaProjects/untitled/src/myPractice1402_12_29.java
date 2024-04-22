import java.util.Arrays;
import java.util.Scanner;

public class myPractice1402_12_29 {
    public static void main(String args[]){
        char asdf = '2' ;
        int asdfg = (int) asdf ;
        System.out.println(asdf);
        System.out.println(asdfg);
        int [][] names = new int[6][2] ;
        names[0][0] = 15 ;
        names[0][1] = 180 ;
        names[1][0] = 25 ;
        names[1][1] = 150 ;
        names[2][0] = 34 ;
        names[2][1] = 205 ;
        names[3][0] = 40 ;
        names[3][1] = 175 ;
        names[4][0] = 78 ;
        names[4][1] = 187 ;
        names[5][0] = 21 ;
        names[5][1] = 163 ;
        float [][][] nomarat3SalDaneshAmoozan =
                { { { 12.5f , 16.12f } , { 16.34f , 12.98f } , { 19.0f , 14.51f } } ,
                { {18.89F, 16.50f } , { 19.87f , 17.50f } , { 19.34f , 17.00f } } ,
                { {18.34F, 19.43f } , { 13.98f , 16.02f } , { 19.98f , 18.76f } } ,
                { { 20.0f , 18.24f } , { 16.76f , 19.21f } , { 15.83f , 17.79f } } ,
                { { 16.30f , 18.76f } , { 19.76f , 18.87f } , { 16.90f , 18.60f } } ,
                { { 13.32f , 16.34f } , { 17.93f , 15.73f } , { 3.32f ,5.50f } } ,
                { { 12.31f , 9.45f } , { 2.18f , 3.09f } , { 15.35f , 2.03f } } ,
                { { 3.13f , 16.32f } , { 4.02f , 5.29f } , { 12.1f , 13.13f } } ,
                { { 12.0f , 13.23f } , { 3.09f , 4.09f } , {14.45f , 4.45f } } ,
                { { 13.45f , 17.53f } , { 16.02f , 16.30f } , { 13.17f , 14.73f } } ,
                { { 17.32f , 16.53f } , { 13.20f , 14.3f } , { 13.92f , 14.07f } } ,
                { { 10.20f , 13.03f } , { 13.02f , 14.53f } , { 3.32f , 4.53f } } ,
                { { 11.32f , 16.53f } , { 10.10f , 11.66f } , { 4.81f , 11.03f } } ,
                { { 13.3f , 10.43f } , { 3.3f , 4.03f } , { 10.67f , 13.19f } } ,
                { { 13.83f , 10.03f } , { 18.40f , 14.73f } , { 13.02f , 10.53f } } ,
                { { 4.06f , 10.67f } , { 12.1f , 14.01f } , { 13.64f , 17.10f } } ,
                { { 1.10f , 10.3f } , { 0.72f , 0.53f } , { 11.06f , 10.53f } } ,
                { { 13.02f , 14.53f } , { 14.65f , 10.3f } , { 13.30f , 11.6f } } ,
                { { 3.32f , 4.53f } , { 17f , 10.03f } , { 14.13f , 14.02f } } ,
                { { 0.75f , 1f } , { 14.0f , 14.1f } , { 3.32f , 10.1f } } ,
                { { 0.36f , 1.13f } , { 3.32f , 4.53f } , { 13.32f , 16.0f } } } ;
        System.out.println(" Nomarat 3 sal danesh amoozan : " + Arrays.deepToString(nomarat3SalDaneshAmoozan));
        System.out.println(" Sen va ghad afrad be tartib : " + Arrays.deepToString(names));
        int [] heights = { 54 , 67 , 98 , 120 , 45 , 67 , 86 , 75, 54 , 67 , 62 , 69 , 57 , 46 } ;
        char [] abbasBouazar = {'A' , 'b' , 'b' , 'a' , 's' , ' ' , 'B' , 'o' , 'u' , 'a' , 'z' , 'a' , 'r'} ;
        System.out.println("Chars of Abbas Bouazar : " + Arrays.toString(abbasBouazar));
        heights[3] = 84 ;
        heights[4] = (int) 68.4653456 ;
        String [] qwer = {"aaaaa" , "ssssss" , "mnkdnfgvkd" } ;
        System.out.println("Vazn yek hame delkhah : " + Arrays.toString(heights));
        System.out.println(Arrays.toString(qwer));
        final double PI_NUMBER = 3.141592653589793223846 ;
        final double K = (10 ^ 20 ) / (4 * PI_NUMBER * 8.85) ;
        Scanner bar1Scanner = new Scanner(System.in);
        System.out.print(" Bar1 : (micro Colon) ");
        float bar1 = bar1Scanner.nextInt();
        Scanner bar2Scanner = new Scanner(System.in);
        System.out.print(" Bar2 : (micro Colon) ");
        float bar2 = bar2Scanner.nextInt();
        Scanner faseleScanner = new Scanner(System.in);
        System.out.print(" fasele : (centi metre)");
        float fasele = faseleScanner.nextInt();
        double niroo = (90 * bar1 * bar2) / ( fasele * fasele ) ;
        System.out.println("Niroo bein di bar : " + niroo + " Newton ");
        System.out.println(K);
        // ++ or --
        // -= or +=
        for ( float i = 16384f ; i >= 1 ; i /= 2f ){System.out.println(i);}
        // casting
        short x = 3 ;
        int q = 23 ;
        long w = 2004 ;
        q = (int) w + x ;
        Scanner keyboard = new Scanner(System.in) ;
        String inputAge = keyboard.next() ;
        int age = Integer.parseInt(inputAge) ;
        System.out.println(inputAge);
        System.out.println(age);
        String qw = "12345" ;
        int qwe = Integer.parseInt(qw) ;
    }
}
