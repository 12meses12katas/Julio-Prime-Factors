package net.joseraya.primefactors;

import java.util.List;

import org.fest.util.Collections;
import org.junit.Test;
import static net.joseraya.primefactors.PrimeFactors.*;
import static org.junit.Assert.*;
public class PrimeFactorsTest {

	List<Integer> result;
	@Test(expected=IllegalArgumentException.class)
	public void should_reject_zero() {
		result = generate(0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void should_reject_one() {
		result = generate(1);
	}

	@Test
	public void a_prime_should_return_itself() {
		Integer number = 2;
		List<Integer> expected = Collections.list(2);
		result = generate(number);
		assertEquals(expected, result);
	}

	@Test
	public void a_decomposable_number_should_be_decomposed() {
		Integer number = 6;
		List<Integer> expected = Collections.list(2,3);
		result = generate(number);
		assertEquals(expected, result);
	}
	
	@Test
	public void primes_should_be_repeated_if_needed() {
		Integer number = 36;
		List<Integer> expected = Collections.list(2,2,3,3);
		result = generate(number);
		assertEquals(expected, result);
	}
}
