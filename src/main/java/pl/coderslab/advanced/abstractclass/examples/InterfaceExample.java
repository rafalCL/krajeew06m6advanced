package pl.coderslab.advanced.abstractclass.examples;

interface Vehicle{
    void drive(double distanceInKm);
}

interface Plane {
    void fly(double distanceInNM);
}

interface Ufo extends Vehicle, Plane {
    void flyInSpace(double distanceInLightYears);
}

class UfoFromMars implements Ufo{

    @Override
    public void drive(double distanceInKm) {

    }

    @Override
    public void fly(double distanceInNM) {

    }

    @Override
    public void flyInSpace(double distanceInLightYears) {

    }
}

class Car implements Vehicle{

    @Override
    public void drive(double distanceInKm) {

    }
}

abstract class Airbus implements Plane {

}

class AirbusA320 extends Airbus {

    @Override
    public void fly(double distanceInNM) {

    }
}

public class InterfaceExample {
}
