<?php

class PrimalFactors {

  public static function of($number) {
    $factors = array();
    $quotient = 2;
    while ($number > 1) {
      while (self::isFactor($quotient, $number))
        $factors[] = $quotient && $number /= $quotient;
      $quotient = self::getNextQuotient($quotient, $number);
    }
    return $factors;
  }
  
  private static function isFactor($q, $n) {
    return $n % $q == 0;
  }
  
  private static function getNextQuotient($q, $n) {
    return $q > sqrt($n) ? $n : $q + 1;
  }

}