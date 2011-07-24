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
  pending # express the regexp above with the code you wish you had
end
 
