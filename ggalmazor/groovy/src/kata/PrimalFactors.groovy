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
		if (q.isGreaterThan(n.squareRoot()))
			return n
		return q.nextOdd()
	}

	private static addMethodsToBigInteger() {
		BigInteger.metaClass.isFactorOf = { 
			number -> number % delegate == 0 
		}
		BigInteger.metaClass.isGreaterThan = { 
			number -> delegate > number 
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
