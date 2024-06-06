package practices.ComputerPartOnlineShop;

import practices.ComputerPartOnlineShop.interfaces.OnlineShopCallBackMainMenu;

import java.util.Scanner;

import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.*;

public class ComputerPartsOnlineShop {
    public static void main(String args[]){
        startOnlineShop();
    }
    public static void startOnlineShop(){
        showMainMenu(() -> {
            onWhatMenu("search");
            showSearchMenuOptions();
            int option = new Scanner(System.in).nextInt();
            onSearchMenuOptions(option);
        });
    }
    public static void showMainMenu(OnlineShopCallBackMainMenu callBack){
        showMainMenuOptions();
        int option = new Scanner(System.in).nextInt();
        runProgramOptions(option,callBack);
        if (option != 0){
            showMainMenu(callBack);
        }
    }

}
