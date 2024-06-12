package interfaces;

public interface MainMenuCallBack {
    void showFiltersMenu(FilterMenuCallBack callBack) ;
    void showItems() ;
    void addNewItem(NewCommodityCallBack callBack);

}
