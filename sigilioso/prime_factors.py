# -*- coding: utf-8 -*-

class PrimeFactors:

    def is_prime(n):
        p = 2
        while n % p != 0:
            p += 1
        return n == p

    @classmethod
    def generate(cls, n):
        factors = []
        f = 2
        while n > 1:
            if n % f == 0:
                n /= f
                factors.append(f)
            else :
                n += 1

        return factors


