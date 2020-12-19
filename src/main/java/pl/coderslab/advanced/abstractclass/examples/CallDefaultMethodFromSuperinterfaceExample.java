package pl.coderslab.advanced.abstractclass.examples;

interface Vehicle1{
    default void m(){}
}

interface Plane1 {

    default void m(){}
}

interface Ufo1 extends Vehicle1, Plane1 {
    int THE_ANSWER = 42; // always static final

    default void m(){
        Plane1.super.m();
    }
    static void emitSound(){
        int i = THE_ANSWER;
    }
    void abstractMethod();
}

public class CallDefaultMethodFromSuperinterfaceExample {
    public static void main(String[] args) {
        Ufo1.emitSound();
    }
}
