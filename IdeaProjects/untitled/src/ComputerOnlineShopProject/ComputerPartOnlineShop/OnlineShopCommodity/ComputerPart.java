package practices.ComputerPartOnlineShop.OnlineShopCommodity;

public abstract class ComputerPart {
    static String ownerUserName ;
    static String brand ;
    static String model ;
    static long price ;

    public abstract void setOwnerUserName(String ownerUserName);

    public abstract void setBrand(String brand);

    public abstract void setModel(String model);

    public abstract void setPrice(long price);

    public abstract String getOwnerUserName();

    public abstract String getBrand();

    public abstract String getModel();

    public abstract long getPrice() ;
}
