package practices.computer.Case;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import static practices.computer.Case.Power.checkNumberInRange;
import static practices.computer.Case.Power.scanner;
import static practices.computer.Computer.creatDataBase;
import static practices.computer.display.Display.writeFile;


public class Cpu {
    String cpuBrand;
    // intel or AMD
    String cpuSku;
    String cpuFamily;
    // core i , ryzen
    int cpuFamilyNumber;
    // like core i5 or ryzen7 
    int cpuGeneration;

    // -------------------------------- // DataBase // --------------------------------- //
    ArrayList <String> cpuBrandsDataBase = new ArrayList<>() ;
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
    public void setBrand(){
        this.cpuBrand = cpuBrandsDataBase.get( checkNumberInRange(1,
                2, "CPU brands",cpuBrandsDataBase ) );
    }

    public String setCpuSku() {
        System.out.println(" What is your CPU SKU ? ");
        this.cpuSku = scanner.nextLine();
        return cpuSku;
    }

    public void setFamily(){
        if (cpuBrand.equals("Intel")){
            this.cpuFamily =  setIntelCpuFamily();
        } else if (cpuBrand.equals("AMD")) {
            this.cpuFamily =  setAmdCpuFamily();
        }
    }
    private String setAmdCpuFamily(){
        return amdCpuFamiliesDataBase.get(checkNumberInRange(1,3,
                "AMD CPU family" , amdCpuFamiliesDataBase) ) ;
    }
    private String setIntelCpuFamily(){
        return intelCpuFamiliesDataBase.get(checkNumberInRange(1,3
                , "Intel CPU families" , intelCpuFamiliesDataBase) ) ;
    }
    public void setFamilyNumber(){
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
    }
    public void setGeneration() {
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
    }

    // --------------------------------- // getters // --------------------------------- //
    @Override
    public String toString() {
        return "Cpu{" +
                "cpuBrand='" + cpuBrand + '\'' +
                "cpuSku='" + cpuSku + '\'' +
                ", cpuFamily='" + cpuFamily + '\'' +
                ", cpuFamilyNumber=" + cpuFamilyNumber +
                ", cpuGeneration=" + cpuGeneration +
                '}';
    }
    // -------------------- // constructor && get instance of class// -------------------- //
    public Cpu(){
        setBrand();
        setFamily();
        setFamilyNumber();
        setGeneration();
        setCpuSku();
        setCpusDataBase();
    }

    // ------------------------------ // other methods // ------------------------------ //
    public static int checkNumberInList(ArrayList list , String message){
        int number;
        do {
            System.out.print(" Please enter " + message + " number : ");
            number = scanner.nextInt();
            if (!list.contains(number)){
                System.out.println(" !! Error !! Please try again ! ");
            }
        }while(!list.contains(number));
        return list.indexOf(number);
    }


    public void setCpusDataBase(){
        JSONObject cpuObject = new JSONObject();
        cpuObject.put("CPU brand", cpuBrand);
        cpuObject.put("CPU Family", cpuFamily);
        cpuObject.put("CPU FamilyNumber", cpuFamilyNumber);
        cpuObject.put("CPU Generation", cpuGeneration);
        cpuObject.put("CPU SKU", cpuSku);
        creatDataBase("CPUsDataBase.json");
        writeFile(cpuObject , cpusArray , "CPUsDataBase.json");
    }
}