                                    /* HIERARCHICAL + MULTILEVEL INHERITANCE = HYBRID INHERITANCE  */
public class Bus extends Vehicle implements FourWheelerTravelTransport{ // Bus Implements FourWheelerTravelTransport
    static int numberOfBuses;
    private int bookedSeats;
    private int totalNumberOfSeats;
    static int showNumberOfBuses(){
        return numberOfBuses;
    }
    public Bus(int totalNumberOfSeats,String driverName,String helperName){
        super(driverName,helperName);
        numberOfBuses++;
        this.vehicleNumber = numberOfBuses;
        this.totalNumberOfSeats = totalNumberOfSeats;
    }
    public Bus(int num){
        numberOfBuses++;
        helperName = "No helper allocated";
        this.vehicleNumber = numberOfBuses;
        this.totalNumberOfSeats = num;
    }
    public Bus(){
        super();                    /*It is a optional line added default during compile time */
        helperName = "No helper allocated";
        numberOfBuses++;
        this.vehicleNumber = numberOfBuses;
        this.totalNumberOfSeats = 100;
    }
    public void printAllDetails(){
        System.out.println();
        System.out.println("        --Bus Number                        : "+this.vehicleNumber);
        System.out.println("        --Driver Name                       : "+this.driverName);
        System.out.println("        --helper Name                    : "+this.helperName);
        System.out.println("        --Total no of seats in bus          : "+this.totalNumberOfSeats);
        System.out.println("        --Total no of booked seats in bus   : "+this.bookedSeats);
        System.out.println("        --Total no of available seats in bus: "+(this.totalNumberOfSeats - this.bookedSeats));
        System.out.println();
    }
    @Override
    public int getAvailableSeats(){
        return (this.totalNumberOfSeats - this.bookedSeats) ;
    }
    public boolean isSeatAvailable(int num){
        return ((this.totalNumberOfSeats - this.bookedSeats) >= num);
    }
    public void bookSeat(int num){
        if(this.isSeatAvailable(num)){
            this.bookedSeats += num;
        }
        else
            System.out.println("Sorry doode available seats = "+(this.totalNumberOfSeats - this.bookedSeats));
    }
}