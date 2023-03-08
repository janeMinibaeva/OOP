package HW3;

public class WaterTransport extends Transport {

    private String sphere;

    public String getSphere() {
        return sphere;
    }

    public void setSphere(String sphere) {
        this.sphere = sphere;
    }

    public WaterTransport(String name, int quantityPas, String sphere) {
        super(name, quantityPas);
        this.sphere = sphere;
    }


}
