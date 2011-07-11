# -*- coding: utf-8 -*-

import unittest
from prime_factors import PrimeFactors

class TestPrimeFactors(unittest.TestCase):

    def test(self):
        self.assertTrue(set(PrimeFactors.generate(32)), set( [2, 2, 2, 2, 2]))
        self.assertTrue(set(PrimeFactors.generate(81)), set([3, 3, 3, 3]))
        self.assertTrue(set(PrimeFactors.generate(81)), set( [3, 3, 3, 3]))
        self.assertTrue(set(PrimeFactors.generate(7700)), 
                set( [2, 2, 5, 5, 11, 7]))
        self.assertTrue(set(PrimeFactors.generate(1690)),
                set([2, 5, 13, 13]))


unittest.main()
