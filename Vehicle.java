/**The class Vehicle has five private attributes(instance variables).
 * The class Vehicle has one constructor that takes four parameters.
 * Each attribute has accessor method and there are two setter method to set the values in parameter.
 * display method that should output vehicleID,vehicleName,vehicleWeight,vehicleColor and vehicleSpeed.
 * @author(Prashant Kumar Singh)
 * @version(17.0.1)
 **/
class Vehicle
{
    //Declaring the attributes/variables with private access modifier.
    private int vehicleID;//vehicleID is declared  with int  datatype
    private String vehicleName;//vehicleName is declared with String datatype
    private String vehicleWeight;//vehicleWeight is declared  Striing datatype
    private String vehicleColor; // vehicleColor is declared with String datatype
    private String vehicleSpeed; //vehicleSpeed is declared with String datatype
    
    //Creating a constructor of class Vehicle which takes four parameters.
    public Vehicle(int vehicleID,String vehicleName,String vehicleColor,String vehicleWeight)
    {
        this.vehicleID=vehicleID;
        this.vehicleName=vehicleName;
        this.vehicleColor=vehicleColor;
        this.vehicleWeight=vehicleWeight;  
    } 
    
    //Accessor method/ getter method to get vehicle ID 
    public int getVehicleID()
    {
        return this.vehicleID;
    }
    //Accessor method/getter method to get vehicle name 
    public String getVehicleName()
    {
        return this.vehicleName;
    }
    //Accessor method/getter method to get vehicle weight
    public String getVehicleWeight()
    {
        return this.vehicleWeight;
    }
    //Accessor method/getter method to get  vehicle speed
    public String getVehicleSpeed()
    {
        return this.vehicleSpeed;
    }
    //Accessor method/getter method  to get vehicle color
    public String getVehicleColor()
    {
        return this.vehicleColor;
    }
    
    //Setter method to set vehicle speed as new speed
    public void setVehicleSpeed(String newSpeed)
    {
        this.vehicleSpeed=newSpeed;
    }
    //Setter method to set vehicle color as new color
    public void setVehicleColor(String newColor)
    {
        this.vehicleColor=newColor;
    }
    
    //Creating a display method with no return type.
    public void display()
    {
        System.out.println("The Vehicle id is: "+this.vehicleID);
        System.out.println("The Vehicle name is: "+this.vehicleName);
        if(this. vehicleWeight=="")
        {
            System.out.println("Vehicle weight: Empty");
        }
        else
        {
            System.out.println("The Vehicle wight is: "+this.vehicleWeight);
        }
        System.out.println("The Vehicle color is: "+this.vehicleColor);
        System.out.println("The Vehicle speed is:"+this.vehicleSpeed);    
    }
    
    
}