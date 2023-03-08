package HW3;

public class PassengerAuto extends GroundTransport {
    private String model;
    private String color;
    private int year;
    private double power;

    public PassengerAuto(String name, int quantityPas, String sphere, String model, String color, int year, double power) {
        super(name, quantityPas, sphere);
        this.model = model;
        this.color = color;
        this.year = year;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }




}
