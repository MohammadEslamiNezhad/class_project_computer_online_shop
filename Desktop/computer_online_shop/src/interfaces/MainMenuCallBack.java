package interfaces;

public interface MainMenuCallBack {
    void showFiltersMenu(FilterMenuCallBack callBack) ;
    void showCommodities() ;
    void addNewCommodity(NewCommodityCallBack callBack);

}
