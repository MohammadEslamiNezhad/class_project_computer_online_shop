package myProjects;

import java.util.Scanner;

public class fibonachiDonbale {
    public static void main(String args[]){
        System.out.println(" سلام ، من برنامه ای هستم برای نوشتن جملات دنباله ی فیبوناچی .");

        Scanner numberScanner = new Scanner(System.in);
        Scanner orderScanner = new Scanner(System.in);

        long jomleGhabli ;
        long jomleBaadi ;
        String order ;
        int i ;

        do {
            System.out.println(" start : to start the program . ");
            System.out.println(" close : to close the program . ");
            System.out.print(" Type one of there orders : ");
            order = orderScanner.nextLine();
            System.out.println("-------------------------------------------------------------------");

        }while (!(order.equals("close") || order.equals("start"))) ;

        while (!order.equals("close")){

            System.out.print(" تا عدد چندم رو بهت نشون بدم ؟ ");
            int numberOfDonbale = numberScanner.nextInt();

            jomleGhabli = 0 ;
            jomleBaadi = 1 ;

            for (i = 1 ; i <= numberOfDonbale ; i++) {

                switch (i){
                    case 1 :
                        System.out.println(" جمله 1 : 0 ");
                        break;

                    case 2 :
                        System.out.println(" جمله 2 : 1 ");
                        break;

                    default:
                        jomleBaadi += jomleGhabli ;
                        jomleGhabli = jomleBaadi - jomleGhabli ;
                        System.out.println( " جمله " + i + " : " + jomleBaadi + " " );
                }
            }

            System.out.println("-------------------------------------------------------------------");

            do {

                System.out.println(" start : to start the program . ");
                System.out.println(" close : to close the program . ");
                System.out.print(" Type one of there orders : ");
                order = orderScanner.nextLine();

            }while (!(order.equals("close") || order.equals("start"))) ;

            System.out.println("-------------------------------------------------------------------");
        }
    }
}
