package myProjects;

import java.util.Scanner;

public class stringEdition {
    public static void main (String args []){
        System.out.println("----------------------------------------------------------------" +
"------------------------------------");
        System.out.println( " Hey there ! I'm a program to edit any strings . " ) ;

        String command ;
        String command2 ;
        String deletedSpacesFromString ;
        String changeLetter ;

        int repeat ;

        command = starProject.typeCommand();

        while (!command.equals("close")){

            command2 = typeCommand2() ;

            while ( ! command2.equals("back")) {

                switch (command2){

                    case ("count") :
                        repeat = count() ;
                        System.out.println(" This String " + repeat + " repeated . ");
                        System.out.println("------------------------------------------------" +
                                "---------------------------------------------------------");
                        break;

                    case ("del-spaces") :
                        deletedSpacesFromString = deleteSpaces() ;
                        System.out.println ( " Your string without any space is : "
                                + deletedSpacesFromString ) ;
                        break;

                    case ("change-let") :
                        changeLetter = changeLettersTogether() ;
                        System.out.println(" Your change letter of your string is : "
                                + changeLetter);
                        break;

                    case ("check-rep") :
                        checkAndSayRepeatedWords();
                        break;

                    case ("check-is-rev") :
                        isReverse();
                        break;

                    case ("find ext-size") :
                        findLargestAndSmallest();
                        break;

                    case ("change-var") :
                        changeStringVariablesTogether();
                        break;

                    default:
                        System.out.println("try again");
                }

                command2 = typeCommand2() ;
            }
            command = starProject.typeCommand();
        }
    }
    public static String typeCommand2 () {

        Scanner command2Scanner ;
        String command2 ;

        do {

            command2Scanner = new Scanner(System.in) ;
            System.out.println( " Welcome to the program ! " ) ;
            System.out.println( " Type commands2 to show my second commands . " ) ;
            System.out.print( " >>> " ) ;
            command2 = command2Scanner.nextLine().trim().toLowerCase() ;

            if (command2.equals("back")) {
                break;
            } else if (command2.equals("commands2")) {

                System.out.println( " There is my commands2 : \n " ) ;

                System.out.println( " count : type count to count a character in a string " +
                        "which you type for me also for character . \n " ) ;

                System.out.println( " del-spaces : This command " +
                        "delete spaces from your string but it can't delete tabs . \n " ) ;

                System.out.println( " change-let : change small" +
                        " and capital letter together . \n " );

                System.out.println( " check-rep : for check which " +
                        "word is repeated and how many . \n " );

                System.out.println( " check-is-rev: this command check if two string which " +
                        "you enter to program is reverse of them . " +
                        "It will say to you and also for is not reverse . \n " );

                System.out.println( " find ext-size : find largest and smallest words" +
                        " in the string which you type for me . \n " );

                System.out.println( " change-var : To change two variables " +
                        "together and show to you . \n " );

                System.out.println ( " back : for back to the first menu . " ) ;
                System.out.println("------------------------------------------" +
                        "---------------------------------------------------------");

            } else if (!(command2.equals("change-let") || command2.equals("del-spaces")
                    || command2.equals("check-rep") || command2.equals("count") ||
                    command2.equals("check-is-rev") || command2.equals("find ext-size")
            || command2.equals("change-var") ) ) {

                System.out.println(" Error ! please type command correctly . ");
                System.out.println("----------------------------------------------" +
                        "---------------------------------------------------------");

            } else {
                System.out.println("--------------------------------------------" +
                        "-------------------------------------------------------");
            }
        } while ( ! ( command2.equals ( "count" ) || command2.equals ( "del-spaces" )
                || command2.equals ( "change-let" ) || command2.equals ( "check-rep" )
                || command2.equals ( "check-is-rev" ) || command2.equals("find ext-size")
                || command2.equals("change-var") ) );
        return command2;
    }
    public static int count (){
        String userString ;
        String userStringCounter ;

        Scanner stringScanner = new Scanner(System.in);
        System.out.print(" Please give me your string do you need : ");
        userString = stringScanner.nextLine();

        char [] userStringCharArray = userString.toCharArray();

        Scanner characterScanner = new Scanner(System.in);
        System.out.print(" Please enter a char . I'll show you how many times " +
                "this character is repeated in the string .  ");
        userStringCounter = characterScanner.nextLine();

        int indexNumber ;
        int repeatCharacter = 0 ;

        while (userString.contains(userStringCounter)) {
            if (!userStringCounter.equals(" ")) {
                indexNumber = userString.indexOf(userStringCounter);
                userStringCharArray[indexNumber] = ' ';
                userString = new String(userStringCharArray);
            } else {
                indexNumber = userString.indexOf(userStringCounter);
                userStringCharArray[indexNumber] = '-';
                userString = new String(userStringCharArray);
            }
            repeatCharacter++;
        }

        return repeatCharacter ;
    }
    public static String deleteSpaces(){
        Scanner stringScanner = new Scanner(System.in ) ;
        System.out.print ( " Please enter an string . I'll show to you that string " +
                "without space : " ) ;
        String userString = stringScanner.nextLine() ;
        char [] arrayOfCharacterFromUserString = userString.toCharArray() ;
        StringBuilder stringWithoutSpaces = new StringBuilder();
        String stringI ;

        for (char i : arrayOfCharacterFromUserString) {
            stringI = String.valueOf(i) ;
            if ( ! ( stringI.equals ( " " ) ||
            stringI.equals ( "   " ) || stringI.equals ( "    " )
                    || stringI.equals ( "  " ) ) ) {
                stringWithoutSpaces.append(i);
            }
        }

        return stringWithoutSpaces.toString();
    }
    public static String changeLettersTogether() {
        System.out.print ( " Enter a string do you need . " +
                "I'll change capital letter and small letter with them : " ) ;
        Scanner stringScanner = new Scanner(System.in) ;
        String stringFromUser = stringScanner.nextLine() ;
        char[] userStringToCharacterArray = stringFromUser.toCharArray() ;
        String charToString ;
        StringBuilder newString = new StringBuilder() ;
        for (char i : userStringToCharacterArray) {
            charToString = String.valueOf(i) ;

            if (charToString.equals(charToString.toLowerCase()))
                charToString = charToString.toUpperCase() ;
            else
                charToString = charToString.toLowerCase() ;
            newString.append(charToString) ;
        }
        return String.valueOf(newString) ;
    }
    public static void checkAndSayRepeatedWords() {
        System.out.println(" Welcome to the check repeated words part ! ");
        System.out.println(" please enter a string . I'll show to you " +
                "what word is repeat in string and " +
                "also show to you how many repeated . ");

        Scanner stringScanner = new Scanner(System.in);
        System.out.print(" Please enter your string do you need : ");
        String userString = stringScanner.nextLine().trim() ;

        String [] userStringWords = userString.trim().split(" ") ;

        int repeatNumber ;
        boolean isCheckAgain ;
        boolean hasRepeatedWord = false ;
        for (int i = 0; i < userStringWords.length - 1  ; i++) {
            repeatNumber = 1 ;
            isCheckAgain = false ;
            for (int j = i + 1 ; j < userStringWords.length; j++) {
                for (int k = 0; k < i; k++) {
                    if (userStringWords[i].equals(userStringWords[k])){
                        isCheckAgain = true ;
                        break;
                    }
                }
                if ( i != j && userStringWords[i].
                        equals(userStringWords[j]) && !isCheckAgain){
                    repeatNumber ++ ;
                }
            }

            if ( repeatNumber > 1 ){
                System.out.println(userStringWords[i] + " : " + repeatNumber);
                hasRepeatedWord = true ;
            }

        }
        if (!hasRepeatedWord){
            System.out.println( " Your string hadn't any repeated word ! ");
        }
    }
    public static void isReverse(){
        System.out.println( " Welcome to the check reverse part ! " );
        System.out.println( " For this part you should type " +
                "two string for me and i check and"
         + " tell to you is two string which you type " +
                "for me is reverse of them or not . " );

        Scanner stringScanner = new Scanner(System.in) ;
        System.out.print( " Please enter the first string : " );
        String theFirstString = stringScanner.nextLine().trim().toLowerCase() ;

        stringScanner = new Scanner(System.in) ;
        System.out.print( " Please enter the second string : " );
        String theSecondScanner = stringScanner.nextLine().trim().toLowerCase() ;

        if (theFirstString.length() == theSecondScanner.length()){
            System.out.println( " The first and the second string " +
                    "isn't reverse of them . " );
        }else {
            StringBuilder reverseOfTheFirst = new StringBuilder() ;
            char [] characterArrayFromTheFirstString = theFirstString.toCharArray() ;

            for (int i = characterArrayFromTheFirstString.length - 1 ; i >= 0   ; i--) {
                reverseOfTheFirst.append(characterArrayFromTheFirstString[i]) ;
            }
            String reverseOfTheFirstString = String.valueOf(reverseOfTheFirst) ;
            if (reverseOfTheFirstString.equals(theSecondScanner)){
                System.out.println( " The first and the second string " +
                        "is reverse of them . " );
            }else {
                System.out.println( " The first and the second string " +
                        "isn't reverse of them . " );
            }
        }
    }
    public static void findLargestAndSmallest(){
        System.out.println( " Welcome to the find largest and smallest part . " );
        System.out.println( " You should type a string . " +
                "I'll show to you the largest and the smallest words to you . " );

        Scanner stringScanner = new Scanner(System.in) ;
        System.out.print( " Please type your string do you need : " ) ;
        String userString = stringScanner.nextLine().trim() ;

        String [] stringWordsArray = userString.split(" ") ;

        String theLargestWord = "" ;
        String theSmallestWord = userString ;

        for (String i : stringWordsArray) {
            theSmallestWord = (theSmallestWord.length() > i.length()) ? i : theSmallestWord;
            theLargestWord = (theLargestWord.length() < i.length()) ? i : theLargestWord ;

        }

        System.out.println ( " The largest word in your string is : " + theLargestWord );
        System.out.println( " The smallest word in your string is : " + theSmallestWord );
    }
    public static void changeStringVariablesTogether(){
        System.out.println( " Welcome to the change string variables together part :-) " );
        System.out.println( " You should enter two string to program . " +
                "I'll change strings together and show to you " );

        Scanner stringScanner = new Scanner(System.in) ;
        System.out.print( " please enter the first string : " );
        String theFirstStringVariable = stringScanner.nextLine().trim();

        stringScanner = new Scanner(System.in) ;
        System.out.print( " please enter the second string : " );
        String theSecondStringVariable = stringScanner.nextLine().trim();

        theSecondStringVariable += theFirstStringVariable ;
        theFirstStringVariable = theSecondStringVariable.substring
                ( 0 , theSecondStringVariable.length() - theFirstStringVariable.length()) ;

        theSecondStringVariable = theSecondStringVariable.substring
                ( theFirstStringVariable.length()
                , theSecondStringVariable.length() ) ;

        System.out.println( " The first var is : " + theFirstStringVariable) ;
        System.out.println( " The second var is : " + theSecondStringVariable) ;

    }
}