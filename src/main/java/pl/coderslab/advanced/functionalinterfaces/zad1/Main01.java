package pl.coderslab.advanced.functionalinterfaces.zad1;

import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        List<Integer> ints=List.of(1,5,50,21,15);
//        4. W metodzie main klasy `Main01` wywołaj metodę `printList` wykorzystując:
//        - obiekt klasy `IntegerFilter`
        printList(ints,new IntegerFilter());

        //                - klasę anonimową
        System.out.println("ex2");
        printList(ints, new Filter<Integer>() {
            @Override
            public boolean check(Integer e) {
                return e < 20;
            }
        });

//                - wyrażenie lambda (szczegółowo wyrażenia zostaną omówione w następnym module,
//                istotne jest zobrazowanie uproszczenia kodu)
        System.out.println("ex3");
        printList(ints, e -> e < 20);


    }

    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }
}
