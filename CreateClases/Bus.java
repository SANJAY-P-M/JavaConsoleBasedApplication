public class Bus {
    static int numberOfBuses;
    static void showNumberOfBuses(){
        System.out.print(numberOfBuses);
    }
    protected int busNumber;
    protected int availableSeats;
    protected int totalNumberOfSeats;
    protected int bookedSeats;
    protected String driverName = "No driver allocated" ;
    protected String conductorName = "No conductor allocated";
    public Bus(int totalNumberOfSeats,String driverName,String conductorName){
        numberOfBuses++;
        this.busNumber = numberOfBuses;
        this.totalNumberOfSeats = totalNumberOfSeats;
        this.driverName = driverName;
        this.conductorName = conductorName;
        this.availableSeats = totalNumberOfSeats;
    }
    public Bus(int num){
        numberOfBuses++;
        this.busNumber = numberOfBuses;
        this.totalNumberOfSeats = num;
        this.availableSeats = this.totalNumberOfSeats;
    }
    public Bus(){
        numberOfBuses++;
        this.busNumber = numberOfBuses;
        this.totalNumberOfSeats = 100;
        this.availableSeats = this.totalNumberOfSeats;
    }
    public void printAllDetails(){
        System.out.println();
        System.out.println("        --Bus Number                        : "+this.busNumber);
        System.out.println("        --Driver Name                       : "+this.driverName);
        System.out.println("        --Conductor Name                    : "+this.conductorName);
        System.out.println("        --Total no of seats in bus          : "+this.totalNumberOfSeats);
        System.out.println("        --Total no of booked seats in bus   : "+this.bookedSeats);
        System.out.println("        --Total no of available seats in bus: "+this.availableSeats);
        System.out.println();
    }
    public void setDriverName(String name){
        this.driverName = name;
    }
    public void setConductorName(String name){
        this.conductorName = name;
    }
    public int isSeatAvailable(){
        return this.availableSeats;
    }
    public boolean isSeatAvailable(int num){
        return (availableSeats >= num);
    }
    public void bookSeat(int num){
        if(this.isSeatAvailable(num)){
            this.availableSeats -= num;
            this.bookedSeats += num;
        }
        else
            System.out.println("Sorry doode available seats = "+this.availableSeats);
    }
}