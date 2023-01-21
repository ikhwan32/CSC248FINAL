
/**
 *
 * @author myPC
 */
public class rentCar {
    private int rentedCar;
    private String rentedCustIC;
    private int rentDuration;
    private double rentedPrice;
    
    //default constructor
    public rentCar(int rC, String rCID, int rD, double rP) {
        rentedCar = rC;
        rentedCustIC = rCID;
        rentDuration = rD;
        rentedPrice = rP;
    }
    
    //mutator
    public void setRentCar(int rC, String rCID, int rD, double rP) {
        rentedCar = rC;
        rentedCustIC = rCID;
        rentDuration = rD;
        rentedPrice = rP;
    }
    
    //accessor
    public int getRentedCar(){return rentedCar;}
    public String getRentedCustID(){return rentedCustIC;}
    public int getRentDuration(){return rentDuration;}
    public double getRentedPrice(){return rentedPrice;}
    
    
    public String toString(){
        return "\n\t\t\tRented Car Name = " + rentedCar +
             "\n\t\t\tRented Customer's ID = " + rentedCustIC +
             "\n\t\t\tRent Duration = " + rentDuration +
             "\n\t\t\tRented Car Price = " + rentedPrice ;
    }   
    
}
