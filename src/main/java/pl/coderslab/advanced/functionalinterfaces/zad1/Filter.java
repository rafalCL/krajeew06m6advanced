package pl.coderslab.advanced.functionalinterfaces.zad1;

@FunctionalInterface
public interface Filter<V> {
    boolean check(V e);
}
