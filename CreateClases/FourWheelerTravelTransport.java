public interface FourWheelerTravelTransport {
    public int getAvailableSeats();
    public boolean isSeatAvailable(int num);
    public void bookSeat(int num);
}