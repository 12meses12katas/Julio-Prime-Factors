require 'mathn'
class Integer
  def is_factor_of?(integer)
    integer % self == 0
  end
end

class PrimeFactors

  def self.generate(integer)
    factors = []
    limit = Math.sqrt(integer).to_i
    candidate = 2
    while candidate <= limit && integer > 1
      if candidate.is_factor_of? integer
        factors << candidate
        integer /= candidate
        limit = Math.sqrt(integer).to_i
      else
        candidate = candidate == 2 ? 3 : candidate + 2
      end
    end
    factors << integer unless integer <= limit
    factors
  end


end