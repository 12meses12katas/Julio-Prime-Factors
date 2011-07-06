var PrimeFactors = require('./PrimeFactors.js').PrimeFactors;

exports["testPrimeNumbers"] = function(test){
	var primeFactors = new PrimeFactors();
	test.equal(primeFactors.generate(2) , 2);
	test.equal(primeFactors.generate(3) , 3);
	test.equal(primeFactors.generate(5) , 5);
	test.equal(primeFactors.generate(7) , 7);
	test.equal(primeFactors.generate(11) , 11);
	test.equal(primeFactors.generate(13) , 13);
	test.equal(primeFactors.generate(89) , 89);
	test.done();
};
exports["testNonPrimeNumbers"] = function(test){
	var primeFactors = new PrimeFactors();
	test.deepEqual(primeFactors.generate(4) , [2, 2]);
	test.deepEqual(primeFactors.generate(4) , [2, 2]);
	test.deepEqual(primeFactors.generate(6) , [2, 3]);
	test.deepEqual(primeFactors.generate(8) , [2, 2, 2]);
	test.deepEqual(primeFactors.generate(9) , [3, 3]);
	test.deepEqual(primeFactors.generate(10) , [2, 5]);
	test.deepEqual(primeFactors.generate(12) , [2, 2, 3]);
	test.deepEqual(primeFactors.generate(45) , [3, 3, 5]);
	test.deepEqual(primeFactors.generate(68) , [2, 2, 17]);
	test.deepEqual(primeFactors.generate(90) , [2, 3, 3, 5]);
	test.deepEqual(primeFactors.generate(100) , [2, 2, 5 ,5]);
        test.done();
};
