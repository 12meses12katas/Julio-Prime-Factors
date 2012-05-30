package kata

import org.junit.Test
import static org.junit.Assert.assertThat
import static org.hamcrest.CoreMatchers.*

class PrimalFactorsTest {

	@Test
	void should_factor_numbers() {
		[
			[1, []],
			[2, [2]],
			[3, [3]],
			[4, [2,2]],
			[5, [5]],
			[6, [2,3]],
			[7, [7]],
			[8, [2,2,2]],
			[9, [3,3]],
			[2*3*5*7*11*13, [2,3,5,7,11,13]],
			[2**100, [2]*100],
			[8191*131071, [8191,131071]],
			[2**19-1, [2**19-1]],
			[2**31-1, [2**31-1]]
		].each {
			def n = it[0]; 
			def expected = it[1] as int[]
			def actual = PrimalFactors.of(n) as int[]
			assertThat actual, is(expected)
		}
	}

}
