<?php

class PrimeFactors {
	function __construct() {
	
	}

	var $factorsArray = array();

	
	public function generate($numberToDecompose){		

	    for($i = 2; $i <= $numberToDecompose; ++$i) {
	        while ($numberToDecompose % $i == 0) {
		        	array_push($this->factorsArray,$i);
	             $numberToDecompose /= $i;
	        }
	    }
		return $this->factorsArray;
	}


	
	
}

?>