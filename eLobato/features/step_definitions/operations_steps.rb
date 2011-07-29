Given /^the method self\.generate\(int\)$/ do
  assert true
end
 
When /^I call this method$/ do
  assert PrimeFactors.generate(1)
end
 
Then /^a list of the prime factors is returned$/ do
  a = PrimeFactors.generate(100) 
  assert_equal a, [2,5] 
end
 
Then /^the list is returned in numerical sequence$/ do
  #Copy of the previous test - the result is taken in numerical sequence
  a = PrimeFactors.generate(100) 
  assert_equal a, [2,5] 
end
 
