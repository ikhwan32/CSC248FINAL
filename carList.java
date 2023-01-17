
/**
 *
 * @author myPC
 */
public class carList {
    private int carID;
    private String carManufacturer;
    private String carName;
    private int carYear;
    private String carColor;
    private String carPlate;
    private int carCapacity;
    private double carRent;
    
    //normal constructor
    public carList(int cID, String cM, String cN, int cY, String cC, String cP, int c, double cR) {
        carID = cID;
        carManufacturer = cM;
        carName = cN;
        carYear = cY;
        carColor = cC;
        carPlate = cP;
        carCapacity = c;
        carRent = cR;
    }
    
    //mutator
    public void setCarList(int cID, String cM, String cN, int cY, String cC, String cP, int c, double cR) {
        carID = cID;
        carManufacturer = cM;
        carName = cN;
        carYear = cY;
        carColor = cC;
        carPlate = cP;
        carCapacity = c;
        carRent = cR;
    }
    
    //accessor
    public int getCarID(){return carID;}
    public String getCarManufacturer(){return carManufacturer;}
    public String getCarName(){return carName;}
    public int getCarYear(){return carYear;}
    public String getCarColor(){return carColor;}
    public String getCarPlate(){ return carPlate;}
    public int getCarCapacity(){return carCapacity;}
    public double getCarRent(){return carRent;}
    
    public String toString(){
        return "\n\t\t\tCar ID = " + carID +
             "\n\t\t\tCar Manufacturer = " + carManufacturer +
             "\n\t\t\tCar Name = " + carName +
             "\n\t\t\tCar Year = " + carYear +
             "\n\t\t\tCar Color = " + carColor +
             "\n\t\t\tCar Plate = " + carPlate +
             "\n\t\t\tCar Capacity = " + carCapacity +
             "\n\t\t\tCar Rent = " + carRent;
    }   
    
}
