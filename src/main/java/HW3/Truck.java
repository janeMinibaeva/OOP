package HW3;

public class Truck extends GroundTransport {
    private int capacity;

    public Truck(String name, int quantityPas, String sphere, int capacity) {
        super(name, quantityPas, sphere);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void toTransportCargo(TransportedCargo cargo){
        System.out.printf("%s the cargo is delivered to", cargo.getNameCargo());
    }
}
