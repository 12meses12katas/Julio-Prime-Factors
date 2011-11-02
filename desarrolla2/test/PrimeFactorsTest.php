<?php

require_once 'PHPUnit/Framework.php';
require_once '../PrimeFactors.php';

/**
 * Test of PrimeFactors
 * @see README
 *
 * @author daniel.gonzalez@freelancemadrid.es
 */
class PrimeFactorsTest extends PHPUnit_Framework_TestCase {

    public function getTestCases() {
        $test_cases = array(
            'test prime factors of 1' => array(1, array(1)),
            'test prime factors of 2' => array(2, array(1, 2)),
            'test prime factors of 6' => array(6, array(1, 2, 3)),
            'test prime factors of 10' => array(10, array(1, 2, 5)),
        );
        $array_factors = array(
            array(1, 2, 2, 2, 2, 2, 13),
            array(1, 2, 2, 2, 2, 11, 13),
            array(1, 2, 2, 2, 7, 11, 13),
            array(1, 2, 2, 5, 7, 11, 13),
            array(1, 2, 3, 7, 7, 11, 13),
        );
        foreach ($array_factors as $factors) {
            $number = $this->getNumberForFactors($factors);
            $test_cases['test prime factors of ' . $number] =
                    array($number, $factors);
        }
        return $test_cases;
    }


    private function getNumberForFactors($factors = array()) {
        $number = 1;
        foreach ($factors as $factor) {
            $number *= $factor;
        }
        return $number;
    }

    /**
     * @test
     * @dataProvider getTestCases
     */
    public function testPrimeFactors($test_case, $expected) {
        $this->assertEquals($expected, PrimeFactors::generate($test_case));
    }

}