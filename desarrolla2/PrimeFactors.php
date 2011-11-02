<?php

/**
 * Description of PrimeFactors
 * @see README
 *
 * @author daniel.gonzalez@freelancemadrid.es
 */
class PrimeFactors {

    /**
     * Retrieve array of prime factors of $int
     * 
     * @param integer $n
     * @return array $prime_factors
     */
    public function generate($n) {

        $factors = array(1);

        if ($n == 1) {
            return $factors;
        }

        for ($i = 2; $i <= $n; $i++) {
            while (!($n % $i)) {
                array_push($factors, $i);
                $n /=  $i;
            }
        }
        return $factors;
    }

}