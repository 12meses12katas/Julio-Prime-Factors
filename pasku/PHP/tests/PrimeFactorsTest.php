<?php

require_once '../src/PrimeFactors.php';

class PrimeFactorsTest extends PHPUnit_Framework_TestCase
{
    public function providePrimeFactors()
    {
        return array(
            'should return an empty array for the number 1' => array(1, array()),
            'should return an array with the number 2 for the number 2' => array(2, array(2)),
            'should return an array with the number 2,2 for the number 4' => array(4, array(2,2)),
            'should return an array with the number 2,3 for the number 6' => array(6, array(2,3)),
            'should return an array with the number 2,2,2 for the number 8' => array(8, array(2,2,2)),
            'should return an array with the number 3,3 for the number 9' => array(9, array(3,3)),
            'should return an array with the number 3,3,3 for the number 27' => array(27, array(3,3,3)),
            'should return an array with the number 2,3,5 for the number 30' => array(30, array(2,3,5)),
            'should return an array with the number 7,19 for the number 133' => array(133, array(7, 19)),
            'should return an array with the numbers 3,5,7,13,17 for the number 23205' => array(3*5*7*13*17, array(3,5,7,13,17))
        );
    }

    /**
     * @dataProvider providePrimeFactors
     */
    public function testPrimeFactors($number, $primeFactors)
    {
        $this->assertSame($primeFactors, PrimeFactors::generate($number));
    }
}
