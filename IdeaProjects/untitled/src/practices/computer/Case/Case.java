package practices.computer.Case;

import practices.computer.Case.storage.Storage;

public class Case {
    MainBoard mainBoard ;
    Cpu cpu ;
    Ram ram ;
    Storage storage ;
    Power power ;
    Gpu gpu ; 
    public Case (MainBoard mainBoard
    , Cpu cpu , Ram ram , Power power ,
    Storage storage , Gpu gpu ){
        this.mainBoard = mainBoard ; 
        this.cpu = cpu ; 
        this.ram = ram ; 
        this.storage = storage ; 
        this.power = power ; 
        this.gpu = gpu ; 
    }
}
