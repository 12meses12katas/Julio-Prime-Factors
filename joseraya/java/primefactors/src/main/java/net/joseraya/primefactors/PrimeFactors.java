package net.joseraya.primefactors;

import java.util.LinkedList;
import java.util.List;

public class PrimeFactors {
	public static List<Integer> generate(Integer source) {
		if (source<2) {
			throw new IllegalArgumentException("The number " + source + "cannot be decomposed in primes");
		}
		List<Integer> result = new LinkedList<Integer>();
		result.add(source);
		return result;
	}
}
