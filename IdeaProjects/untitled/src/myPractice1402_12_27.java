import java.awt.*;

public class myPractice1402_12_27 {
    public static void main(String[] args){
        Point point1 = new Point(10,2) ;
        Point point2 = new Point(12,13) ;
        // int float double long short
        int q = 2147483647 ;
        short w = 32767 ;
        long e = 2147483647 ;
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        String fullName = "Abbas Bouazar" ;
        System.out.println(fullName);
        System.out.println("point1 = " + point1);
        System.out.println("point2 = " + point2);
        String fullName1 = "Ali Hoseinpour" ;
        System.out.println(fullName1);
        boolean qwer = fullName1.startsWith("q");
        System.out.println(qwer);
        System.out.println(fullName1.contains("A"));
        System.out.println(fullName1.length());
        String firstName2 = "Hassan" ;
        System.out.println(firstName2);
        System.out.println(firstName2.length());
        System.out.println(firstName2.contains("s"));
        System.out.println(firstName2.toUpperCase());
        System.out.println(firstName2.charAt(5));
        System.out.println(firstName2.isEmpty());
        System.out.println(firstName2.isBlank());
        System.out.println(firstName2.trim());
    }
}