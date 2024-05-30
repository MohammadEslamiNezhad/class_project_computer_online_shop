package practices.ComputerPartOnlineShop;

import practices.ComputerPartOnlineShop.interfaces.OnlineShopCallBacksOdMainMenu;

import java.util.Scanner;

import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.*;

public class ComputerPartsOnlineShop {
    public static void main(String args[]){
        startOnlineShop();
    }
    public static void startOnlineShop(){
        showMainMenu(new OnlineShopCallBacksOdMainMenu() {

            @Override
            public void onSearchMenuCallBack() {
                onWhatMenu("search");
                showSearchMenuOptions();
                int option = new Scanner(System.in).nextInt();
                onSearchMenuOptions(option);
                // fixme ( search options menu ) [ name , brand , model
                //  , other attributes ]
            }

            @Override
            public void onBuyMenuCallBack() {
                onWhatMenu("buy");
                onSearchMenuCallBack();
            }

            @Override
            public void onSellMenuCallBack() {
                onWhatMenu("sell");
                onSearchMenuCallBack();
            }
        });
    }
    public static void showMainMenu(OnlineShopCallBacksOdMainMenu callBack){
        showMainMenuOptions();
        int option = new Scanner(System.in).nextInt();
        runProgramOptions(option,callBack);
        if (option != 0){
            showMainMenu(callBack);
        }
    }

}
