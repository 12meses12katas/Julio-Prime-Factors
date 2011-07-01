require "rspec"
require 'primefactors.rb'

describe PrimeFactors do

  primeTests = {
    2 => [2],
    3 => [3],
    6 => [2,3],
    4 => [2,2],
  }

  primeTests.each do | number, factors|
    it "should return #{factors} for #{number}" do
       PrimeFactors.generate(number).should eq( factors )
     end
  end


end