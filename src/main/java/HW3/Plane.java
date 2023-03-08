package HW3;

public class Plane extends AirTransport{

    private int numberOfSeats;

    public Plane(String name, int quantityPas, String sphere, double range, int flightAltitude, int numberOfSeats) {
        super(name, quantityPas, sphere, range, flightAltitude);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }



}
