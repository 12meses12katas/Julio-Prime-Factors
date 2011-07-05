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
    if (self::isGreaterThan($q, self::squareRootOf($n)))
      return $n;
    else
      return self::getNextOddNumber($q);
  }
  
  private static function isGreaterThan($q, $n) {
    return $q > $n;
  }
  
  private static function squareRootOf($n) {
    return sqrt($n);
  }
  
  private static function getNextOddNumber($n) {
    return self::isEven($n) ? $n + 1 : $n + 2;
  }
  
  private static function isEven($n) {
    return $n % 2 == 0;
  }

}