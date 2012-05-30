package test.com.sortega.primefactors;

import com.sortega.primefactors.PrimeFactors;
import org.junit.Before;
import org.junit.Test;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class PrimeFactorsTest {

    @Before
    public void setUpClass() throws Exception {
    }

    @Test
    public void oneIsFactoredByOne() {
        assertEquals(asList(), PrimeFactors.generate(1));
    }

    @Test
    public void twoIsFactoredByItself() {
        assertEquals(asList(2), PrimeFactors.generate(2));
    }
    
    @Test
    public void threeIsFactoredByItself() {
        assertEquals(asList(3), PrimeFactors.generate(3));
    }

    @Test
    public void fourIsFactoredByTwo() {
        assertEquals(asList(2, 2), PrimeFactors.generate(4));
    }

    @Test
    public void sixIsFactoredByTwoAndThree() {
        assertEquals(asList(2, 3), PrimeFactors.generate(6));
    }

    @Test
    public void factorsOf27() {
        assertEquals(asList(3, 3, 3), PrimeFactors.generate(27));
    }

    @Test
    public void factorsOf30() {
        assertEquals(asList(2, 3, 5), PrimeFactors.generate(30));
    }
}