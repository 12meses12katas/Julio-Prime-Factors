require "rspec"
require 'primefactors.rb'

describe PrimeFactors do

  primeTests = {
    2 => [2],
    3 => [3],
    6 => [2,3],
    4 => [2,2],
    2*3*5*7*11*13 => [2,3,5,7,11,13],
    288 => [2,2,2,2,2,3,3],
    24 => [2,2,2,3],
    100 => [2,2,5,5],
    123456789 => [3,3,3607,3803]  # 16 seconds
  }

  primeTests.each do | number, factors|
    it "should return #{factors} for #{number}" do
       PrimeFactors.generate(number).should eq( factors )
     end
  end


end