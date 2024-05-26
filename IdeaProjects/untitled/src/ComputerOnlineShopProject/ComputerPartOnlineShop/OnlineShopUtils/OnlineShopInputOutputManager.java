package practices.ComputerPartOnlineShop.OnlineShopUtils;

import practices.ComputerPartOnlineShop.interfaces.ComputerPartInterface;

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
    public static void runProgramOptions(int option, ComputerPartInterface callBack){
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

}
