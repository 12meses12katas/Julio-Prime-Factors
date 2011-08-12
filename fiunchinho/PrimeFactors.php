<?php
/**
 * Description of Bowling: http://butunclebob.com/ArticleS.UncleBob.ThePrimeFactorsKata
 *
 * @author fiunchinho
 */
class PrimeFactors {

	/**
	 * Try to factor the a number.
	 *
	 * @param int $number Number that we want to get the factors from.
	 * @return array Array containing the prime factors.
	 */
	public static function generate( $number )
	{
		for( $result = array(), $divider = 2; $number >= 2; $divider++ )
		{
			while( $number % $divider == 0 )
			{
				array_push( $result, $divider ) ;
				$number = (int) $number / $divider ;
			}
		}
		return $result;
	}
}
?>
