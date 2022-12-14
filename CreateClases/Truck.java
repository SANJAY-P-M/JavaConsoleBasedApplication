                                    /* HIERARCHICAL + MULTILEVEL INHERITANCE = HYBRID INHERITANCE  */
public class Truck extends Vehicle implements FourWheelerLoadTransport {//Implements the interface FourWheelerLoadTransport 
    static int numberOfTrucks;
    protected int loadCapacity;
    public Truck(int load,String driverName,String helperName){
        super(driverName,helperName);
        numberOfTrucks++;
        this.vehicleNumber = numberOfTrucks;
        this.loadCapacity = load;
    }
    public Truck(){
        super();
        numberOfTrucks++;
        this.vehicleNumber = numberOfTrucks;
        this.loadCapacity = 10;
    }
    public Truck(int num){
        super();
        numberOfTrucks++;
        this.vehicleNumber = numberOfTrucks;
        this.loadCapacity = num;
    }
    @Override //Overriding abstract method from vehicle
    public void printAllDetails(){
        System.out.println();
        System.out.println("        --Truck Number  : "+this.vehicleNumber);
        System.out.println("        --Driver Name   : "+this.driverName);
        System.out.println("        --Helper Name   : "+this.helperName);
        System.out.println("        --Load capacity : "+this.loadCapacity +" Tons");
        System.out.println();
    }
    public boolean isCapacityAvailable(int num){
        return (this.loadCapacity >= num);
    }
    public boolean isCapacityAvailable(){
        return (this.loadCapacity > 0);
    }
    public int getLoadCapacity() {
        return (this.loadCapacity);
    }
}
