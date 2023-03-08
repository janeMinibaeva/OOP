package HW3;

public class AirTransport extends Transport {

    private String sphere;
    private double range;
    private int flightAltitude;

    public AirTransport(String name, int quantityPas, String sphere, double range, int flightAltitude) {
        super(name, quantityPas);
        this.sphere = sphere;
        this.range = range;
        this.flightAltitude = flightAltitude;
    }


    public String getSphere() {
        return sphere;
    }

    public void setSphere(String sphere) {
        this.sphere = sphere;
    }


    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }
}
