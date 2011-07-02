'''
Created on Jul 1, 2011

@author: aj
'''

class PrimeFactors():
    
    '''
    generates prime factors for given integer
    improve performance by jumping all multiples of already tested numbers
    ie: if num is not divisible by 2, it won't be divisible by any multiple of 2
    '''
    @staticmethod
    def isPrime(num):
        for i in range(2,int(num/2)+1):
            if num%i == 0: return False
        return True
    
    @staticmethod
    def generate(num):
        if PrimeFactors.isPrime(num): return [num]
        factors = []
        for i in range(2, int(num/2)+1):
            if num%i==0:
                if PrimeFactors.isPrime(i): 
                    factors.append(i)
                factors.extend( PrimeFactors.generate(num/i) )
                break
        return factors