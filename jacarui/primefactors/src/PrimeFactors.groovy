
class PrimeFactors {

	int[] generate(int number) {
		def primeFactors = []
		def multiples = 2..number
		def iterator = multiples.iterator()
		def multiple = iterator.next()
		
		while (number > 1) {			
			if (isPrimeFactor(number, multiple)) {
				primeFactors << multiple
				number = number.intdiv(multiple)
			} else {
				multiple = iterator.next()
			}
		}
					
		primeFactors
	}
	
	private isPrimeFactor(number, factor) {
		number % factor == 0
	}

}
