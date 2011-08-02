Feature: Static method
  In order to accomplish the kata
  As a coder
  I want to have a static method named "generate"

  Scenario: Method creation
    Given no method exists yet
    When I look at PrimeFactors.rb
    Then a method named "generate" must exist

  Scenario: Staticness
    Given the definition of the kata
    When I look at "generate" method
    Then it must be static

  Scenario: Argument
    Given the definition of the kata
    When I call to "generate" method
    Then it must be taking an integer argument

  Scenario: Return
    Given the definition of the kata
    When I call to "generate" method
    Then it must be returning a list of integers

  
  

