
/**
 *
 * @author myPC
 * ikhwan kacak
 */

import java.util.*;
import java.text.*;
import java.io.*;

public class CarRentalSystem {
    
     public static void clrscr() throws Exception
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\n\n\t\t\t<< Press ENTER to continue >> ");
		sc.nextLine();
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}

    static void mainmenu()
	{
		System.out.println("\n\n\t\t\tCAR ON DEMAND RENTAL MANAGEMENT SYSTEM");
		System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\t\t\t1. Car Management");
		System.out.println("\t\t\t2. Rent-A-Car");
        System.out.println("\t\t\t3. Customer Management");
		System.out.println("\t\t\t4. Exit");
		System.out.print("\n\t\t\tPlease input your choice >> ");
	}
    
    static int carmenu(Scanner input)
	{
		System.out.println("\t\t\tCAR MANAGEMENT SYSTEM");
		System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\t\t\t1. Add New Car");
        System.out.println("\t\t\t2. Search Car");
        System.out.println("\t\t\t3. Delete Car");
        System.out.println("\t\t\t4. List All Car");
		System.out.println("\t\t\t5. Return to Main Menu");
		System.out.print("\n\t\t\tPlease input your choice >> ");
        int response = input.nextInt();
        return response;
	}
    
    static int rentmenu(Scanner input)
	{
		System.out.println("\t\t\tRENTAL MANAGEMENT SYSTEM");
		System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\t\t\t1. Book Car");
		System.out.println("\t\t\t2. Sort Car By Demand");
        System.out.println("\t\t\t3. Car Availability");
        System.out.println("\t\t\t4. Return to Main Menu");
		System.out.print("\n\t\t\tPlease input your choice >> ");
        int response = input.nextInt();
        return response;

	}

    static int customermenu(Scanner input)
	{
		System.out.println("\t\t\tCUSTOMER MANAGEMENT SYSTEM");
		System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\t\t\t1. Add New Customer");
        System.out.println("\t\t\t2. Search Customer");
        System.out.println("\t\t\t3. Delete Customer");
        System.out.println("\t\t\t4. List All Customers");
		System.out.println("\t\t\t5. Return to Main Menu");
		System.out.print("\n\t\t\tPlease input your choice >> ");
        int response = input.nextInt();
        return response;
	}
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        LinkedList carInfo = new LinkedList();
        LinkedList custInfo = new LinkedList();
        for(;;) {
            int choice = 0;
            input.nextLine();
            mainmenu();
            choice = Integer.parseInt(input.nextLine()); 
            if (choice ==1) {   //car management menu               
                int submenu1 = carmenu(input);
                if (submenu1 == 1) {                //new car
                    carList carList = newCar(input);
                    writeNewCar(carList);
                    System.out.print("\n\t\t\t<< Data Stored Successfully >> ");
                    clrscr();
                }
                else if (submenu1 == 2) {       //search car
                    
                }
                else if (submenu1 == 3) {       //delete car
 
                }

                else if (submenu1 == 4) {       //list car
                    System.out.print(PrintCar(carInfo));
                }

                else {
                    input.nextLine();
	                System.out.println("\n\n\n\t\t\tReturning to Main Menu!\n\n\n");
	                clrscr();
                }
            }
            
            else if(choice ==2) {  //rent car menu
                int submenu2 = rentmenu(input);
            }
            
            else if(choice ==3) {  //customer menu
                int submenu3 = customermenu(input);

                if (submenu3 == 1) {
                    customerList custList = newCustomer(input);
                    writeNewCustomer(custList);
                    System.out.print("\n\t\t\t<< Data Stored Successfully >> ");
                    clrscr();
                }
                else if (submenu3 == 2) {

                }
                else if (submenu3 == 3) {
                    
                }
                else if (submenu3 == 4) {
                    
                }
                else  {
                    input.nextLine();
	                System.out.println("\n\n\n\t\t\tReturning to Main Menu!\n\n\n");
	                clrscr();
                }

            }
            
            else if(choice == 4) {  //exit
                System.out.println("\n\n\n\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	            System.out.print("\t\t\tExiting.... ");
	            break;
            }

            else if(choice == 5) {  //exit
                carInfo = getCarInfo();
                custInfo = getCustInfo();

            }
                 
            else {
                input.nextLine();
	            System.out.println("\n\n\n\t\t\tWrong input! Please re-enter your choice!\n\n\n");
	            clrscr();
            }
            
        }
        
    }
    
    static carList newCar(Scanner in) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\tNEW CAR REGISTRATION");
		System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("\t\t\tPlease enter Car ID >>> ");
        int carID = Integer.parseInt(input.nextLine());
        System.out.print("\t\t\tPlease enter Car Manufacturer >>> ");
        String carManufacturer = input.nextLine();
        System.out.print("\t\t\tPlease enter Car Name >>> ");
        String carName = input.nextLine();
        System.out.print("\t\t\tPlease enter Car Year >>> ");
        int carYear = input.nextInt(); 
        System.out.print("\t\t\tPlease enter Car Color >>> ");
        String carColor = input.next();
        System.out.print("\t\t\tPlease enter Car Plate >>> ");
        String carPlate = input.next();
        System.out.print("\t\t\tPlease enter Car Capacity >>> ");
        int carCapacity = input.nextInt(); 
        System.out.print("\t\t\tPlease enter Car Rent >>> ");
        double carRent = input.nextDouble();

        carList data = new carList(carID, carManufacturer, carName, carYear, carColor, carPlate, carCapacity, carRent);
        return data;
    
    }

    static void writeNewCar(carList data) {
        try(PrintWriter writeCar = new PrintWriter(new BufferedWriter(new FileWriter("carInfo.txt", true)))) {
            writeCar.println(data.getCarID()+";"+data.getCarManufacturer()+";"+data.getCarName()+";"+data.getCarYear()+";"+data.getCarColor()+";"+data.getCarPlate()+";"+data.getCarCapacity()+";"+data.getCarRent()+";");
            writeCar.close();
        }
        catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }
        catch(IOException io){
            System.out.println(io.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }

    static void deleteCar() {

    }
    
    static void searchCar() {
        
    }

    static LinkedList getCarInfo() {
        LinkedList list = new LinkedList();
        BufferedReader in;
       String read = null;
       StringTokenizer st;
       try{
           in = new BufferedReader(new FileReader("carInfo.txt"));
           while((read = in.readLine()) != null){
               st = new StringTokenizer(read,";");
               int carID = Integer.parseInt(st.nextToken());
               String carManufacturer = st.nextToken();
               String carName = st.nextToken();
               int carYear = Integer.parseInt(st.nextToken());
               String carColor = st.nextToken();
               String carPlate = st.nextToken();
               int carCapacity = Integer.parseInt(st.nextToken());
               double carRent = Double.parseDouble(st.nextToken());


               carList data = new carList(carID, carManufacturer, carName, carYear, carColor, carPlate, carCapacity, carRent);
               list.insertAtBack(data);
               System.out.println(data.toString());
           }
       }
       catch(FileNotFoundException fnfe){
           System.err.println(fnfe.getMessage());
       }
       catch(IOException io){
           System.err.println(io.getMessage());
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }

        return list;
    }

    public static String PrintCar(LinkedList List) {
        String out = ""; carList c;
        if(List == null)
            out+="List is empty";
        else {
            Object data = List.getFirst();
            while (data!=null) {
                c = (carList) data;
                out+= c.toString();
                data = List.getNext();
            }
        }
        return out;
    }

    static customerList newCustomer(Scanner in) {
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\tNEW CUSTOMER REGISTRATION");
		System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("\t\t\tPlease enter Customer Name >>> ");
        String custName = input.nextLine();
        System.out.print("\t\t\tPlease enter Customer IC >>> ");
        String custIC = input.nextLine();
        System.out.print("\t\t\tPlease enter Customer Phone Number >>> ");
        String custPhone = input.next();

        customerList data = new customerList(custName, custIC, custPhone);
        return data;
    }

    static void writeNewCustomer(customerList data) {
        try(PrintWriter writeCustomer = new PrintWriter(new BufferedWriter(new FileWriter("custInfo.txt", true)))) {
            writeCustomer.println(data.getCustName()+";"+data.getCustIC()+";"+data.getCustPhone()+";");
            writeCustomer.close();
        }
        catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }
        catch(IOException io){
            System.out.println(io.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }

    static LinkedList getCustInfo() {
        LinkedList list = new LinkedList();
        BufferedReader in;
       String read = null;
       StringTokenizer st;
       try{
           in = new BufferedReader(new FileReader("custInfo.txt"));
           while((read = in.readLine()) != null){
               st = new StringTokenizer(read,";");
               String custName = st.nextToken();
               String custIC = st.nextToken();
               String custPhone = st.nextToken();

               customerList data = new customerList(custName, custIC, custPhone);
               list.insertAtBack(data);
               System.out.println(data.toString());
           }
       }
       catch(FileNotFoundException fnfe){
           System.err.println(fnfe.getMessage());
       }
       catch(IOException io){
           System.err.println(io.getMessage());
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }

        return list;
    }
    
}