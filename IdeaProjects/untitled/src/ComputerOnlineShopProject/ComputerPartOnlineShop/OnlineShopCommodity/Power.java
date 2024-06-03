package practices.ComputerPartOnlineShop.OnlineShopCommodity;

public class Power extends ComputerPart{
    @Override
    public void setOwnerUserName(String ownerUserName) {
        ComputerPart.ownerUserName = ownerUserName;
    }

    @Override
    public String setBrand() {
        return ComputerPart.brand;
    }

    @Override
    public void setModel(String model) {
        ComputerPart.model = model;
    }

    @Override
    public void setPrice(long price) {
        ComputerPart.price = price;
    }

    @Override
    public String getOwnerUserName() {
        return ComputerPart.ownerUserName;
    }

    @Override
    public String getBrand() {
        return ComputerPart.brand;
    }

    @Override
    public String getModel() {
        return ComputerPart.model;
    }

    @Override
    public long getPrice() {
        return ComputerPart.price;
    }
}
