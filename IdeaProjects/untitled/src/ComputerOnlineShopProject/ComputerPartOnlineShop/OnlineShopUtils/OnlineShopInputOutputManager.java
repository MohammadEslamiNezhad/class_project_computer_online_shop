package practices.ComputerPartOnlineShop.OnlineShopUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import practices.ComputerPartOnlineShop.interfaces.OnlineShopCallBacksOdMainMenu;

import java.io.*;

public class OnlineShopInputOutputManager {
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
        System.out.println(" 2. Buy computer parts . ");
        System.out.println(" 3. Sell computer parts . ");

        System.out.println(" 0. Exit ");
        showEnterNumberMessage();
    } // This method show main menu options .
    public static void runProgramOptions(int option, OnlineShopCallBacksOdMainMenu callBack){
        switch (option){
            case 1 :
                callBack.onSearchMenuCallBack();
                break;
            case 2 :
                callBack.onBuyMenuCallBack();
                break;
            case 3 :
                callBack.onSellMenuCallBack();
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
        showComputerPartSearchOption(1,"types");
        showComputerPartSearchOption(2,"brands");
        showComputerPartSearchOption(3,"models");
        System.out.println( " 4. Show computer parts . ");
        System.out.println(" 0. Exit ");
        showEnterNumberMessage();
    }
    private static void showComputerPartSearchOption(int optionNumber , String option){
        System.out.println(" " + optionNumber + ". " + "computer part " + option);
    }
    public static void onSearchMenuOptions(int option){
        switch (option){
            case 1 :
                showWelcomeMessage("search computer part by types . ");
                break;
            case 2 :
                showWelcomeMessage("search computer part by brands . ");
                break;
            case 3 :
                showWelcomeMessage("search computer part by models . ");
                break;
            case 4 :
                System.out.println(" OKAY , Here you are : ");
                // fixme ( there isn't computer parts here)
                break;
            case 0 :
                break;

            default:
                showWrongNumberError();
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

}
