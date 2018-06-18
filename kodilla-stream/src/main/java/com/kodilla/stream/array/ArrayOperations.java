package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
/*      Metoda powinna:
        - przy pomocy strumienia IntStream oraz metody range(int startInclusive, intendExclusive)
          wyświetlić kolejne elementy tablicy,
        - przy pomocy drugiego strumienia IntStream oraz metody range(int startInclusive,int endExclusive),
          a także kolektora average() obliczyć średnią,
        - na końcu metoda powinna zwracać średnią jako wynik typu double
*/

        IntStream.range(0, numbers.length)
                .map(num -> numbers[num])
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length)
                .map(num -> numbers[num])
                .average().getAsDouble();
        return average;
    }
}
