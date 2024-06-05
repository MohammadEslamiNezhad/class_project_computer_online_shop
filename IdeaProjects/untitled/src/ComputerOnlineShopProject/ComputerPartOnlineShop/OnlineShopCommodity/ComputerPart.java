package practices.ComputerPartOnlineShop.OnlineShopCommodity;

public interface ComputerPart {

    void setStore(int store);
    void setOwnerUserName(String ownerUserName);
    String setBrand();
    void setModel(String model);
    void setPrice(long price);
    int getStore();
    String getOwnerUserName();
    String getBrand();
    String getModel();
    long getPrice() ;
}
