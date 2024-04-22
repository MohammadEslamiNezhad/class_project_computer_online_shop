/*
A program to guess number game
Algorithm :
۱ - ساخت عدد تصادفی
۲ - تجزیه ی عدد به ارقام
۳ - ورودی گرفتن عدد
۴ - رد کردن عدد های خارج از محدوده
۵ - بررسی اعداد داخل محدوده :
۶ - تجزیه عدد ورودی به ارقام
۷ - صحت عدد = برد بازی = اتمام بازی !
۸ - عدم صحت عدد : بررسی ارقام و عدد نسبت به عدد صحیح
۹ - ورودی گرفتن مجدد
۱۰ - بررسی مجدد تا ۳ بار
۱۱ - تعیین برد یا باخت و نشان دادن نتیجه
 */
package myProjects;
import java.util.Random; //for creat random number
import java.util.Scanner; // for input from user
public class guessNumberProjects {
    public static void main(String Args[]) {
        Random creatRandomNumber = new Random(); // creat random object
        int randomNumber = creatRandomNumber.nextInt(1000) ; // creat random number
        /*
        مراحل بدست آوردن ارقام به صورت حلقه ای
        ۱ - بدست آوردن یکان
        ۲ - کم کردن از عدد اصلی
        ۳ - تقسیم حاصل بر ۱۰
        ۴ - بدست آوردن یکان
         */
        int trueYekan = randomNumber % 10 ;
        int trueDahgan = ((randomNumber - trueYekan ) / 10 ) % 10 ;
        int trueSadgan = ((((randomNumber - trueYekan) / 10 ) - trueDahgan ) / 10 ) % 10 ;
        for (int heart = 3; heart > 0; heart--) {
            Scanner scannerNumbers = new Scanner(System.in); // creat scanner object
            print("Guess number in range (0,1000) : ") ; // send input message to user
            int inputNumber = scannerNumbers.nextInt(); // input number fromm user
            while (inputNumber > 1000 || inputNumber < 0 ){ // Error wrong numbers
                println("Your number isn't in range ! try again .") ;
                scannerNumbers = new Scanner(System.in);
                print("Guess number in range (0,1000) : ");
                inputNumber = scannerNumbers.nextInt();
            }
            /*
            مراحل بدست آوردن ارقام به صورت حلقه ای
            ۱ - بدست آوردن یکان
            ۲ - کم کردن از عدد اصلی
            ۳ - تقسیم حاصل بر ۱۰
            ۴ - بدست آوردن یکان
            */
            int inputYekan = inputNumber % 10 ;
            int inputDahgan = ((inputNumber - inputYekan ) / 10 ) % 10 ;
            int inputSadgan = ((((inputNumber - inputYekan) / 10 ) - inputDahgan ) / 10 ) % 10 ;
            if (inputNumber == randomNumber) {
                println("You won !");
                break;
            }
            else {
                println("your wrong ! try again .");
                if (inputNumber > randomNumber){
                    println("My number is more Smaller .");
                    if ( inputSadgan > trueSadgan) {
                        println("My sadgan is more smaller . ");
                        if (inputDahgan > trueDahgan) {
                            println("My dahgan is more smaller .");
                            if (inputYekan > trueYekan) {
                                println("My yekan is more Smaller .");
                            } else if (inputYekan < trueYekan) {
                                println("My yekan is more bigger .");
                            } else {println("Yekan is true ! ");}
                        }else if (inputDahgan < trueDahgan) {
                            println("My dahgan is more bigger .");
                            if (inputYekan > trueYekan) {
                                println("My yekan is more Smaller .");
                            } else if (inputYekan < trueYekan) {
                                println("My yekan is more bigger .");
                            }else {println("Yekan is true ! ");}
                        }else {
                            println("Dahgan is true ! ");
                            if (inputYekan > trueYekan) {
                                println("My yekan is more Smaller .");
                            } else if (inputYekan < trueYekan) {
                                println("My yekan is more bigger .");
                            }else {println("Yekan is true ! ");}
                        }
                    } else {
                        println("Sadgan is true ! ");
                        if (inputDahgan > trueDahgan) {
                            println("My dahgan is more smaller .");
                            if (inputYekan > trueYekan) {
                                println("My yekan is more Smaller .");
                            } else if (inputYekan < trueYekan) {
                                println("My yekan is more bigger .");
                                }else {println("Yekan is true !") ;}
                            } else if (inputDahgan < trueDahgan) {
                                println("My dahgan is more smaller .");
                                if (inputYekan > trueYekan) {
                                    println("My yekan is more Smaller .");
                                } else if (inputYekan < trueYekan) {
                                    println("My yekan is more bigger .");
                                }else {println("Yekan is true ! ");}
                            }else {
                            println("Dahgan is true !");
                            if (inputYekan > trueYekan) {
                                println("My yekan is more Smaller .");
                            }else {
                                println("My yekan is more bigger .");
                            }
                        }
                    }
                } else {
                    println("My number is more bigger .");
                    if ( inputSadgan < trueSadgan ) {
                        println("My Sadgan is more bigger . ");
                        if (inputDahgan < trueDahgan) {
                                println("My dahgan is more bigger .");
                                if (inputYekan > trueYekan) {
                                    println("My yekan is more Smaller .");
                                } else if (inputYekan < trueYekan) {
                                    println("My yekan is more bigger .");
                                } else {
                                    println("Yekan is true ! ");
                                }
                            } else if (inputDahgan > trueDahgan) {
                                println("My dahgan is more smaller .");
                                if (inputYekan > trueYekan) {
                                    println("My yekan is more Smaller .");
                                } else if (inputYekan < trueYekan) {
                                    println("My yekan is more bigger .");
                                } else {
                                    println("Yekan is true ! ");
                                }
                            } else {
                                println("Dahan is true ! ");
                                if (inputYekan > trueYekan) {
                                    println("My yekan is more Smaller .");
                                } else {
                                    println("My yekan is more bigger .");
                                }
                            }
                        }else {
                        println("Sadgan is true ! ");
                        if (inputDahgan < trueDahgan) {
                            println("My dahgan is more bigger .");
                            if (inputYekan > trueYekan) {
                                println("My yekan is more Smaller .");
                            } else if (inputYekan < trueYekan) {
                                println("My yekan is more bigger .");
                            } else {println("Yekan is true ! ");}
                        } else if (inputDahgan > trueDahgan) {
                            println("My number is more smaller .");
                            if (inputYekan > trueYekan) {
                                println("My yekan is more Smaller .");
                            } else if (inputYekan < trueYekan) {
                                println("My yekan is more bigger .");
                            } else {println("Yekan is true ! ");}
                        } else {
                            println("Dahan is true ! ");
                            if (inputYekan > trueYekan) {
                                println("My yekan is more Smaller .");
                            } else {println("My yekan is more bigger .");}
                        }
                    }
                }
            }
        }
        print("My number = ");
        println(randomNumber);
        }
    public static void println(String text) {System.out.println(text);}
    public static void print(String text) {System.out.print(text);}
    public static void println(int number){System.out.println(number);}
}