require 'mathn'

class PrimeFactors
 def self.generate(int)
   solution = Array.new
   if(int.is_a? Integer)
    for number in 1..int do
      if (int % number == 0) and (number.prime?)
        solution << number
      end
    end
   else
    false
   end
   return solution
 end
end
