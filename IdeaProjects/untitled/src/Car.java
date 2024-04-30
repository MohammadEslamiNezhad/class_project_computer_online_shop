import java.util.Arrays;

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
    // petrol , biodiesel , diesel , ethanol
    private String bodyColor ;
    // if we stay outside the car what color of car we can see ?
    private String interiorColor ;
    // seat ( car chairs ) and dashboard of car .
    private String bodyStatus ;
    // It shows how many the car has been painted .
    private String engineType ;
    // turbo or natural breathing

    String [] bodyColorList = { "red" , "blue" , "black" , "brown" ,
            "green" , "pink" , "purple" , "yellow" , "white" , "silver" , "golden" } ;

    private int kiloMeter ; // how many your automobile work .
    private int numberOfCylinder ; // in motor can be 4 , 6 or 8 .
    private int numberOfGears ; // it's an integer number between 3 and 10 .

    private float volumeOfEngine ; // fuel volume of engine ( automobile motor )
    private float volumeOfBock ; // by litter ; it can be in range 40 and 60  .
    private float fuelConsumption ;
    // show to you how many your automobile consume fuel . (in 100 km)
    private float zeroToHundredTime ;
    // Time to reach the speed of the car from 0 to 100

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
    public String getFuelType() { return fuelType ; }
    public String getBodyColor() {return bodyColor ; }
    public String getInteriorColor() {return interiorColor;}
    public String getColorList () {return Arrays.toString(bodyColorList) ;}
    public String getBodyStatus() {return bodyStatus;}
    public String getEngineType(){return engineType ;}

    public int getKiloMeter() { return kiloMeter; }
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
    public float getZeroToHundredTime() {return zeroToHundredTime ;}

    // string setters
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
    public void setModel(String model) {this.model = model;}
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

    public void setFuelType(String fuelType) {
        if ( ! ( fuelType.equals("ethanol") || fuelType.equals("petrol") ||
                fuelType.equals("diesel") || fuelType.equals("biodiesel") ) ){
            System.out.println( " !! Error !! Please enter fuel type correctly ! " );
        }
        else {
            System.out.println( " Set fuel type successful ! " );
            this.fuelType = fuelType;
        }
    }

    public void setGearboxModel(String gearboxModel) {
        if ( ! ( gearboxModel.equals("automatic") || gearboxModel.equals("semi automatic") ||
                gearboxModel.equals("manual") ) ){
            System.out.println( " !! Error !! Please enter gear box model correctly ! " );
        }
        else {
            System.out.println( " Set gear box successful ! " );
            this.gearboxModel = gearboxModel;
        }
    }

    public void setBodyColor(String bodyColor) {
        boolean existColorInMyList = false ;
        for (String i : bodyColorList){
            if ( i.equals(bodyColor)){
                existColorInMyList = true ;
                System.out.println(" Set body color successful ! ");
                this.bodyColor = bodyColor;
            }
        }
        if (!existColorInMyList){
            System.out.println( " !! Error !! Please enter body color correctly ! " );
        }
    }

    public void setInteriorColor(String interiorColor) {
        String [] interiorColorList = bodyColorList ;
        boolean existColorInMyList = false ;
        for (String i : interiorColorList){
            if ( i.equals(interiorColor)){
                existColorInMyList = true ;
                System.out.println(" Set interior color successful ! ");
                this.interiorColor = interiorColor;
            }
        }
        if (!existColorInMyList){
            System.out.println( " !! Error !! Please enter interior color correctly ! " );
        }
    }

    public void setBodyStatus(String bodyStatus) {
        if ( ! ( bodyStatus.equals("bi color") || bodyStatus.equals("a few painted spots")
                || bodyStatus.equals("fender paint") ||
                bodyStatus.equals("smoothing without paint") ||
                bodyStatus.equals("single spot paint")) ){
            System.out.println( " !! Error !! Please enter body status correctly ! " );
        }else {
            System.out.println( " Set body status successful ! " );
            this.bodyStatus = bodyStatus;
        }
    }

    public void setEngineType(String engineType) {
        if (!(engineType.equals("turbo") || engineType.equals("natural breathing"))){
            System.out.println( " !! Error !! Please enter engine type correctly ! " );
        }else {
            System.out.println( " Set engine type successful ! " );
            this.engineType = engineType;
        }
    }

    // integer setters
    public void setKiloMeter(int kiloMeter) {
        if ( kiloMeter < 0 ){
            System.out.println( " !! Error !! Please enter kilo meter correctly !" );
        }else {
            System.out.println( " Set kilometer successful ! " );
            this.kiloMeter = kiloMeter ;
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

    public void setNumberOfGears(int numberOfGears) {
        if ( numberOfGears > 10 || numberOfGears < 3 ){
            System.out.println( " !! Error !! Please enter number of gears correctly ! " );
        }
        else {
            System.out.println( " Set number of gears successful ! " );
            this.numberOfGears = numberOfGears;
        }
    }


    // float setters .
    public void setVolumeOfBock(float volumeOfBock) {
        if ( volumeOfBock > 90 || volumeOfBock < 40 ){
            System.out.println( " !! Error !! Please enter volume of bock correctly ! " );
        }else {
            System.out.println( " Set volume of bock successful ! " );
            this.volumeOfBock = volumeOfBock;
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
    public void setVolumeOfEngine(float volumeOfEngine) {
        if ( volumeOfEngine > 2.5f || volumeOfEngine < 1 ){
            System.out.println( " !! Error !! Please enter volume of engine correctly ! " );
        }else {
            System.out.println( " Set volume of engine successful ! " );
            this.volumeOfEngine = volumeOfEngine;
        }
    }

    public void setZeroToHundredTime(float zeroToHundredTime) {
        if (zeroToHundredTime < 0){
            System.out.println( " !! Error !! Please enter zero to hundred correctly ! " );
        }else {
            System.out.println( " Set zero to hundred successful ! " );
            this.zeroToHundredTime = zeroToHundredTime;
        }
    }
    
}
