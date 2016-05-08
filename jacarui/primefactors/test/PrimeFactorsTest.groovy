import org.junit.Before
import org.junit.Test

class PrimeFactorsTest extends GroovyTestCase {
	def generator
	def primeFactors
	
	@Before
	void setUp() {
		generator = new PrimeFactors()		
	}
	
	@Test
	void testTwoPrimeFactor() {
		assertEquals generator.generate(2).toString(), [2].toString()
	}
	
	@Test
	void testTenPrimeFactors() {
		assertEquals generator.generate(10).toString(), [2,5].toString()
	}
	
	@Test
	void testMultipleOfTwo() {
		assertEquals generator.generate(256).toString(), [2,2,2,2,2,2,2,2].toString()
	}
	
	@Test
	void testMultipleOfEleven() {
		assertEquals generator.generate(33).toString(), [3,11].toString()
	}
	
	@Test
	void testComplexPrimeFactors() {
		assertEquals generator.generate(143).toString(), [11,13].toString()
	}
}