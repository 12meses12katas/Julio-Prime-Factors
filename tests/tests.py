'''
Created on Jul 1, 2011

@author: aj
'''
import unittest
from primefactorize import PrimeFactors

class Test(unittest.TestCase):

    def testIsPrime(self):       
        self.assertFalse( PrimeFactors.isPrime(22) )
        self.assertFalse( PrimeFactors.isPrime(15) )
        self.assertFalse( PrimeFactors.isPrime(4) )

    def testGetPrimeFactors(self):
        self.assertEquals( [11], PrimeFactors.generate(11) )
        self.assertEquals( [2,5], PrimeFactors.generate(10) )
        self.assertEquals( [2, 11], PrimeFactors.generate(22) )
        self.assertEquals( [2,2,2,5], PrimeFactors.generate(40) )
        self.assertEquals( [2,2,2,2,5], PrimeFactors.generate(80) )
        self.assertEquals( [2,2,2,2,5,5,5,5], PrimeFactors.generate(10000) )


if __name__ == "__main__":
    #import sys;sys.argv = ['', 'Test.test']
    unittest.main()