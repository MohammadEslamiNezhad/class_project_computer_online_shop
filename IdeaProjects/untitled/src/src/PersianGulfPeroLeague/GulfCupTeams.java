package src.PersianGulfPeroLeague;
import java.util.*;

public class GulfCupTeams {
    public static void main(String[] args) {

        // ایجاد دیکشنری برای قرار دادن تیم ها در آن
        // و اختصاص دادن شماره ای به هر تیم برای مشخص شدن جایگاه تیم در جدول مسابقات
        Dictionary persianGulfCupTeamsAndNumbers = new Hashtable() ;

        HashMap <String,String>  persianGulfCupTeams = new HashMap<>() ;

        persianGulfCupTeams.put( "آلومینیوم اراک" , "شمس آذر قزوین" ) ;
        persianGulfCupTeams.put( "استقلال تهران" , "پرسپولیس تهران" ) ;
        persianGulfCupTeams.put( "تراکتور سازی تبریز" , "صنعت نفت آبادان" ) ;
        persianGulfCupTeams.put( "استقلال خوزستان" , "فولاد خوزستان" ) ;
        persianGulfCupTeams.put( "ملوان بندر انزلی" , "نساجی مازندران" ) ;
        persianGulfCupTeams.put( "گل گهر سیرجان" , "مس رفسنجان" ) ;
        persianGulfCupTeams.put( "سپاهان اصفهان" , "ذوب آهن اصفهان" ) ;
        persianGulfCupTeams.put( "پیکان تهران" , "هوادار تهران" ) ;
        System.out.println(persianGulfCupTeams);

        //تنها پیش شرطی که در قرعه کشی لیگ برتر اعمال می شود
        // این است که تیم های هم استانی در یک هفته به صورت همزمان میهمان یا میزبان نشوند
        //بر این اساس تیم ها بدین شکل گروه بندی می شوند و به هر گروه دو عدد اختصاص داده می شود
        // جفت عدد هایی که قرار است به تیم ها اختصاص داده شود عبارتند از :
        // (۱و۱۵) ، (۷و۲) ، (۳و۱۱) ، (۱۰و۴) ُ، (۱۴و۵) ، (۱۲و۶) ، (۹و۸) ، (۱۳و۱۶)

        // تیم های استان تهران
        /// ورزشگاه آزادی
        persianGulfCupTeamsAndNumbers.put( 1 , "استقلال تهران") ; // جفت اول
        persianGulfCupTeamsAndNumbers.put( 2 , "پرسپولیس تهران") ; // جفت اول

        // تیم های استان تهران
        // / سایر ورزشگاه ها
        persianGulfCupTeamsAndNumbers.put( 3 , "هوادار تهران") ; // جفت دوم
        persianGulfCupTeamsAndNumbers.put( 4 , "پیکان تهران") ; // جفت دوم

        //تیم های استان اصفهان
        persianGulfCupTeamsAndNumbers.put( 5 , "ذوب آهن اصفهان") ; // جفت سوم
        persianGulfCupTeamsAndNumbers.put( 6 , "سپاهان اصفهان") ; // جفت سوم

        // تیم های استان کرمان
        persianGulfCupTeamsAndNumbers.put( 7 , "مس رفسنجان") ; // جفت چهارم
        persianGulfCupTeamsAndNumbers.put( 8 , "گل گهر سیرجان") ; // جفت چهارم

        // تیم های استان مازندران
        persianGulfCupTeamsAndNumbers.put( 9 , "نساجی مازندران") ; // جفت پنجم
        persianGulfCupTeamsAndNumbers.put( 10 , "ملوان بندر انزلی") ; // جفت پنجم

        // تیم های استان خوزستان
        persianGulfCupTeamsAndNumbers.put( 11 , "فولاد خوزستان") ; // جفت ششم
        persianGulfCupTeamsAndNumbers.put( 12 , "استقلال خوزستان") ; // جفت ششم

        // عدد های باقی مانده به تیم های زیر می رسد
        persianGulfCupTeamsAndNumbers.put( 13 , "صنعت نفت آبادان") ; // اعداد باقی مانده

        // تیم های سایر استان ها
        persianGulfCupTeamsAndNumbers.put( 14 , "تراکتور سازی تبریز") ; // اعداد باقی مانده
        persianGulfCupTeamsAndNumbers.put( 15 , "شمس آذر قزوین") ; // اعداد باقی مانده
        persianGulfCupTeamsAndNumbers.put( 16 , "آلومینیوم اراک") ; // اعداد باقی مانده

        // چاپ لیست تیم‌ها
        System.out.println(" تیم‌های لیگ برتر جام خلیج فارس : ");
        System.out.println(persianGulfCupTeamsAndNumbers);
    }
}


