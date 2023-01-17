
/**
 *
 * @author myPC
 */
public class customerList {
    private String custName;
    private String custIC;
    private String custPhone;
    
    //default constructor
    public customerList(String cN, String cIC, String cP) {
        custName = cN;
        custIC = cIC;
        custPhone = cP;
    }
    
    //mutator
    public void setCarList(String cN, String cIC, String cP) {
        custName = cN;
        custIC = cIC;
        custPhone = cP;
    }
    
    //accessor
    public String getCustName(){return custName;}
    public String getCustIC(){return custIC;}
    public String getCustPhone(){return custPhone;}
    
    public String toString(){
        return "\n\t\t\tCustomer's Name = " + custName +
             "\n\t\t\tCustomer's ID = " + custIC +
             "\n\t\t\tCustomer's Phone = " + custPhone ;
    }   
}
