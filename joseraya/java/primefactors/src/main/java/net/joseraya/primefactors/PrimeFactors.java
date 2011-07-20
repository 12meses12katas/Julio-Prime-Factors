package net.joseraya.primefactors;

import java.util.List;

import org.fest.util.Collections;

public class PrimeFactors {
	
	public static List<Integer> generate(Integer source) {
		if (source<2) {
			throw new IllegalArgumentException("The number " + source + "cannot be decomposed in primes as it is too small");
		}
		return generatePrimeFactors(source);
	}

	private static List<Integer> generatePrimeFactors(Integer numberToDecompose) {
		List<Integer> result = Collections.list();
		int numberToTest = 2;
		while(numberToTest <= numberToDecompose && numberToDecompose > 0) {
			while (numberToDecompose % numberToTest == 0) {
				result.add(numberToTest);
				numberToDecompose = numberToDecompose / numberToTest;
			}
			numberToTest++;
		}
		return result;
	}
}
