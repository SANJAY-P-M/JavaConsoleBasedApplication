public class Vehicle extends Vehicleabs{
    public Vehicle(){
        super();
    }
    public Vehicle(String driverName,String helperName){
        super(driverName, helperName);
    }
    void setDriverName(String a){
        this.driverName = a;
    }
    String getDriverName() {
        return driverName;
    }
    void setHelperName(String a){
        this.helperName = a;
    }
    String getHelperName() {
        return this.helperName;
    }
}