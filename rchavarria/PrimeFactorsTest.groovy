import static org.junit.Assert.*;

import org.junit.Test 


class PrimeFactorsTest {
    
    def primeFactors = new PrimeFactors()
    
    @Test
    public void one(){
        assert []== primeFactors.generate(1)
    }
    
    @Test
    public void two(){
        assert [2]== primeFactors.generate(2)
    }
    
    @Test
    public void three(){
        assert [3]== primeFactors.generate(3)
    }
    
    @Test
    public void four(){
        assert [2, 2]== primeFactors.generate(4)
    }
    
    @Test
    public void five(){
        assert [5]== primeFactors.generate(5)
    }
    
    @Test
    public void six(){
        assert [2, 3]== primeFactors.generate(6)
    }
    
    @Test
    public void seven(){
        assert [7]== primeFactors.generate(7)
    }
    
    @Test
    public void eight(){
        assert [2]*3== primeFactors.generate(8)
    }
    
    @Test
    public void nine(){
        assert [3]*2== primeFactors.generate(9)
    }
    
    @Test
    public void ten(){
        assert [2, 5]== primeFactors.generate(10)
    }
    
    @Test
    public void testGreaterThanTen() {
        [
            [11, [11]],
            [12, [2, 2, 3]],
            [13, [13]],
            [14, [2, 7]],
            [15, [3, 5]],
            [16, [2, 2, 2, 2]],
            [17, [17]],
            [18, [2, 3, 3]],
            [19, [19]],
            [20, [2, 2, 5]],
            [21, [3, 7]],
            [22, [2, 11]],
            [23, [23]],
            [24, [2, 2, 2, 3]],
            [25, [5, 5]],
            [26, [2, 13]],
            [27, [3, 3, 3]],
            [28, [2, 2, 7]],
            [29, [29]],
            [30, [2, 3, 5]],
            [
                2*3*5*7*11*13,
                [
                    2,
                    3,
                    5,
                    7,
                    11,
                    13]
            ],
            [2**19-1, [2**19-1]],
            [8191*131071, [8191, 131071]],
            [2**31-1, [2**31-1]],
            [2**100, [2]*100]
        ].each {
            def n = it[0]; 
            def expected = it[1] as int[]
            if(n>100) println "computing : ${n}"
            def actual = primeFactors.generate(n) as int[]
            assert actual == expected
        }
    }
}
