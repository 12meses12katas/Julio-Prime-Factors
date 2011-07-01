class PrimeFactors

  def self.generate number
      factors = []
      partial = number
      (2..number).each do |n|
        while (partial % n == 0)
          partial /= n
          factors << n
        end
      end
      factors
  end

end

