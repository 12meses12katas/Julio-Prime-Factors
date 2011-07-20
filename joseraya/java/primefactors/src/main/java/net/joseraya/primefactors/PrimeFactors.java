package net.joseraya.primefactors;

import java.util.List;

import org.fest.util.Collections;

public class PrimeFactors {
	public static List<Integer> generate(Integer source) {
		if (source<2) {
			throw new IllegalArgumentException("The number " + source + "cannot be decomposed in primes");
		}
		List<Integer> result = Collections.list();
		if (source%2==0) {
			result.add(2);
			source = source/2;
		}
		if (source%3==0) {
			result.add(3);
			source = source/3;
		}
		return result;
	}
}
