package com.kodilla.stream.person;

public class StreamMain {
    public static void main(String[] args) {

/*  - konwertuje wszystkie nazwiska i imiona na duże litery,
    - wybiera spośród nich te, których długość jest większa niż 11 znaków,
    - usunie nazwiska pozostawiając jedynie pierwszą ich literę, a resztę zastąpi kropką,
    - odfiltruje tylko te obiekty, dla których pierwszą literą imienia jest "M",
    - wyświetli wynik na ekranie.
*/

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".") // pobierane są znaki od początku napisu do spacji (plus dwa znaki - sama spacja oraz pierwsza litera nazwiska), a na końcu dodawana jest kropka
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
    }
}
