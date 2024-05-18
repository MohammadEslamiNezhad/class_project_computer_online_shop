package practices.computer.Case;

import java.util.ArrayList;

import static practices.computer.Case.MainBoard.printResult;
import static practices.computer.Case.Power.checkNumberInRange;
import static practices.computer.Case.Power.scanner;


public class Cpu {
    String cpuBrand;
    // intel or AMD 
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

    // ---------------------------- // setters & getters // ----------------------------- //
    // --------------------------------- // setters // ---------------------------------- //
    public void setBrand(){
        this.cpuBrand = cpuBrandsDataBase.get( checkNumberInRange(1,
                2, "CPU brands",cpuBrandsDataBase ) );
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
    public void getCpuBrand() {
        printResult( "cpu brand", cpuBrand);
    }

    public void getCpuFamily() {
        printResult( "cpu family", cpuFamily);
    }

    public void getCpuFamilyNumber() {
        printResult( "cpu family number" +
                " (like core i3 or ryzen7 )", String.valueOf(cpuFamilyNumber));
    }

    public void getCpuGeneration() {
        printResult( "cpu Generation ", String.valueOf(cpuGeneration));
    }
    // -------------------- // constructor && get instance of class// -------------------- //
    public Cpu(){
        setBrand();
        setFamily();
        setFamilyNumber();
        setGeneration();
    }
    public static void getCpu(Cpu cpu){
        System.out.println("// -------------------------------- " +
                "// Cpu // ----------------------------- //");
        cpu.getCpuBrand();
        cpu.getCpuFamily();
        cpu.getCpuFamilyNumber();
        cpu.getCpuGeneration();
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
}