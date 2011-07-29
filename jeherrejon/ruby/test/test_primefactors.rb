require "test/unit"
require "primefactors"

class TestPrimeFactors < Test::Unit::TestCase
    
    def setup
        @primenumbers = [2,3,5,7,11,13,997,104729]
        @composednumbers = [[4,[2,2]],
                            [6,[2,3]],
                            [27,[3,3,3]],
                            [102,[2,3,17]],
                            [997*104729,[997,104729]]]
    end

    def test_prime_factors_of_zero_and_one_should_be_empty
        assert_equal([], 0.primefactors)
        assert_equal([], 1.primefactors)
    end

    def test_prime_factors_of_a_prime_number
        @primenumbers.each { |value|
            assert_equal([value], value.primefactors)
        }
    end

    def test_prime_factors_of_composed_numbers
        @composednumbers.each { |value,expected|
            assert_equal(expected, value.primefactors)
        }
    end

    def test_prime_factors_of_four
        assert_equal([2,2], 4.primefactors)
    end
    
    def test_prime_factors_of_six
        assert_equal([2,3], 6.primefactors)
    end
    
    def test_prime_factors_of_nine
        assert_equal([3,3], 9.primefactors)
    end

end
