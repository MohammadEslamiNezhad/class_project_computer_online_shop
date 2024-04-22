package myProjects;

import java.util.Arrays;

public class editingAndCheckingArrayProject {
    public static void main(String args[]){
        System.out.println( " Hey there I'm a program to copy and reverse any array . " );
        // P1A
        int [] arrayOfNumbers1 = { 1 , 2 , 3 , 4 , 5 } ;
        int [] arrayOfNumbers2 = new int[5] ;

        System.arraycopy(arrayOfNumbers1, 0, arrayOfNumbers2, 0,
                arrayOfNumbers1.length );
        /* this code copy an array to another array ; input the first array , the second array
        and length of array which we need to creat from the first array */

        System.out.println( " This is a main array : " + Arrays.toString(arrayOfNumbers1));
        System.out.println( " copy of main array : " + Arrays.toString(arrayOfNumbers2));

        // P1B
        int [] arrayOfNumbers3 = new int [5] ;
        for (int i = 0; i < arrayOfNumbers1.length ; i++) {
            arrayOfNumbers3[i] = arrayOfNumbers1[arrayOfNumbers1.length - 1 - i ];
        }
        System.out.println(" revers of main array : " + Arrays.toString(arrayOfNumbers3));

        // P2
        long sumOfNumbersInArray3 = 0 ;
        long sumOfNumbersInArray4 = 0 ;
        int [] arrayOfNumbers4 = { 9812 , 34 ,  42 , 56 ,10111 , 21 , 956 , 433 , 21 , 567 , 10011 } ;

        // and this is a for each loop in python we write this loop like it : for j in arrayOfNumbers4
        for (int j : arrayOfNumbers4) {
            sumOfNumbersInArray4 += j;
        }

        for ( int k : arrayOfNumbers3){
            sumOfNumbersInArray3 += k ;
        }
        System.out.println( " array of numbers 4 = " + Arrays.toString(arrayOfNumbers4));
        System.out.println( " the sum of numbers in array 4 = " + sumOfNumbersInArray4);

        System.out.println( " array of numbers 3 = " + Arrays.toString(arrayOfNumbers3));
        System.out.println( " the sum of numbers in array 3 = " + sumOfNumbersInArray3);

        // P3
        int theBiggestNumber = 0 ;
        for ( int i : arrayOfNumbers4){
            theBiggestNumber = Math.max(theBiggestNumber , i) ;
        }
        System.out.println( " The largest number in array 4 = " + theBiggestNumber);

        // P4
        int [] arrayOfNumbers5 = { 1 , 45 , 6456 , 65 , 348 , 545 , 41 , 46 } ;
        int fardNumber = 0 ;
        int zojeNumber = 0 ;
        for ( int i : arrayOfNumbers5){
            if ( i % 2 == 0){
                zojeNumber ++ ;
            }else {
                fardNumber ++ ;
            }
        }

        int [] zojeNumbersInArray5 = new int[zojeNumber--] ;
        int [] fardNumbersInArray5 = new int[fardNumber--] ;

        for ( int i : arrayOfNumbers5){
            if ( i % 2 == 0){
                zojeNumbersInArray5 [ zojeNumber ] = i ;
                zojeNumber -- ;
            }else {
                fardNumbersInArray5 [ fardNumber ] = i ;
                fardNumber -- ;
            }
        }
        System.out.println(Arrays.toString(fardNumbersInArray5));
        System.out.println(Arrays.toString(zojeNumbersInArray5));

        // P5
        System.out.println(" اعضای زوج آرایه ی ۱ : ");
        for ( int i = 0 ; i < arrayOfNumbers1.length ; i += 2 ){
            System.out.println(arrayOfNumbers1[i]);
        }

        // P6
        int temp ;
        for (int i = 0; i < arrayOfNumbers4.length - 1 ; i++) {
            for (int j = i; j < arrayOfNumbers4.length; j++) {
                temp = arrayOfNumbers4[i];
                arrayOfNumbers4[i] = Math.max(arrayOfNumbers4[i], arrayOfNumbers4[j]);
                arrayOfNumbers4[j] = Math.min(temp, arrayOfNumbers4[j]);

            }
        }
        System.out.println(Arrays.toString(arrayOfNumbers4));

        // P7

        int []array = { 1 , 23 , 423 ,2 ,5345646 ,54 ,
                1,24 , 35 ,345 , 3, 2321,1,2,3,1,3,1, 3,4 ,5,3,4,2,4,2,4,5,6,4,2,5,6,3,1,4,5};
        int [] array2 = new int [array.length];
        int p = 0 ;
        for ( int i = 0 ; i < array.length -1 ; i++){
            for ( int j = i + 1 ; j < array.length ; j++){
                if ( array[i] == array[j] ) {
                    array2[p++]= array[i] ;
                    break;
                }
            }
        }
        int [] tempArray = new int [array.length] ;
        int k = 0 ;
        for ( int i = 0 ; i < array.length - 1 ; i++){
            for ( int j = 1 ; j < array.length ; j++){
                if ( array[i] == array[j] ){
                    for ( int l = 0 ; l < tempArray.length -1 ; l++) {
                        if (tempArray[l] == array[i]){
                            break;
                        } else if (l == tempArray.length - 2 ) {
                            tempArray[k++] = array[i];
                            break;
                        }
                    }
                }
            }
        }
        int tekrari = 0 ;
        System.out.println( " array 2 = " + Arrays.toString(array2));

        for (int i = 0; array2[i] != 0 ; i++) {
            tekrari ++ ;
        }
        int [] array3 = new int[tekrari] ;
        int q = 0 ;
        boolean tekrarShodeh = true ;
        for (int i = 0; i < array3.length - 1 ; i++) {
            for (int j = i; j < array3.length ; j++) {
                tekrari += (array2[i] == array2[j]) ? 1 : 0 ;
                if (array2[i] == array2[j]){
                    for (int l = 0 ; l < array3.length && array3[l] == 0  ; l++) {
                        if (array3[l] == array2[i]){
                            tekrarShodeh = true ;
                            break;
                        }else {
                            tekrarShodeh = false ;
                        }
                    }
                    if (!(tekrarShodeh)){
                        System.out.println(array2[i]);
                        array3[q++] = array2[i] ;
                        break;
                    }
                }
            }
        }
        System.out.println( " array 3 = " + Arrays.toString(array3));

        int teadad = 0 ;
        while ( tempArray[teadad] != 0  ){
            teadad ++ ;
        }
        int [] newArray = new int [teadad] ;
        System.arraycopy(tempArray, 0, newArray, 0, teadad);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));

    }
}
