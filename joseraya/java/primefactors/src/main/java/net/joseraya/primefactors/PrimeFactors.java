package net.joseraya.primefactors;

import java.util.List;

import org.fest.util.Collections;

public class PrimeFactors {

	private static final int MINIMUM_FACTOR = 2;

	public static List<Integer> generate(Integer source) {
		if (source < MINIMUM_FACTOR) {
			throw new IllegalArgumentException("The number " + source
					+ "cannot be decomposed in primes as it is too small");
		}
		return generatePrimeFactors(source);
	}

	private static List<Integer> generatePrimeFactors(Integer numberToDecompose) {
		List<Integer> result = Collections.list();
		int remaining = numberToDecompose;
		int candidateFactor = MINIMUM_FACTOR;
		while (candidateCouldBeAFactor(candidateFactor, remaining) &&  (remaining >= MINIMUM_FACTOR ) ) {
			while (remaining % candidateFactor == 0) {
				result.add(candidateFactor);
				remaining = remaining / candidateFactor;
			}
			candidateFactor++;
		}
		return result;
	}

	private static boolean candidateCouldBeAFactor(int candidateFactor,
			Integer remaining) {
		if (candidateFactor > remaining) return false;
		return true;
	}
}
