import java.util.Scanner ;
public class myPractice1402_12_20 {
    public static void main(String Args[]){
        for ( int i = 3 ; i > 0 ; i--){
            System.out.println(i);
        }
        output(" Hey there ! \n I'm ROBO ! \n let's talk together ! ");
        output(" Type one of this options to talk with me ! ");
        String option1 = "Ok. Let's go !" ;
        String option2 = "Nice to meet you ROBO! but I don't like feel talking" ;
        output(option1);
        output(option2);
        Scanner scannerUserTalks1 = new Scanner(System.in) ;
        String userTalks1 = scannerUserTalks1.nextLine() ;
        if (userTalks1.equals(option2)) {
            output("Ok. Speak after :-( ");
        }
        else if (userTalks1.equals(option1)){
            output("Ok. what is your name ? ");
            Scanner scannerUserTalks2 = new Scanner(System.in) ;
            String userTalks2 = scannerUserTalks2.nextLine() ;
            output("Nice to meet You " + userTalks2);
            output(" And what is your job ? ");
            Scanner scannerUserTalks3 = new Scanner(System.in) ;
            String userTalks3 = scannerUserTalks3.nextLine() ;
            if (userTalks3.contentEquals("programming") || userTalks3.contentEquals("programming") || userTalks3.contentEquals("I am a programmer")) {
                output("OoOoOoOoOh Nice ! I'm a nerd of computer like you ! ");
                output("What's your favorite programing language ? ");
                Scanner scannerUserTalks4 = new Scanner(System.in) ;
                String userTalks4 = scannerUserTalks4.nextLine() ;
                if (userTalks4.contentEquals("Python") || userTalks4.contentEquals("python") ) {
                    output(" BravOoOoOoOoOOOOOOOOOOOOOooOooo :))) ");
                }
                else {
                    Scanner scannerUserTalks5 = new Scanner(System.in) ;
                    output("Ok ! Guess my favorite programing langauge :");
                    String userTalks5 = scannerUserTalks5.nextLine() ;
                    while (!userTalks5.equals("python") && !userTalks5.equals("Python")){
                        scannerUserTalks5 = new Scanner(System.in) ;
                        output("Ok ! Guess my favorite programing language : ");
                        userTalks5 = scannerUserTalks5.nextLine() ;
                    }
                }
            }
        }
    }
    public static void output(String text){
        System.out.println(text);
    }
}
