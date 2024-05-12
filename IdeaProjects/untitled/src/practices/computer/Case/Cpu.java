package practices.computer.Case;

public class Cpu {
    String brand ; 
    // intel or AMD 
    String family ; 
    // core i , ryzen
    int familyNumber ;
    // like core i5 or ryzen7 
    int generation ; 
    int sku ; 
    char letter ; 
    
    public String Model() {
            String.valueOf(generation) ; 
            String.valueOf(familyNumber);
            String.valueOf(letter) ;
            String.valueOf(sku) ; 
            return family + familyNumber
            + generation + sku + letter ; 
    }
    
}