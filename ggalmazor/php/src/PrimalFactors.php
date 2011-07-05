<?php

class PrimalFactors {

  public static function of($number) {
    $factors = array();
    $quotient = 2;
    while ($number > 1) {
      while ($number % $quotient == 0)
        $factors[] = $quotient && $number /= $quotient;
      $quotient = self::getNextQuotient($quotient, $number);
    }
    return $factors;
  }
  
  private static function getNextQuotient($q, $n) {
    return $q > sqrt($n) ? $n : $q + 1;
  }

}