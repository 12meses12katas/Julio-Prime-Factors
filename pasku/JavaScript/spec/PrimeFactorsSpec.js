describe("Prime Factors", function() {

  it("should return an empty array for the number 1", function() { 
      var result = PrimeFactors.generate(1);
      expect(result).toEqual([]);
  });

  it("should return an array with the number 2 for the number 2", function() {
     var result = PrimeFactors.generate(2);
     expect(result).toEqual([2]);
  });

  it("should return an array with the numbers 2,2 for the number 4", function() {
     var result = PrimeFactors.generate(4);
     expect(result).toEqual([2,2]);
  });

  it("should return an array with the numbers 2,3 for the number 6", function() {
     var result = PrimeFactors.generate(6);
     expect(result).toEqual([2,3]);
  });

  it("should return an array with the numbers 2,2,2 for the number 8", function() {
     var result = PrimeFactors.generate(8);
     expect(result).toEqual([2,2,2]);
  });

  it("should return an array with the numbers 3,3 for the number 9", function() {
	 var result = PrimeFactors.generate(9);
     expect(result).toEqual([3,3]);
  });

  it("should return an array with the numbers 3,3,3 for the number 27", function() {
	 var result = PrimeFactors.generate(27);
     expect(result).toEqual([3,3,3]);
  });    

  it("should return an array with the numbers 2,3,5 for the number 30", function() {
	 var result = PrimeFactors.generate(30);
     expect(result).toEqual([2,3,5]);
  });
  
  it("should return an array with the numbers 7,19 for the number 133", function() {
	 var result = PrimeFactors.generate(133);
     expect(result).toEqual([7,19]);
  });

  it("should return an array with the numbers 3,5,7,13,17 for the number 23205", function() {
	 var result = PrimeFactors.generate(3*5*7*13*17);
     expect(result).toEqual([3,5,7,13,17]);
  });

});