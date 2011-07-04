class PrimeFactors

  def self.generate number
      factors = []
      limit = Math.sqrt(number).to_i   # performance tip: go up to square root
      candidate = 2
      while candidate <= limit
        if candidate.factor_of? number
          factors << candidate
          number /= candidate
        else
          candidate = (candidate==2) ? 3 : candidate + 2 # performance tip: only odd candidates
        end
      end
      factors << number unless number <= limit # performance tip
      factors
  end

end

class Integer
  def factor_of? number
    number % self == 0
  end
end