require "rspec"
require 'primefactors.rb'

describe PrimeFactors do


  it "should return [2] for 2" do
    PrimeFactors.generate(2).should eq( [2] )
  end

end