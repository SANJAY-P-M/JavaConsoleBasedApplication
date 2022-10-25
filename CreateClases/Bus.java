public class Bus extends Vehicle{
    static int numberOfBuses;
    private int availableSeats;
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
        this.availableSeats = totalNumberOfSeats;
    }
    public Bus(int num){
        numberOfBuses++;
        helperName = "No helper allocated";
        this.vehicleNumber = numberOfBuses;
        this.totalNumberOfSeats = num;
        this.availableSeats = this.totalNumberOfSeats;
    }
    public Bus(){
        super();
        helperName = "No helper allocated";
        numberOfBuses++;
        this.vehicleNumber = numberOfBuses;
        this.totalNumberOfSeats = 100;
        this.availableSeats = this.totalNumberOfSeats;
    }
    public void printAllDetails(){
        System.out.println();
        System.out.println("        --Bus Number                        : "+this.vehicleNumber);
        System.out.println("        --Driver Name                       : "+this.driverName);
        System.out.println("        --helper Name                    : "+this.helperName);
        System.out.println("        --Total no of seats in bus          : "+this.totalNumberOfSeats);
        System.out.println("        --Total no of booked seats in bus   : "+this.bookedSeats);
        System.out.println("        --Total no of available seats in bus: "+this.availableSeats);
        System.out.println();
    }
    public int getAvailableSeats(){
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