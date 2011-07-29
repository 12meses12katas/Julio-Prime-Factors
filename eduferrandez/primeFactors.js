exports.generate = function(numberToFactorize) {
  var candidate = 2;
  var factors = [];
  while (numberToFactorize !== 1) {
    if (numberToFactorize % candidate === 0) {
      numberToFactorize = numberToFactorize / candidate;
      factors.push(candidate);
    } else {
      candidate++;
    } 
  }
  return factors;
}

