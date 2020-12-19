package pl.coderslab.advanced.abstractclass.zad1;

public class Train extends Vehicle {
    private int trackWidth;

    public Train(int maxSpeed, String model, int trackWidth) {
        super(maxSpeed, model);
        this.trackWidth = trackWidth;
    }

    public int getTrackWidth() {
        return trackWidth;
    }

    public Train setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
        return this;
    }
}
