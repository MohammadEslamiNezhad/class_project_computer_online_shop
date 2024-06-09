import interfaces.FilterMenuCallBack;
import interfaces.MainMenuCallBack;
import interfaces.NewCommodityCallBack;

import java.util.Scanner;

public class OnlineShop {
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }
    public static void start() {
        showMainMenu(new MainMenuCallBack() {
            @Override
            public void showFiltersMenu(FilterMenuCallBack callBack) {
                System.out.println(" 1. Group name ");
                System.out.println(" 2. Commodity name ");
                System.out.println(" 3. Brand ");
                System.out.println(" 4. Price range  ");
                System.out.print(" >>> ");
                int filterNumber = numberScanner.nextInt() ;
                switch (filterNumber){
                    case 1 :
                        callBack.setGroupName();
                        break;

                    case 2 :
                        callBack.setCommodityName();
                        break;

                    case 3 :
                        callBack.setBrand();
                        break;

                    case 4 :
                        callBack.setPriceRange();

                    default:
                        showErrorMessage();
                }
            }

            @Override
            public void showCommodities() {
                // fixme : creat JSON file for commodities data base and read from this .
            }

            @Override
            public void addNewCommodity(NewCommodityCallBack callBack) {
                System.out.println(" 1. To exist group");
                System.out.println(" 2. To new group");
                System.out.print(" >>> ");
                int addOptionNumber = numberScanner.nextInt();
                switch (addOptionNumber){
                    case 1 :
                        callBack.existGroup();
                        break;

                    case 2 :
                        callBack.addNewGroup();
                        break;

                    default:
                        showErrorMessage();
                        start();
                }
            }

        });
    }

    public static void showMainMenu(MainMenuCallBack callBack){

        System.out.println(" Welcome to computer online shop !");
        System.out.println("/--------------------------------------------/");
        System.out.println(" 1. set filter ");
        System.out.println(" 2. show ");
        System.out.println(" 3. add ");
        System.out.print(" >>> ");

        int option = numberScanner.nextInt();

        switch (option){
            case 1 :
                callBack.showFiltersMenu(new FilterMenuCallBack() {
                    @Override
                    public void setCommodityName() {
                        System.out.println(" 1. CPU");
                        System.out.println(" 2. RAM");
                        System.out.println(" 3. Power");
                        System.out.println(" 4. MainBoard");
                        System.out.println(" 5. Mouse");
                        System.out.println(" 6. Display");
                        System.out.println(" 7. Keyboard");
                        System.out.println(" 8. HDD");
                        System.out.println(" 9. SSD");
                        System.out.print(" >>> ");
                        int commodityNumber = numberScanner.nextInt();
                        start();
                    }

                    @Override
                    public void setGroupName() {
                        System.out.println(" 1. Computer parts ");
                        System.out.print(" >>> ");
                        int groupNumber = numberScanner.nextInt();
                        start();
                    }

                    @Override
                    public void setBrand() {
                        System.out.println(" 1. Intel ");
                        System.out.println(" 2. AMD ");
                        System.out.println(" 3. Kingston  ");
                        System.out.println(" 4. Asus ");
                        System.out.println(" 5. Green ");
                        System.out.println(" 6. GIGABYTE ");
                        System.out.println(" 7. Samsung ");
                        System.out.println(" 8. DELL ");
                        System.out.println(" 9. TSCO ");
                        System.out.println(" 10. Logitech ");
                        System.out.println(" 11. WD ");
                        System.out.println(" 12. Seagate ");
                        // fixme creat data base and a method which show commodities data base.
                        System.out.print(" >>> ");
                        int groupNumber = numberScanner.nextInt();
                        start();
                    }

                    @Override
                    public void setPriceRange() {
                        System.out.print(" Maximum ($): ");
                        int maximum = numberScanner.nextInt();

                        System.out.print(" Minimum ($): ");
                        int minimum = numberScanner.nextInt();

                        start();
                    }
                });
                break;

            case 2 :
                callBack.showCommodities();
                break;

            case 3 :
                callBack.addNewCommodity(new NewCommodityCallBack() {
                    @Override
                    public void existGroup() {
                        System.out.println(" 1. Computer parts ");
                        System.out.print(" >>> ");
                        // fixme : write show group list
                        int groupNumberForAddCommodity = numberScanner.nextInt() ;
                        start();
                    }

                    @Override
                    public void addNewGroup() {
                        System.out.print(" New group name : ");
                        String newGroupName = stringScanner.nextLine();
                        // fixme : creat group list and add to group list
                        start();
                    }
                });
                break;

            default:
                showErrorMessage();
        }
    }

    public static void showErrorMessage(){
        System.out.println(" Error ! please enter number again ! ");
    }
}