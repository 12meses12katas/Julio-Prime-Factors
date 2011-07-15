class Fixnum
    def primefactors
        factors = []
        factor =  2
        if self.isPrime?
            factors << self
        elsif self>2
            factor += 1 until self.isDivisible? factor 
            factors << factor
            factors += (self/factor).primefactors

        end
        factors
    end

    def isPrime?
        (2...(self.sqrt+1)).each do |num|
            return false if self.isDivisible?(num)
        end
        true and self>1
    end
    
    def sqrt
        Math.sqrt(self).to_i
    end
    
    def isDivisible?(value)
        self % value == 0
    end


end
