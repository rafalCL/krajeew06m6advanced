package pl.coderslab.advanced.functionalinterfaces.zad3;

@FunctionalInterface
public interface Transform<S, T> {
    T transform(S s);
}
