package pl.coderslab.advanced.lambda.zad1;

//1. Napisz program, który:
//        - pobierze od użytkownika n łańcuchów znaków
//        - umieści je w liście
//        - posortuje alfabetycznie
//        - wyświetli na ekranie.
//        Do sortowania kolekcji należy użyć wyrażenie lambda.

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź napis i naciśnij <enter>. Pusty napis zakończy wprowadzanie.");
        String input = scan.nextLine();
        while (!input.equals(""))
        {
            inputs.add(input);
            System.out.println("Wprowadź napis i naciśnij <enter>. Pusty napis zakończy wprowadzanie.");
            input = scan.nextLine();
        }

        inputs.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println(inputs.toString());
    }
}
