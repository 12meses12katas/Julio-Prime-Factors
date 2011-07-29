Feature: Operations
  In order to do the operations of the last sentence
  As a coder
  I want to have the method generate returning a list of the prime factors in numerical sequence
  
  Scenario: Get prime factors
    Given the method self.generate(int)
    When I call this method
    Then a list of the prime factors is returned
    
  Scenario: Numerical sequence
    Given the method self.generate(int)
    When I call this method
    Then the list is returned in numerical sequence
