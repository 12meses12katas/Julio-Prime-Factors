<?php

class PrimalFactors {

  public static function of($number) {
    $factors = array(); $quotient = 2;
    while ($number > 1 && $quotient++) {
      while ($number % $quotient == 0)
        $factors[] = $quotient && $number /= $quotient;
    }
    return $factors;
  }

}