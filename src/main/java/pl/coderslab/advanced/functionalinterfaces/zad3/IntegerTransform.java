package pl.coderslab.advanced.functionalinterfaces.zad3;

public class IntegerTransform implements Transform<Integer, Integer> {
    @Override
    public Integer transform(Integer srcVal) {
        return srcVal - 1;
    }
}
