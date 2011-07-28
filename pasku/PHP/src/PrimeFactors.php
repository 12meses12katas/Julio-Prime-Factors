<?php

class PrimeFactors
{
    public static function generate($number)
    {
        $factors = array();
        for ($divisor = 2; $number > 1; $divisor++) {
            for (; $number % $divisor === 0; $number /= $divisor) {
                $factors[] = $divisor;
            }
        }
        return $factors;
    }
}
