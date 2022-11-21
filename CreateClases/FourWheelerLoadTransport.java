public interface FourWheelerLoadTransport {
    public boolean isCapacityAvailable();
    //Overloading isCapacityAvailable
    public boolean isCapacityAvailable(int num);
    public int getLoadCapacity();
}