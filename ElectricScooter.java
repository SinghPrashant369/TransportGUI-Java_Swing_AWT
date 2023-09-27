/**
 * A class ElectricScooter has eight attributes(instance variables) which is declared 
 * as private access modifier.
 * This class one constructor that takes six parameters.Each attribute has accessor method
 * and one setter metod to set the brand name as newBrand.
 * The method purchase()takes five parameters and it is not return type method
 * The method sell() takes one parameter as newPrice and it is alost a not return type method.
 * The method display() is overriding method.It call the display() method of Vehicle class.
 * and it print other outputs.
 * @author(Prashant Kumar Singh)
 * @version(17.0.1)
 */
public class ElectricScooter extends Vehicle
{
    //eight attributes(instance variables) with private access modifier
    private int range;
    private int batteryCapacity;
    private int price;
    private String chargingTime;
    private String brand;
    private String mileage;
    private boolean hasPurchased;
    private boolean hasSold;
    
    //ElectricScooter class constructor that takes six parameters
    public ElectricScooter(int vehicleID, String vehicleName,String vehicleWeight,String vehicleSpeed,String vehicleColor,int batteryCapacity)
    {
        //callling a super class(Vehicle) constructor
        super(vehicleID,vehicleName,vehicleColor,vehicleWeight);
        
        //mehtod to set the speed of vehicle and call
        super.setVehicleSpeed(vehicleSpeed);
        
        //metod to set the color of vehicle and call it
        super.setVehicleColor(vehicleColor);
        
        this.batteryCapacity=batteryCapacity;
        this.range=0;
        this.price=0;
        this.brand="";
        this.mileage="";
        this.chargingTime="";
        this.hasPurchased=false;
        this.hasSold=false;
        
    }
    
    //Accessor method/ getter method to get range
    public int getRange()
    {
        return this.range;
    }
    //Accessor method/ getter method to get battery capacity
    public int getBatteryCapacity()
    {
        return this.batteryCapacity;
    }
    //Accessor method/getter method to get price 
    public int getPrice()
    {
        return this.price;
    }
    //Accessor method/getter method to get charing time
    public String getChargingTime()
    {
        return this.chargingTime;
    }
    //Accessor method/getter method to get brand
    public String getBrand()
    {
        return this.brand;
    }
    //Accessor method/getter method to get mileage
    public String getMileage()
    {
        return this.mileage;
    }
    //Accessor method/getter method to get has purchased
    public boolean getHasPurchased()
    {
        return this.hasPurchased;
    }
    //Accessor method/getter method to get hasSold
    public boolean getHasSold()
    {
        return this.hasSold;
    }
    
    //setter method to set the brand of the electic scooter to new brand as a parameter
    public void setBrand(String newBrand)
    {
        if(this.hasPurchased==false)
        {
            this.brand=newBrand;
        }
        else
        {
            System.out.println("It is "+this.brand+" therefore not possible to change the brand.");
        }
    }
    
    //method to purchase an electric scooter that takes five parameters
    public void purchase(String brand,int price,String chargingTime,String mileage,int range)
    {
        if(this.hasPurchased==false)
        {
            setBrand(brand);
            this.price=price;
            this.chargingTime=chargingTime;
            this.mileage=mileage;
            this.range=range;
            this.hasPurchased=true;   
        }
    }
    
    //method to sell the electric scooter
    public void sell(int newPrice)
    {
        if(this.hasSold==false)
        {
            this.price=newPrice;
            this.chargingTime="";
            this.mileage="";
            this.batteryCapacity=0;
            this.range=0;
            this.hasSold=true;
            this.hasPurchased=false;    
        }
        else
        {
            System.out.println("Sorry,"+this.brand+" is already sold out.");
            
        }
    }
    
    //@Override/ method overriding
    public void display()
    {
        //call the Vehicle class display method
        super.display();
        if(this.hasPurchased==true)
        {
            System.out.println("The brand name is: "+this.brand);
            System.out.println("The battery capacity is: "+this.batteryCapacity); 
            System.out.println("The mileage is: "+this.mileage);
            System.out.println("The range is: "+this.range);
            System.out.println("The recharge time is: "+this.chargingTime);           
        }   
    }
}