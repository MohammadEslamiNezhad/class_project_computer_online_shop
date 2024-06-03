package practices.ComputerPartOnlineShop.OnlineShopCommodity;

public abstract class ComputerPart {
    static String ownerUserName ;
    static long price ;
    static String brand;
    static String model;

    static int store ;

    public abstract void setStore(int store);
    public abstract void setOwnerUserName(String ownerUserName);
    public abstract String setBrand();

    public abstract void setModel(String model);

    public abstract void setPrice(long price);

    public abstract int getStore();
    public abstract String getOwnerUserName();

    public abstract String getBrand();

    public abstract String getModel();

    public abstract long getPrice() ;
}
