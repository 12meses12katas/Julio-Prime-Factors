<?php

require_once 'PHPUnit/Framework/TestCase.php';
require_once 'PrimeFactors.php';

/**
 * PrimeFactors test case.
 */
class PrimeFactorsTest extends PHPUnit_Framework_TestCase {
	
	/**
	 * @var PrimeFactors
	 */
	private $PrimeFactors;
	
	/**
	 * Prepares the environment before running a test.
	 */
	protected function setUp() {
		parent::setUp ();
		
		// TODO Auto-generated PrimeFactorsTest::setUp()
		

		$this->PrimeFactors = new PrimeFactors(/* parameters */);
	
	}
	
	/**
	 * Cleans up the environment after running a test.
	 */
	protected function tearDown() {
		// TODO Auto-generated PrimeFactorsTest::tearDown()
		

		$this->PrimeFactors = null;
		
		parent::tearDown ();
	}
	
	/**
	 * Constructs the test case.
	 */
	public function __construct() {
		// TODO Auto-generated constructor
	}

	public function testOne(){
		$this->assertEquals($this->PrimeFactors->generate(1), array());
	}
	
	public function testTwo(){
		$this->assertEquals($this->PrimeFactors->generate(2), array(2));
	}
	
	public function testFour(){
		$this->assertEquals($this->PrimeFactors->generate(4), array(2,2));
	}
	
	public function testFive(){
		$this->assertEquals($this->PrimeFactors->generate(5), array(5));
	}
	
	public function testSix(){
		$this->assertEquals($this->PrimeFactors->generate(6), array(2,3));
	}

	public function testEight(){
		$this->assertEquals($this->PrimeFactors->generate(8), array(2,2,2));
	}
	
	public function testEleven(){
		$this->assertEquals($this->PrimeFactors->generate(11), array(11));
	}

	public function testZero(){
		$this->assertEquals($this->PrimeFactors->generate(0), array());
	}
	
	
	
	
	public function testTwoHundredEightyEight(){
		$this->assertEquals($this->PrimeFactors->generate(288), array(2,2,2,2,2,3,3));
	}
	public function testThirtyThree(){
		$this->assertEquals($this->PrimeFactors->generate(33), array(3,11));
	}
	
}

