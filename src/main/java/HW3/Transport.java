package HW3;

public class Transport {
    private String name;
    private int quantityPas;

    public Transport(String name, int quantityPas) {
        this.name = name;
        this.quantityPas = quantityPas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityPas() {
        return quantityPas;
    }

    public void setQuantityPas(int quantityPas) {
        this.quantityPas = quantityPas;
    }


}
