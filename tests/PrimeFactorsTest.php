<?php

require_once 'PHPUnit/Framework.php';
require_once 'PrimeFactors.php';

class PrimeFactorsTest extends PHPUnit_Framework_TestCase
{

    public function getTestCases(){
        return array( "should return an empty array" =>
                       array (1, array()),
                      "should return two" =>
                       array (2, array(2)),
                      "should return two and three" =>
                       array (6, array(2,3)),
                      "should return two, three and five" =>
                       array (30, array(2,3,5)),
                      "should return three and five" =>
                       array (15, array(3,5)),
                      "should return seven and nineteen" =>
                       array (133, array(7, 19)),
                      "should return 3,5,7,13,17" =>
                       array (3*5*7*13*17, array(3,5,7,13,17)),
                      "should return two, two and two" =>
                       array (8, array(2,2,2)),
                      "should return three, three and three" =>
                       array (27, array(3,3,3))  
        );
    }

    /**
    * @dataProvider getTestCases
    */
    public function testAllCases($number, $expected)
    {
        $factorizer = new PrimeFactors();
        $this->assertEquals($expected, $factorizer->generate($number));
    }

}

?>
