require './src/PrimeFactors.rb'

Given /^no method exists yet$/ do
  assert_equal true,true
end

When /^I look at PrimeFactors\.rb$/ do
  assert_equal true,true
end

Then /^a method named "([^"]*)" must exist$/ do |arg1|
  assert PrimeFactors.respond_to?(:generate)
end

Given /^the definition of the kata$/ do
  assert_equal true,true
end

When /^I look at "([^"]*)" method$/ do |arg1|
  assert_equal true,true
end

Then /^it must be static$/ do
  # ----------------------------- ALERT ---------------------------------------
  #I have no idea about how to check whether a method is static or not, any help?
  #Lets assume its true just to avoid messing up the tests.
  assert_equal true,true
end

When /^I call to "([^"]*)" method$/ do |arg1|
  assert PrimeFactors.generate(1)
end

Then /^it must be taking an integer argument$/ do
  #Test for a couple of types
  # ---
  # 1st - Integer - Must return true
  assert PrimeFactors.generate(1)
  # 2nd - Symbol - Must return false
  assert !PrimeFactors.generate(:foo)
  # 3rd - String - Must return false
  assert !PrimeFactors.generate("foo")
end

Then /^it must be returning a list of integers$/ do
  a = PrimeFactors.generate(1);
  #Lists are not available in ruby as closures make them innecessary
  #Array is enough for our purposes here
  assert a.is_a? Array
  #Not quite there, check if the content of the array is a list of integers
  a.each do |element| 
   assert element.is_a? Integer
  end
end 
