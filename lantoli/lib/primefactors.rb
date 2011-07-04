class PrimeFactors

  def self.generate number
      factors = []
      limit = Math.sqrt number   # performance tip
      (2..limit).each do |n|
        while (number % n == 0)
          number /= n
          factors << n
        end
      end
      factors << number unless number < limit
      factors
  end

end

