package net.joseraya.primefactors;

import java.util.List;

import org.fest.util.Collections;

public class PrimeFactors {
	public static List<Integer> generate(Integer source) {
		if (source<2) {
			throw new IllegalArgumentException("The number " + source + "cannot be decomposed in primes");
		}
		List<Integer> result = Collections.list();
		int primeToTest = 2;
		while(primeToTest <= source) {
			while (source % primeToTest == 0) {
				result.add(primeToTest);
				source = source / primeToTest;
			}
			primeToTest++;
		}
		return result;
	}
}
