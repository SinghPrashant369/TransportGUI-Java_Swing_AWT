/**A class AutoRickshaw has eight attributes(instance variables) which is declared as
 * private access modifier.
 * The class AutoRickshaw has one constructor that takes nine parameters.
 * Each attributes has accessor method and there are two setter methods.
 * The method book takes three parameters.
 * the method display that output the details of teh auto rickshaw
 * @author(Prashant Kumar Singh)
 * @version(17.0.1)
 * 
 * 
 **/
public class AutoRickshaw extends Vehicle
{
    //eight attributes with private access modifier
    private int engineDisplacement; 
    private String torque;
    private int numberOfSeats;
    private int fuelTankCapacity;
    private String groundClearance;
    private int chargeAmount;
    private String bookedDate;
    private boolean isBooked;
    //AutoRickshaw constructor that takes nine parameters
    public AutoRickshaw(int vehicleID,String vehicleName,String vehicleWeight,String vehicleColor,String vehicleSpeed,
    int engineDisplacement,String torque,int fuelTankCapacity,String groundClearance)
    {
        
        //call a super class constructor i.e Vehicle class constructor with four parameters
        super(vehicleID,vehicleName,vehicleColor,vehicleWeight);
        
        //addionallly, in the constructor assign vehicle speeed and vehicleColor..........
        super.setVehicleSpeed(vehicleSpeed);
        super.setVehicleColor(vehicleColor);
        //assign the values of instance variables with the parameter value
        this.engineDisplacement=engineDisplacement;
        this.torque=torque;
        this.fuelTankCapacity=fuelTankCapacity;
        this.groundClearance=groundClearance; 
        this.isBooked=false;       
    }
    
    //Accessor method/ getter method to get engine displacement
    public int getEngineDisplacement()
    {
        return this.engineDisplacement;
    }
    //Accessor method/getter method to get torque
    public String getTorque()
    {
        return this.torque;
    }
    //Accessor method/getter method to get number of seats
    public int getNumberOfSeats()
    {
      return this.numberOfSeats;
    }
    //Accessor method/getter method to get fuel tank capacity
    public int getFuelTankCapacity()
    {
        return this.fuelTankCapacity;
    }
    //Accessor method/getter method to get ground clearance
    public String getGroundClearance()
    {
        return this.groundClearance;
    }
    //Accessor method/getter method to get charge amount
    public int getChargeAmount()
    {
        return this.chargeAmount;
    }
    //Accessor method/getter method to get booked date
    public String getBookedDate()
    {
        return this.bookedDate;
    }
    //Accessor method/getter method to get is booked
    public boolean getIsBooked()
    {
        return this.isBooked;
    }
    
    //Setter method to set charge amount that takes one parameter as new charge amount
    public void setChargeAmount(int newChargeAmount)
    {
        this.chargeAmount=newChargeAmount; 
        
    }
    //Setter method to set number of seats that takes one parameter as new number of seats
    public void setNumberOfSeats(int newNumberOfSeats)
    {
        this.numberOfSeats=newNumberOfSeats;
    }
    

    //Method to book an auto rickshaw that takes three parameters
    public void book(String bookedDate,int chargeAmount,int numberOfSeats)
    {
        if(this.isBooked==false)
        {
         this.bookedDate=bookedDate;
         setChargeAmount(chargeAmount);
         setNumberOfSeats(numberOfSeats);
         isBooked=true; 
         System.out.println("The vehice having vehicleID: "+getVehicleID()+" is booked....");
        
        }
        else
        {
           System.out.println(this.isBooked+" The Auto rickshaw is already booked..");
           
        }
        
    }
    
    //@Override/overriding method which override the display mehtod of Vehicle class
    public void display()
    {
        //call the Vehicle class display method
        super.display();
        if(this.isBooked=true)
        {
            System.out.println("Engine Displacement: "+this.engineDisplacement);
            
            System.out.println("Torque: "+this.torque);
            
            System.out.println("Fuel Tank Capacity: "+this.fuelTankCapacity);
            System.out.println("Ground Clerance: "+this.groundClearance);
            System.out.println("Booked Date: "+this.bookedDate);
        }
        if(this.chargeAmount==0)
        {
            System.out.println("Empty: The charge amount is not set...");
        }
        else
        {
            System.out.println("Charge amount is: "+this.chargeAmount);
        }
        if(this.numberOfSeats==0)
        {
            System.out.println("Empty: The number of seats of the vehicle is not set....");
        }
        else
        {
            System.out.println("Number of Seats: "+this.numberOfSeats);
        }
        
    }
}
