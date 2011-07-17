<?php

class PrimeFactors {

    public static function generate($integer)
    {
        $result = array();
        if ($integer > 1) {
	    $noFactorFound = true;
            for ($factor = 2; $factor <= $integer && $noFactorFound; ++$factor){
                if(PrimeFactors::isFactor($integer, $factor)){
                    $result = array_merge(array($factor), PrimeFactors::generate($integer/$factor));
                    $noFactorFound = false;
                }
            }
        }
        return $result;
    }

    private function isFactor($integer, $factor)
    {
	return $integer % $factor == 0;
    }

}

?>
