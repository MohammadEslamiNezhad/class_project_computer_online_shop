package myProjects;

import java.time.Clock;
import java.util.Scanner;

public class taiinSalKabise {
    public static void main (String Args[] ){
        System.out.println(" برنامه ای برای تعیین سال کبیسه ");
        System.out.println(" سال مدنظرت رو وارد کن : ");
        Scanner scanYear = new Scanner(System.in) ;
        int year = scanYear.nextInt() ;
        int baghimande = year % 4;
        if (baghimande == 3) System.out.println(" سال کبیسه است .");
        else System.out.println(" سال کبیسه نیست . ");


    }
}
