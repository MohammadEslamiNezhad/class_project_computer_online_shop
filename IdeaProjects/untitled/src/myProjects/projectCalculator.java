package myProjects;

import java.util.Arrays;
import java.util.Scanner;

public class projectCalculator {
    public static void main (String args[]){
        // + -

        Scanner inputOrder = new Scanner(System.in) ;
        System.out.println(" Hi ! \n This is a command calculator ! ");

        String order = "                                                                             " +
                "                                                                                    " +
                "                                                                                    " +
                "                                                                                    " +
                "                                                                                    " +
                "                                                                                    " +
                "                                                                                    " +
                "                                                                                    " +
                "                                                                                    " +
                "                                                                                    " +
                "                                                                                    " +
                "                                                                                    " +
                "                                                                                    " ;

        while (!(order.equals("close"))){
            System.out.print("calculator mode is on" +
                    " ( type 'close' to close program ): ") ;

            char [] arrayOfInputOrder = new char[order.length()] ;

            order = inputOrder.nextLine().trim() ;

            Character [] arrayOfValidChars = { '0' , '1' , '2' , '3' , '4' , '5'
                    , '6' , '7' , '8' , '9' , '+' , '-' };

            Character [] arrayOfNumbers =  { '0' , '1' , '2' , '3' , '4' , '5'
                    , '6' , '7' , '8' , '9' } ;

            int ragham = order.length() - 1  ;

            double thePowerOf10 = order.length() - 1 ;
            double number = 0.0 ;

            int k = 0 ;
            double[] numbersFromUser = { 0 , 0 , 0 , 0 , 0 } ;
            for (int i = 0 ; i <= ragham ; i++ ){
                if ( !(Arrays.asList(arrayOfNumbers).contains(order.charAt(i))) || thePowerOf10 == 0 )  {
                    System.out.println("Hi");
                    numbersFromUser[k] = number ;
                    number = 0 ;
                    thePowerOf10 = 0 ;
                    k++ ;
                    continue ;
                }
                arrayOfInputOrder[i] = order.charAt(i);
                double stepOfLoop = (Character.getNumericValue
                        (arrayOfInputOrder[i])) * (Math.pow(10.0, thePowerOf10));
                number += stepOfLoop;
                thePowerOf10 -- ;
                System.out.println(number);
            }
            System.out.println(Arrays.toString(numbersFromUser));

//            while (ragham >= 0) {
//                while (notInRangeTheNumberOfChars) {
//                    System.out.println("Error ! you can't type upper the 8 character ! " +
//                            " And you can't type a blank order ! ");
//                    System.out.print("please try again :");
//
//                    order = inputOrder.nextLine().trim() ;
//                    ragham = order.length() - 1 ;
//                    thePowerOf10 = 0.0 ;
//                    notInRangeTheNumberOfChars = order.length() > 8 || order.isBlank() ;
//                }
//                arrayOfInputOrder[ragham] = order.charAt(ragham);
//                if (arrayOfInputOrder[0] == '-' && ragham == 0) {
//                    number = (-1) * number;
//                    break;
//                } else if (arrayOfInputOrder[0] == '+' && ragham == 0) {break;}
//
//                /* getNumericValue is a method for change data type
//                of chars in arrayOfInputOrder to number */
//                double stepOfLoop = (Character.getNumericValue
//                        (arrayOfInputOrder[ragham])) * (Math.pow(10.0, thePowerOf10));
//                number += stepOfLoop;
//                while ( !(Arrays.asList(arrayOfValidChars).contains(order.charAt(ragham))
//                        || order.contains("close") ) ){
//                    System.out.print("Error ! \n invalid character . \n please try again : ");
//                    order = inputOrder.nextLine().trim() ;
//                    ragham = order.length() - 1 ;
//                    thePowerOf10 = 0.0 ;
//                }
//                ++thePowerOf10;
//                --ragham;
//            }
            if (order.contains("close")) {System.out.println("Bye :( ");}
            else {
                ragham = order.length() - 1 ;

                //در دستور من کارآکتری وجود داشته باشد که مجاز نیست .
                // in array class , in arrayOfValidChars , contain character 0 of mathematical order .

//                while ( !(Arrays.asList(arrayOfValidChars).contains(order.charAt(ragham))
//                        || order.contains("close") ) ){
//                    ragham ++ ;
//                    System.out.print("Error ! \n invalid character . \n please try again : ") ;
//                    order = inputOrder.nextLine().trim() ;
//                }
            }

            System.out.println(number) ;
        }
    }
}
