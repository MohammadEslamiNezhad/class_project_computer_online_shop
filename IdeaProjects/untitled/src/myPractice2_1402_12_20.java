public class myPractice2_1402_12_20 {
    public static void main(String Args[]){
        String text = "  Hello Imamreza Students,Hello  " ;
        print(text.charAt(15));
        print(text.charAt(10));
        print(text.charAt(12));
        print(text.charAt(0));
        print(text.charAt(1));
        print(text.charAt(25));
        print(text.replace(' ' , '_'));
        print(text.replace('s' , 't'));
        print(text.replace('I','m'));
        print(text.replaceAll("Students" , "teachers"));
        print(text.replaceAll("re" , "Re")) ;
        print(text.substring(12,25));
        String qwer = text.substring(0,20) ;
        print(qwer);
        print("kjhgsdksfdhvf;oaifhj;dosiafuhdsncvsaghailfhe eufawgifduh vkuf;sd.ajks;vguidwh".toUpperCase());
        print("KJHGSDKSFDHVF;OAIFHJ;DOSIAFUHDSNCVSAGHAILFHE EUFAWGIFDUH VKUF;SD.AJKS;VGUIDWH".toLowerCase());
        print(text.toLowerCase()) ;
        print(text.toUpperCase());
        print(text.trim());
        System.out.println(text.contains("Imam") );
        System.out.println(text.equals("QWER"));
        print(text.indexOf("Hello"));
        print(text.lastIndexOf("Hello"));
        System.out.println(text.isEmpty());
        System.out.println("".isEmpty());
        print(text.length());

    }
    public static void print(String text){
        System.out.println(text);
    }
    /*public static void print(float number ) {
        System.out.println(number);
    }*/
    public static void print(char character ){
        System.out.println(character);
    }
    public static void print(int number){
        System.out.println(number);
    }
}
