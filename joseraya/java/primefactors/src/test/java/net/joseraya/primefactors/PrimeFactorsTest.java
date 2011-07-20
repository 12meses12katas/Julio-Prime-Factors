package net.joseraya.primefactors;

import java.util.List;

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
		result = generate(number);
		assertEquals("A prime results in a single result list", 1, result.size());
		assertEquals("A prime contains itself", number, result.get(0));
	}

}
