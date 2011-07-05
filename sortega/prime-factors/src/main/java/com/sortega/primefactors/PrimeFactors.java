package com.sortega.primefactors;

import java.util.LinkedList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        List<Integer> factors = new LinkedList<Integer>();

        int candidate = 2;
        while (candidate <= number) {
            if (divisibleBy(number, candidate)) {
                factors.add(candidate);
                number /= candidate;
            } else {
                candidate++;
            }
        }
        
        return factors;
    }

    private static boolean divisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
