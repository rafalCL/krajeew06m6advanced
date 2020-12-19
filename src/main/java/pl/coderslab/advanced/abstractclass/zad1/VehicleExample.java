package pl.coderslab.advanced.abstractclass.zad1;

public class VehicleExample {
    public static void main(String[] args) {
        Car car = new Car(320,"Veyron", "Sport Car");
        Train strzalaPoludnia = new Train(60, "Made in PRL", 1410);

        Vehicle[] vehicles = {car, strzalaPoludnia};

        for (Vehicle v : vehicles){
            System.out.println(v.toString());
        }
    }
}
