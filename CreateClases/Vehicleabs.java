                                                /*   ABSTRACT CLASS   */
public abstract class Vehicleabs {
    public Vehicleabs(){
        this.setDriverName("No driver Allocated");
    }
    public Vehicleabs(String driverName,String helperName){
        this.setDriverName(driverName);
        this.setHelperName(helperName);
    }
    protected String driverName;
    protected int vehicleNumber;
    protected String helperName;
    abstract void setDriverName(String name);               /*  ABSTRACT METHODS    */
    abstract void setHelperName(String name);
    abstract String getDriverName();
    abstract String getHelperName();
}
