package pl.coderslab.advanced.abstractclass.zad1;

public abstract class Vehicle {
    private int maxSpeed;
    private String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Vehicle setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Class : %s, model: %s, speed: %s.",
                this.getClass().getSimpleName(),
                this.model,
                this.maxSpeed);
    }
}
