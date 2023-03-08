package HW3;

public class GroundTransport extends Transport {

    private String sphere;

    public String getSphere() {
        return sphere;
    }

    public void setSphere(String sphere) {
        this.sphere = sphere;
    }

    public GroundTransport(String name, int quantityPas, String sphere) {
        super(name, quantityPas);
        this.sphere = sphere;
    }

    public void toTax(String A, String B){
        System.out.printf("%s goes from point %s to point %s", super.getName(),A,B);
    }
}
