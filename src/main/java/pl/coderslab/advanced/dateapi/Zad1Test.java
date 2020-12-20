package pl.coderslab.advanced.dateapi;

import pl.coderslab.advanced.optional.AddressBook;

public class Zad1Test {
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        System.out.println(ab.findNameByAddress("Kraków Polna 11").orElse("not found"));
    }
}
