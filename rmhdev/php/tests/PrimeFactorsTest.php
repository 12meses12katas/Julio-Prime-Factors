<?php

require_once '../PrimeFactors.php';

/**
 * Tests for PrimeFactors (12Meses12Katas: Jul 2011)
 *
 * @author rmhdev
 */
class PrimeFactorsTest extends PHPUnit_Framework_TestCase{

    function testProvider(){
        $testCases          = array();
        $testCases["Factor 1"]     = array(    array()         , 1     );
        $testCases["Factor 2"]     = array(    array(2)        , 2     );
        $testCases["Factor 3"]     = array(    array(3)        , 3     );
        $testCases["Factor 4"]     = array(    array(2, 2)     , 2*2   );
        $testCases["Factor 6"]     = array(    array(2, 3)     , 2*3   );
        $testCases["Factor 8"]     = array(    array(2, 2, 2)  , 2*2*2 );
        $testCases["Factor 9"]     = array(    array(3, 3)     , 3*3   );
        $testCases["Factor 25"]    = array(    array(5, 5)     , 5*5   );
        $testCases["Factor 49"]    = array(    array(7, 7)     , 7*7   );
        $testCases["Factor 121"]   = array(    array(11, 11)   , 11*11 );
        $testCases["Factor extra"] = array(    array(2, 3, 5, 7, 11)   , 2*3*5*7*11 );

        return $testCases;
    }

    /**
     * @dataProvider testProvider
     */
    public function testGenerate($expected, $actual){
        $this->assertEquals($expected, PrimeFactors::generate($actual));
    }

}
