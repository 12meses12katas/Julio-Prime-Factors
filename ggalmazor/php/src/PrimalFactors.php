<?php

class PrimalFactors {
  public static function of($n) {
    $factors = array();
    $q = 2;
    while ($n > 1) {
      while ($n % $q == 0) {
        $factors[] = $q;
        $n /= $q;
      }
      $q += 1;
    }
    return $factors;
  }
}