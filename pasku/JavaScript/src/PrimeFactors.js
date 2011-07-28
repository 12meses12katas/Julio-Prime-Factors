var PrimeFactors = (function(undefined) {
	
  var PrimeFactorsObj = PrimeFactorsObj || {};

  PrimeFactorsObj.generate = function (number){
    var factors = [];
    for (var divisor = 2; number > 1; divisor++)
      for (; number % divisor === 0; number /= divisor) {
        factors.push(divisor);
      }
    return factors;
  };

  return PrimeFactorsObj;

}());
