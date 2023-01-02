public class Ticket {
    private int seatNo;
    private String ticketCode;
    private boolean bookedStatus;
    Ticket(int busNO,int seatNo){
        this.seatNo = seatNo;
        ticketCode = new String(String.format("bus%doneseat%d",busNO,seatNo));
        bookedStatus = false;
    }
    public int getSeatNo() {
        return seatNo;
    }
    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
    public String getTicketCode() {
        return ticketCode;
    }
    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }
    public boolean isBooked(){
        return bookedStatus;
    }
    public void book(){
        bookedStatus = true;
    }
}
