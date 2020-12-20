package pl.coderslab.advanced.stream.zad2;

//## Zadanie 2 - rozwiązywane z wykładowcą
//
//        2. Napisz program, który będzie posiadał klasę reprezentującą pracownika `Employee`, zawierającą atrybuty takie jak `imię`, `nazwisko`, `płeć`, `data urodzenia`, `wysokość wynagrodzenia`.
//        Utwórz kilka obiektów klasy `Employee`, a następnie:
//        - wypisz na ekranie wszystkich pracowników, których nazwisko zaczyna się na literę „N”
//        - wypisz na ekranie wszystkich pracowników, którzy są w wieku między 30 a 45 lat
//        - daj 5% podwyżki wszystkim kobietom, które są w wieku między 20 a 30 lat, a ich wynagrodzenie jest nie wyższe niż 3500 zł.
//


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Zad2 {
    public static void main(String[] args) {
        final List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anna", "Annowska", "female", LocalDate.of(1999,1,1), 2500.));
        employees.add(new Employee("Roman", "Nawałka", "male", LocalDate.of(1980,1,1), 3600.));
        employees.add(new Employee("Krzysztof", "Noga", "male", LocalDate.of(1963,1,1), 2000.));
        employees.add(new Employee("Katarzyna", "Lew", "female", LocalDate.of(1947,1,1), 3400.));

        System.out.println("ad 1");
//        - wypisz na ekranie wszystkich pracowników,
//        których nazwisko zaczyna się na literę „N”
        employees.stream()
                .filter(e -> e.getLastName().startsWith("N"))
                .forEach(System.out::println);

//        - wypisz na ekranie wszystkich pracowników, którzy są w wieku między 30 a 45 lat
        System.out.println("ad 2");
        employees.stream()
                .filter(e -> LocalDate.now().getYear() - e.getBirthDate().getYear() > 29 &&
                             LocalDate.now().getYear() - e.getBirthDate().getYear() < 46)
                .forEach(System.out::println);
//        - daj 5% podwyżki wszystkim kobietom,
//        które są w wieku między 20 a 30 lat,
//        a ich wynagrodzenie jest nie wyższe niż 3500 zł.
//
        System.out.println("ad 3");
        employees.stream()
                .filter(e -> e.getSex().equals("female"))
                .filter(e -> LocalDate.now().getYear() - e.getBirthDate().getYear() > 19 &&
                        LocalDate.now().getYear() - e.getBirthDate().getYear() < 31)
                .filter(e -> e.getSalary() <= 3500.)
                .forEach(e -> e.setSalary(e.getSalary()*1.05));

        employees.stream()
                .forEach(System.out::println);
    }
}
