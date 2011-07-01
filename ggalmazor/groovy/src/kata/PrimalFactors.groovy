package kata

class PrimalFactors {
	static of(n) {
		def factors = []
		def q = 2
		while(n > 1) {
			while (n.toInteger() % q.toInteger() == 0) {
				factors << q
				n /= q
			}
			if (q > Math.sqrt(n))
				q = n-1
			q++
		}
		factors
	}
}
