<?php

require 'Hamcrest/hamcrest.php';
require '../src/PrimalFactors.php';

class PrimalFactorsTest extends \PHPUnit_Framework_TestCase {

  public function getTestCases() {
    return array(
        'should factor 1' => array(1, array()),
        'should factor 2' => array(2, array(2)),
        'should factor 3' => array(3, array(3)),
        'should factor 4' => array(4, array(2,2)),
        'should factor 5' => array(5, array(5)),
        'should factor 6' => array(6, array(2,3)),
        'should factor 7' => array(7, array(7)),
        'should factor 8' => array(8, array(2,2,2)),
        'should factor 9' => array(9, array(3,3)),
        'should factor 2*3*5*7*11*13' => array(2*3*5*7*11*13, array(2,3,5,7,11,13)),
        'should factor 2**100' => array(pow(2, 100), $this->getTwoPowHundredFactors())
    );
  }

  /**
   * @test
   * @dataProvider getTestCases
   */
  public function should_factor_numbers($number, $expectedFactors) {
    assertThat(PrimalFactors::of($number), is($expectedFactors));
  }
  
  private function getTwoPowHundredFactors() {
    $factors = array();
    for($i = 0; $i < 100; $i++) {
      $factors[] = 2;
    }
    return $factors;
  }
  
}