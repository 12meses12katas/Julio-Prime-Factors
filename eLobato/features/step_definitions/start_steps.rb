require 'test/unit/assertions'
include Test::Unit::Assertions

Given /^I have nothing to start with$/ do
  assert_equal true,true
end
 
When /^I want to start$/ do
  assert_equal true,true
end
 
Then /^a class named "PrimeFactors" must exist$/ do 
  assert File.exist?("src/PrimeFactors.rb")
end
 
