<?php

/**
 * PrimeFactors (12Meses12Katas: Jul 2011)
 *
 * @author rmhdev
 */
class PrimeFactors {

    public static function generate($number){

        $result = array();
        for ($factor = 2; $factor <= ($number / 2); $factor++){
            while (($number % $factor) == 0){
                $result[] = $factor;
                $number /= $factor;
            }
        }
        if ($number > 1){
            $result[] = $number;
        }
        
        return $result;
    }

}
