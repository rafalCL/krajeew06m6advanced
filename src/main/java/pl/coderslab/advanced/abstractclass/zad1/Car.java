package pl.coderslab.advanced.abstractclass.zad1;

public class Car  extends Vehicle {
    private String type;

    public Car(int maxSpeed, String model, String type) {
        super(maxSpeed, model);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Car setType(String type) {
        this.type = type;
        return this;
    }
}
