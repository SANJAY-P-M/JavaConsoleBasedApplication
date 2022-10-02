public class Truck {
    static int numberOfTrucks;
    protected int truckNumber;
    protected String driverName= "No driver allocated";
    protected int loadCapacity;
    public Truck(int load,String driverName){
        numberOfTrucks++;
        this.truckNumber = numberOfTrucks;
        this.driverName = driverName;
        this.loadCapacity = load;
    }
    public Truck(){
        numberOfTrucks++;
        this.truckNumber = numberOfTrucks;
        this.loadCapacity = 10;
    }
    public Truck(int num){
        numberOfTrucks++;
        this.truckNumber = numberOfTrucks;
        this.loadCapacity = num;
    }
    public void printAllDetails(){
        System.out.println();
        System.out.println("        --Truck Number  : "+this.truckNumber);
        System.out.println("        --Driver Name   : "+this.driverName);
        System.out.println("        --Load capacity : "+this.loadCapacity +" Tons");
        System.out.println();
    }
    public void setDriverName(String name){
        this.driverName = name;
    }
    public boolean isCheckCapacity(int num){
        return (this.loadCapacity >= num);
    }
}
