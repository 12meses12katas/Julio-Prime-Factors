<?php

require_once realpath( __DIR__ . '/..' ) . '/PrimeFactors.php';

/**
 * Test class for Prime Factors Kata.
 *
 */
class PrimeFactorsTest extends PHPUnit_Framework_TestCase
{
	public function  __construct()
	{
		$this->p = new PrimeFactors();
	}

	public function test1HasNoPrimeFactors()
	{
		$result = $this->p->generate( 1 );
		$this->assertEquals( 0, count( $result ) );
	}

	public function testPrimeFactorsOf2Is2()
	{
		$result = $this->p->generate( 2 );
		$this->assertEquals( 1, count( $result ) );
		$this->assertContains( 2, $result );
	}

	public function testPrimeFactorsOf3Is3()
	{
		$result = $this->p->generate( 3 );
		$this->assertEquals( 1, count( $result ) );
		$this->assertContains( 3, $result );
	}

	public function testPrimeFactorsOf4AreTwo2()
	{
		$result = $this->p->generate( 4 );
		$this->assertEquals( 2, count( $result ) );
		$this->assertEquals( 2, $result[0] );
		$this->assertEquals( 2, $result[1] );
	}

	public function testPrimeFactorsOf5Is5()
	{
		$result = $this->p->generate( 5 );
		$this->assertEquals( 1, count( $result ) );
		$this->assertContains( 5, $result );
	}

	public function testPrimeFactorsOf6Is2And3()
	{
		$result = $this->p->generate( 6 );
		$this->assertEquals( 2, count( $result ) );
		$this->assertContains( 2, $result );
		$this->assertContains( 3, $result );
	}

	public function testPrimeFactorsOf7Is7()
	{
		$result = $this->p->generate( 7 );
		$this->assertEquals( 1, count( $result ) );
		$this->assertContains( 7, $result );
	}

	public function testPrimeFactorsOf14Are2And7()
	{
		$result = $this->p->generate( 14 );
		$this->assertEquals( 2, count( $result ) );
		$this->assertContains( 2, $result );
		$this->assertContains( 7, $result );
	}

	public function testZero()
	{
		$this->assertEquals( $this->p->generate( 0 ), array() );
	}
}