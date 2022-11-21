                                            /*   SINGLE LEVEL INHERITANCE    */
public abstract class Vehicle{
    protected String driverName;
    protected int vehicleNumber;
    protected String helperName;
    public Vehicle(){
        this.setDriverName("No driver Allocated");
    }
    public Vehicle(String driverName,String helperName){
        this.setDriverName(driverName);
        this.setHelperName(helperName);           
    }
    public void setDriverName(String a){                         
        this.driverName = a;
    }
    public String getDriverName() {
        return driverName;
    }
    public void setHelperName(String a){
        this.helperName = a;
    }
    public String getHelperName() {
        return this.helperName;
    }
    abstract void printAllDetails();
}