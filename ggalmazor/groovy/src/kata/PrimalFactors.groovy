package kata

class PrimalFactors {
	static of(BigInteger number) {
		addMethodsToBigInteger();
		Collection<BigInteger> factors = []
		BigInteger quotient = 2
		while(number > 1) {
			while (quotient.isFactorOf(number)) {
				factors << quotient
				number /= quotient
			}
			quotient = getNextQuotient(quotient, number)
		}
		factors
	}

	private static int getNextQuotient(q, n) {
		return (q.isGreaterThan(n.squareRoot())) ? n : q.nextOdd()
	}

	private static addMethodsToBigInteger() {
		BigInteger.metaClass.isFactorOf = { number -> 
			number % delegate == 0 
		}
		BigInteger.metaClass.isGreaterThan = { number -> 
			delegate > number 
		}
		BigInteger.metaClass.squareRoot = { 
			Math.sqrt(delegate) 
		}
		BigInteger.metaClass.nextOdd = { 
			delegate.isEven() ? delegate + 1 : delegate + 2 
		}
		BigInteger.metaClass.isEven = { 
			delegate % 2 == 0 
		}
	}
}
