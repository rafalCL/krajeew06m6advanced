package pl.coderslab.advanced.optional;


import java.util.HashMap;
import java.util.Optional;

//1. Uzupełnij implementację metody klasy `AddressBook`.
//        ```Optional<String> findNameByAddress(String phoneNumber)```
//        tak by dla zadanego adresu zwróciła odpowiedniego użytkownika.
//        2. Zachowaj istniejącą sygnaturę metody.

public class AddressBook {

    private static final HashMap<String, String> phoneBookEntries = new HashMap<>();

    public AddressBook() {
        phoneBookEntries.put("Jan Kowalski", "Kraków Polna 11");
        phoneBookEntries.put("Marek Marecki", "016/161617");
    }


    public Optional<String> findAddressByName(String name) {
        return null;
    }

    public Optional<String> findNameByAddress(String address) {
        return this.phoneBookEntries.entrySet().stream()
                .filter(e -> e.getValue().equals(address))
                .map(e -> e.getKey())
                .findAny();
    }
}
