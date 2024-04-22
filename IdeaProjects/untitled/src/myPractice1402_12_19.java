/* مثل روشن کردن یک دریل از کاربر در جاوا ورودی بگیر
اول دریل رو از بین ابزار هات بردار
دوم باتری دریل رو جا بزن یا سیمش رو وصل کن
سوم محل استفاده رو علامت بزن ( مشخص کن )
 چهارم مته ی مخصوص دریل رو از بین مته هات بردار
پنجم از دریل استفاده کن
ششم در صورت لزوم نتیجه اش رو ببین
 */
// مرحله ی اول : برداشتن دریل
import java.util.Scanner ;  /* import Java Scanner class */

public class myPractice1402_12_19 {
    public static void main (String[] args) {
        // مرحله ی دوم جازدن باتری یا وصل کردن سیم
        Scanner inputScannerName = new Scanner(System.in) ; //creat a Scanner object
        // مرحله ی سوم علامت زدن محل سوراخکاری
        System.out.print(" What is your name ? ");
        // مرحله ی چهارم و پمجم انتخاب مته ی مناسب کار و استفاده از دریل
        String inputStringName = inputScannerName.nextLine() ; // Read user input
        // مرحله ی ششم و آخر : مشاهده ی خروجی
        System.out.println(" nice to meet you ! " + inputStringName); // Output user input

        Scanner inputScannerAge = new Scanner(System.in) ;
        System.out.print(inputStringName + " How old are You ? ");
        int inputIntegerAge = inputScannerAge.nextInt() ;
        System.out.println(inputIntegerAge);

        Scanner inputJob = new Scanner(System.in) ;
        System.out.print(" What is your Job ?");
        String job = inputJob.nextLine() ;
        if(job.equals("programmer") || job.equals("Programmer")) {
            System.out.println("Nice to meet you !");
        }
        else {
            System.out.println(job + " Ok . I'm programmer ! ");
        }
        Scanner qwer = new Scanner(System.in) ;
        System.out.print("qwerrtttwqdrsdc ????? ");
        String qwerrewq = qwer.nextLine() ;
        System.out.println(qwerrewq + " Jaleb bood ! ");
    }
}
