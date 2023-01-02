import java.util.ArrayList;
import java.util.Iterator;

/* HIERARCHICAL + MULTILEVEL INHERITANCE = HYBRID INHERITANCE  */
public class Bus extends Vehicle implements FourWheelerTravelTransport{ // Bus Implements FourWheelerTravelTransport
    static int numberOfBuses;
    private int bookedSeats;
    private int totalNumberOfSeats;
    private ArrayList<Ticket> tickets = new ArrayList<>();
    public Bus(int totalNumberOfSeats,String driverName,String helperName){
        super(driverName,helperName);
        numberOfBuses++;
        this.vehicleNumber = numberOfBuses;
        this.totalNumberOfSeats = totalNumberOfSeats;
        for(int i = 1;i <= totalNumberOfSeats;i++)
            tickets.add(new Ticket(this.vehicleNumber,i));
    }
    public Bus(int totalNumberOfSeats){
        numberOfBuses++;
        helperName = "No helper allocated";
        this.vehicleNumber = numberOfBuses;
        this.totalNumberOfSeats = totalNumberOfSeats;
        for(int i = 1;i <= totalNumberOfSeats;i++)
            tickets.add(new Ticket(this.vehicleNumber,i));
    }
    public Bus(){
        super();                    /*It is a optional line added default during compile time */
        helperName = "No helper allocated";
        numberOfBuses++;
        this.vehicleNumber = numberOfBuses;
        this.totalNumberOfSeats = 20;
        for(int i = 1;i <= 20;i++)
            tickets.add(new Ticket(this.vehicleNumber,i));
    }
    @Override //Overriding abstract method from vehicle
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
    @Override       //Implements FourWheelerTravelTransport interface
    public int getAvailableSeats(){
        return (this.totalNumberOfSeats - this.bookedSeats) ;
    }
    public boolean isSeatAvailable(int num){
        return ((this.totalNumberOfSeats - this.bookedSeats) >= num);
    }
    public void bookSeat(int num[]){
        for(int i = 0;i < num.length;i++){
            Iterator<Ticket> iterator = tickets.iterator();
                while(iterator.hasNext()){
                    Ticket temp = iterator.next();
                    if(temp.getSeatNo() == num[i]){
                        if(!temp.isBooked()){
                            System.out.printf("             Your ticket code is \"%s\" for seat number %d%n",temp.getTicketCode(),num[i]);
                            temp.book();
                            break;
                        }
                        else
                            System.out.println("             Seat number "+ num[i] +" ticket is already booked");
                    }
                }
        }
        System.out.printf("             \"Do not share your ticket codes!\"");
    }
    public int getSeatNoWithTicketCode(String ticketCode){
        Iterator<Ticket> iterator = tickets.iterator();
        while (iterator.hasNext()) {
            Ticket temp = iterator.next();
            if(temp.getTicketCode().equals(ticketCode))
                return temp.getSeatNo();
            }
        return -1;
    }
}