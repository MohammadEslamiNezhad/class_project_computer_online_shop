public class Car {
    String fullNameOfCarOwner; // everybody knows it .
    private String gearboxModel ; // Automatic , Semi Automatic , Manual
    private String carAxleModel ;
    // front axle , back axle , four wheel drive , all wheel drive
    private String brand;
    // name of creator company
    private String model ;
    // model of this machine for example peugeot 405 or 206 or 207 .
    private String fuelType ;

    private int kiloMeter ;
    private int numberOfCylinder ; // in motor can be 4 , 6 or 8 .
    private int numberOfGears ; // it's an integer number between 3 and 10 .

    private float volumeOfEngine ; // fuel volume of engine ( automobile motor )
    private float volumeOfBock ; // by litter ; it can be in range 40 and 60  .
    private float fuelConsumption ;
    // show to you how many your automobile consume fuel . (in 100 km)

    public String getGearboxModel(){
        return gearboxModel ;
    }
    public String getCarAxleModel(){
        return carAxleModel ;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model ;
    }

    public int getNumberOfCylinder() {
        return numberOfCylinder;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public float getVolumeOfEngine() {
        return volumeOfEngine;
    }
    public float getVolumeOfBock () {
        return volumeOfBock ;
    }

    public void setBrand(String brand){
        boolean isFind = false ;
        String [] dataBaseOfBrands = { "TOYOTA" , "MERCEDES BENZ" , "TESLA" , "BMW" , "HONDA"
                , "HYUNDAI" , "AUDI" , "VOLKSWAGEN" , "FORD" , "PORSCHE" , "LAMBORGHINI" ,
         "FERRARI" , "FIAT" , "BUGATTI"} ;
        for (String i : dataBaseOfBrands) {
            if (i.equals(brand)){
                System.out.println(" OKAY \" " + brand + " \" is found in my data base .");
                isFind = true ;
                break;
            }
        }
        if (!isFind){
            System.out.println(" Oh no ! I can't find \" " + brand + " \" in my data base !");
        }else {
            System.out.println( " Set brand successful ! " );
            this.brand = brand;
        }
    }
    public void setGearBoxModel(String gearboxModel){
        // Automatic , Semi Automatic , Manual
        if (!(gearboxModel.equals("automatic") || gearboxModel.equals("semi automatic") ||
                gearboxModel.equals("manual"))) {
            System.out.println( " !! Error !! Please enter gearbox model correctly ! " ) ;
        }else {
            System.out.println( " Set gearbox model successful ! " );
            this.gearboxModel = gearboxModel ;
        }
    }

    public void setCarAxleModel(String carAxleModel) {
        // front axle , back axle , all wheel drive , four wheel drive
        if ( !(carAxleModel.equals("front axle") ||
                carAxleModel.equals("back axle") ||
                carAxleModel.equals("all wheel drive") ||
                carAxleModel.equals("four wheel drive") ) ) {
            System.out.println( " !! Error !! Please enter axle model correctly ! " ) ;
        }else {
            System.out.println( " Set axle model successful ! " );
            this.carAxleModel = carAxleModel;
        }
    }

    public void setNumberOfCylinder(int numberOfCylinder) {
        if ( ! ( numberOfCylinder == 4 || numberOfCylinder == 6 || numberOfCylinder == 8 ) ) {
            System.out.println( " !! Error !! Please enter number of " +
                    "cylinder correctly ! " );
        }else {
            System.out.println( " Set number of cylinder successful ! " );
            this.numberOfCylinder = numberOfCylinder;
        }
    }

    public void setFuelConsumption(float fuelConsumption) {
        if (fuelConsumption < 5 || fuelConsumption > 15) {
            System.out.println(" !! Error !! Please enter  " +
                    " fuel consumption correctly ! ");
        } else {
            System.out.println( " Set fuel consumption successful ! " );
            this.fuelConsumption = fuelConsumption;
        }
    }

    public void setNumberOfGears(int numberOfGears) {
        if ( numberOfGears > 10 || numberOfGears < 3 ){
            System.out.println( " !! Error !! Please enter number of gears correctly ! " );
        }
        else {
            System.out.println( " Set number of gears successful ! " );
            this.numberOfGears = numberOfGears;
        }
    }

    public void setVolumeOfBock(float volumeOfBock) {
        if ( volumeOfBock > 90 || volumeOfBock < 40 ){
            System.out.println( " !! Error !! Please enter volume of bock correctly ! " );
        }else {
            System.out.println( " Set volume of bock successful ! " );
            this.volumeOfBock = volumeOfBock;
        }
    }

    public void setVolumeOfEngine(float volumeOfEngine) {
        if ( volumeOfEngine > 4 || volumeOfEngine < 2 ){
            System.out.println( " !! Error !! Please enter volume of engine correctly ! " );
        }else {
            System.out.println( " Set volume of engine successful ! " );
            this.volumeOfEngine = volumeOfEngine;
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setKiloMeter(int kiloMeter) {
        if ( kiloMeter < 0 ){
            System.out.println( " !! Error !! Please enter kilo meter correctly !" );
        }else {
            System.out.println( " Set kilometer successful ! " );
            this.kiloMeter = kiloMeter ;
        }
    }

    public void setFuelType(String fuelType) {
        if ( ! ( fuelType.equals("ethanol") || fuelType.equals("petrol") ||
                fuelType.equals("diesel") || fuelType.equals("biodiesel") ) ){
            System.out.println( " !! Error !! Please enter fuel type correctly !" );
        }
        else {
            System.out.println( " Set fuel type successful ! " );
            this.fuelType = fuelType;
        }
    }
}
