
/**
 *
 * @author myPC
 */
public class rentCar {
    private String rentedCar;
    private int rentedCustID;
    private double rentedPrice;
    
    //default constructor
    public rentCar(String rC, int rCID, double rP) {
        rentedCar = rC;
        rentedCustID = rCID;
        rentedPrice = rP;
    }
    
    //mutator
    public void setRentCar(String rC, int rCID, double rP) {
        rentedCar = rC;
        rentedCustID = rCID;
        rentedPrice = rP;
    }
    
    //accessor
    public String getRentedCar(){return rentedCar;}
    public int getRentedCustID(){return rentedCustID;}
    public double getRentedPrice(){return rentedPrice;}
    
    
    public String toString(){
        return "\n\t\t\tRented Car Name = " + rentedCar +
             "\n\t\t\tRented Customer's ID = " + rentedCustID +
             "\n\t\t\tRented Car Price = " + rentedPrice ;
    }   
    
}
