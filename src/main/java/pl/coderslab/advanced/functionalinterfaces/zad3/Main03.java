package pl.coderslab.advanced.functionalinterfaces.zad3;

import pl.coderslab.advanced.functionalinterfaces.zad1.Filter;
import pl.coderslab.advanced.functionalinterfaces.zad1.IntegerFilter;

import java.util.ArrayList;
import java.util.List;

public class Main03 {
    public static void main(String[] args) {
        List<Integer> ints=List.of(1,5,50,21,15);

        List<Integer> result1 = create(ints, new IntegerFilter(), new IntegerTransform());
        System.out.println(result1.toString());
        System.out.println("with lambdas");
        List<Integer> result2 = create(ints, e -> e < 20, e -> e - 1);
        System.out.println(result2.toString());

    }

    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<S, T> t) {
        List<T> result = new ArrayList<>();
        for (S s : src) {
            if (f.check(s)) {
                result.add(t.transform(s));
            }
        }

        return result;
    }
}
