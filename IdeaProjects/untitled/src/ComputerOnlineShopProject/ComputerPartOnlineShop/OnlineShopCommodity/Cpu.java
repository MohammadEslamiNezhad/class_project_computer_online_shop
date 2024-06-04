package practices.ComputerPartOnlineShop.OnlineShopCommodity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import static practices.ComputerPartOnlineShop.OnlineShopUtils.OnlineShopInputOutputManager.*;

public class Cpu extends ComputerPart{
    String cpuBrand;
    // intel or AMD
    String cpuFamily;
    // core i , ryzen
    int cpuFamilyNumber;
    // like core i5 or ryzen7
    int cpuGeneration;

    // -------------------------------- // DataBase // --------------------------------- //
    ArrayList<String> cpuBrandsDataBase = new ArrayList<>() ;
    {
        cpuBrandsDataBase.add("Intel") ;
        cpuBrandsDataBase.add("AMD");
    }
    ArrayList <String> intelCpuFamiliesDataBase = new ArrayList<>() ;
    {
        intelCpuFamiliesDataBase.add("core i") ;
        intelCpuFamiliesDataBase.add("Pentium") ;
        intelCpuFamiliesDataBase.add("Celeron") ;
    }
    ArrayList <String> amdCpuFamiliesDataBase = new ArrayList<>() ;
    {
        amdCpuFamiliesDataBase.add("Ryzen") ;
        amdCpuFamiliesDataBase.add("Radeon") ;
        amdCpuFamiliesDataBase.add("Phenom") ;
    }
    ArrayList <Integer> cpuFamilyNumbers = new ArrayList<>() ;
    {
        cpuFamilyNumbers.add(3);
        cpuFamilyNumbers.add(5);
        cpuFamilyNumbers.add(7);
        cpuFamilyNumbers.add(9);
    }
    ArrayList <Integer> intelGenerationNumbers = new ArrayList<>() ;
    {
        for (int i = 1; i <= 14; i++) {
            intelGenerationNumbers.add(i) ;
        }
    }
    ArrayList <Integer> amdGenerationNumbers = new ArrayList<>() ;
    {
        for (int i = 1; i <= 7; i++) {
            amdGenerationNumbers.add(i) ;
        }
    }
    JSONArray cpusArray = new JSONArray() ;
    // ---------------------------- // setters & getters // ----------------------------- //
    // --------------------------------- // setters // ---------------------------------- //
    @Override
    public String setBrand(){
        this.cpuBrand = cpuBrandsDataBase.get( checkNumberInRange(1,
                2, "CPU brands",cpuBrandsDataBase ) );
        return cpuBrand ;
    }

    @Override
    public void setModel(String model) {

    }

    public String setFamily(){
        if (cpuBrand.equals("Intel")){
            this.cpuFamily =  setIntelCpuFamily();
        } else if (cpuBrand.equals("AMD")) {
            this.cpuFamily =  setAmdCpuFamily();
        }
        return cpuFamily ;
    }
    private String setAmdCpuFamily(){
        return amdCpuFamiliesDataBase.get(checkNumberInRange(1,3,
                "AMD CPU family" , amdCpuFamiliesDataBase) ) ;
    }
    private String setIntelCpuFamily(){
        return intelCpuFamiliesDataBase.get(checkNumberInRange(1,3
                , "Intel CPU families" , intelCpuFamiliesDataBase) ) ;
    }
    public int setFamilyNumber(){
        if (cpuFamily.equals("Ryzen") || cpuFamily.equals("core i")){
            this.cpuFamilyNumber = cpuFamilyNumbers.
                    get(checkNumberInList(cpuFamilyNumbers,"CPU family ")) ;
        }else if (!cpuFamily.isEmpty() &&
                !cpuFamily.equals("Ryzen") && !cpuFamily.equals("core i")){
            System.out.println(" Oh your CPU is very old . I don't have family of " +
                    "your CPU on my database . ");
        }else {
            System.out.println(" !! Error !! you don't have cpu family ! ");
        }
        return cpuFamilyNumber;
    }
    public int setGeneration() {
        if (cpuFamily.equals("core i")) {
            this.cpuGeneration = intelGenerationNumbers.get(checkNumberInList(
                    intelGenerationNumbers, "Intel CPU  generations"));
        } else if (cpuFamily.equals("Ryzen")) {
            this.cpuGeneration = amdGenerationNumbers.get(checkNumberInList
                    (amdGenerationNumbers, "AMD CPU generations"));
        }else {
            System.out.println(" Oh your CPU is very old . I don't have generation of " +
                    "your CPU on my database . ");
        }
        return cpuGeneration ;
    }

    // --------------------------------- // getters // --------------------------------- //
    @Override
    public String toString() {
        return "Cpu{" +
                "cpuBrand='" + cpuBrand + '\'' +
                ", cpuFamily='" + cpuFamily + '\'' +
                ", cpuFamilyNumber=" + cpuFamilyNumber +
                ", cpuGeneration=" + cpuGeneration +
                '}';
    }
    // --------------------------------- // constructor // --------------------------------- //
    public Cpu(){
        setCpusDataBase();
    }

    // ------------------------------- // other methods // ------------------------------- //

    public void setCpusDataBase(){
        JSONObject cpuObject = new JSONObject();
        cpuObject.put("CPU brand", setBrand());
        cpuObject.put("CPU Family", setFamily());
        cpuObject.put("CPU FamilyNumber", setFamilyNumber());
        cpuObject.put("CPU Generation", setGeneration());
        creatDataBase("CPUsDataBase.json");
        writeFile(cpuObject , cpusArray , "CPUsDataBase.json");
    }
    @Override
    public void setStore(int store) {

    }

    @Override
    public void setOwnerUserName(String ownerUserName) {
        ComputerPart.ownerUserName = ownerUserName;
    }

    @Override
    public void setPrice(long price) {
        ComputerPart.price = price;
    }

    @Override
    public int getStore() {
        return 0;
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
