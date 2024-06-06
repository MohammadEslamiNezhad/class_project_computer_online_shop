package practices.ComputerPartOnlineShop.OnlineShopUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import practices.ComputerPartOnlineShop.interfaces.OnlineShopCallBackMainMenu;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class OnlineShopInputOutputManager {
    public static Scanner stringScanner = new Scanner(System.in);
    public static Scanner numberScanner = new Scanner(System.in);
    private static void showWelcomeMessage(String welcomePart){
        System.out.println(" Welcome to " + welcomePart + " menu ! ");
    }
    private static void showEnterNumberMessage(){
        System.out.print(" Please enter number of option which you choose it :");
    }
    public static void showMainMenuOptions(){
        showWelcomeMessage("computer online shop ");
        System.out.println(" /---------------------------------------/");
        System.out.println(" 1. Search computer parts .");

        System.out.println(" 0. Exit ");
        showEnterNumberMessage();
    } // This method show main menu options .
    public static void runProgramOptions(int option, OnlineShopCallBackMainMenu callBack){
        switch (option){
            case 1 :
                callBack.onSearchMenuCallBack();
                break;
            case 0 :
                break;
            default:
                showWrongNumberError();
        }
    } // When a user enter true number this method call a another method which user want .
    private static void showWrongNumberError(){
        System.out.println(" !! Error !! Please enter number correctly !! ");
    } // This method just for show error to a user who enter wrong number to any menu .
    public static void onWhatMenu(String menu){
        System.out.println(" You are on " + menu + " menu . ");
    } // In this I want to show to user what menu he's on this .
    public static void showSearchMenuOptions(){
        showWelcomeMessage("search computer parts ");
        System.out.println(" 1. computer part type . ");
        System.out.println(" 0. Exit ");
        showEnterNumberMessage();
    }
    public static void onSearchMenuOptions(int option){
        switch (option){
            case 1 :
                showWelcomeMessage("search computer part by type ");
                showComputerPartsForSearch();
                int searchOption = numberScanner.nextInt() ;
                showComputerParts(searchOption);
                break;

            case 0 :
                break;

            default:
                showWrongNumberError();
        }
    }
    public static void showComputerPartsForSearch(){
        System.out.println(" 1. CPU ");
        System.out.println(" 2. RAM ");
        System.out.println(" 3. Power ");
        System.out.println(" 4. MainBoard ");
        System.out.println(" 5. Storage (like SSD and HDD) ");
        System.out.println(" 6. Display ");
        System.out.println(" 7. Mouse ");
        System.out.println(" 8. Keyboard ");
        System.out.println(" 9. GPU ");
        System.out.println(" 0. Exit ");
    }

    public static void printJsonFile(String filePath) {
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONArray jsonArray = new JSONArray(jsonString);
            System.out.println(jsonArray.toString(4)); // print the JSON with indentation
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    public static void showComputerParts(int option)  {
        switch (option){

            case 1 :
                printJsonFile("C:\\Users\\Mohammad\\IdeaProjects\\untitled\\src\\ComputerOnlineShopProject\\ComputerPartOnlineShop\\JSON files\\CPUsDataBase.json");
                break;
            case 2 :
                printJsonFile("C:\\Users\\Mohammad\\IdeaProjects\\untitled\\src\\ComputerOnlineShopProject\\ComputerPartOnlineShop\\JSON files\\RAMsDataBase.json");
                break;

            case 3 :
                printJsonFile("C:\\Users\\Mohammad\\IdeaProjects\\untitled\\src\\ComputerOnlineShopProject\\ComputerPartOnlineShop\\JSON files\\PowersDataBase.json");
                break;

            case 4 :
                printJsonFile("C:\\Users\\Mohammad\\IdeaProjects\\untitled\\src\\ComputerOnlineShopProject\\ComputerPartOnlineShop\\JSON files\\MainBoardsDataBase.json");
                break;

            case 5 :
                printJsonFile("C:\\Users\\Mohammad\\IdeaProjects\\untitled\\src\\ComputerOnlineShopProject\\ComputerPartOnlineShop\\JSON files\\ssdsDataBase.json");
                printJsonFile("C:\\Users\\Mohammad\\IdeaProjects\\untitled\\src\\ComputerOnlineShopProject\\ComputerPartOnlineShop\\JSON files\\hddsDataBase.json");
                break;

            case 6 :
                printJsonFile("C:\\Users\\Mohammad\\IdeaProjects\\untitled\\src\\ComputerOnlineShopProject\\ComputerPartOnlineShop\\JSON files\\DisplaysDataBase.json");
                break;

            case 7 :
                printJsonFile("C:\\Users\\Mohammad\\IdeaProjects\\untitled\\src\\ComputerOnlineShopProject\\ComputerPartOnlineShop\\JSON files\\miceDataBase.json");
                break;

            case 8 :
                printJsonFile("C:\\Users\\Mohammad\\IdeaProjects\\untitled\\src\\ComputerOnlineShopProject\\ComputerPartOnlineShop\\JSON files\\keyboardsDataBase.json");
                break;

            case 9 :
                printJsonFile("C:\\Users\\Mohammad\\IdeaProjects\\untitled\\src\\ComputerOnlineShopProject\\ComputerPartOnlineShop\\JSON files\\GPUsDataBase.json");
                break;

            case 0 :
                break;

        }
    }
    public static void creatDataBase(String dataBaseName){
        try{
            File projectDataBase = new File(dataBaseName);
            if (projectDataBase.createNewFile()){
//                System.out.println(" File " + projectDataBase.getName() + " created ! ");
            }else {
//                System.out.println(" File already exists . ");
            }
        }catch (IOException ioException){
            System.out.println( " An error occurred . ");
            ioException.printStackTrace();
        }
    }

    public static void writeFile(JSONObject computerPartJsonObject , JSONArray computerPartArray , String dataBaseFileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(dataBaseFileName))) {
            String line;
            StringBuilder jsonContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            if (!jsonContent.isEmpty()) {
                computerPartArray = new JSONArray(jsonContent.toString());
            } else {
                computerPartArray = new JSONArray();
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            computerPartArray = new JSONArray();
        }

        computerPartArray.put(computerPartJsonObject);

        try (FileWriter file = new FileWriter(dataBaseFileName)) {
            file.write(computerPartArray.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int checkNumberInList(ArrayList list , String message){
        int number;
        do {
            System.out.print(" Please enter " + message + " number : ");
            number = numberScanner.nextInt();
            if (!list.contains(number)){
                System.out.println(" !! Error !! Please try again ! ");
            }
        }while(!list.contains(number));
        return list.indexOf(number);
    }

    public static int checkNumberInRange(int firstNumber , int finishedNumber ,
                                         String message , ArrayList dataBase){
        int checkNumber;
        do{
            showDataBase(dataBase) ;
            System.out.println(" Choose " + message + " and enter its number ") ;
            System.out.print(" >>> ");
            checkNumber = numberScanner.nextInt();
            if (firstNumber > checkNumber || finishedNumber < checkNumber){
                System.out.println(" !! Error !! Please try again ! ");
            }else {break;}

        }while (true);
        return checkNumber - 1 ;
    }

    public static void showDataBase(ArrayList dataBase ){
        for (int i = 0 ; i < dataBase.size() ; i ++ ){
            System.out.println(" " + (i + 1) + ". " + dataBase.get(i));
        }
    }
    public static int checkNumberInRange(int firstNumber , int finishedNumber , String message){
        int checkNumber;
        do{
            System.out.print(" Please enter " + message + " of your system : ") ;
            checkNumber = new Scanner(System.in).nextInt();
            if (firstNumber > checkNumber || finishedNumber < checkNumber){
                System.out.println(" !! Error !! Please try again ! ");
            }else {break;}

        }while (true);
        return checkNumber ;
    }

}
