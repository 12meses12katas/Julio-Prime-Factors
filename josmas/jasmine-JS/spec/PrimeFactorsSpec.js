describe("Prime Factors", function() {

  it("should return an empty array for the number 1", function() {
    expect([]).toEqual(PRIMEFACTORS.generate(1));
  });

  it("should return an array with the number 2 for the number 2", function() {
    expect([2]).toEqual(PRIMEFACTORS.generate(2));
  });

  it("should return an array with the number 3 for the number 3", function() {
    expect([3]).toEqual(PRIMEFACTORS.generate(3));
  });

  it("should return an array with the numbers 2,2 for the number 4", function() {
    expect([2,2]).toEqual(PRIMEFACTORS.generate(4));
  });

  it("should return an array with the numbers 2,3 for the number 6", function() {
    expect([2,3]).toEqual(PRIMEFACTORS.generate(6));
  });

  it("should return an array with the numbers 2,2,2 for the number 8", function() {
    expect([2,2,2]).toEqual(PRIMEFACTORS.generate(8));
  });

  it("should return an array with the numbers 3,3 for the number 9", function() {
    expect([3,3]).toEqual(PRIMEFACTORS.generate(9));
  });
});

var PRIMEFACTORS = (function () {
  var primefactors = {};

  primefactors.generate = function (number){
    var result = [];
    for (var candidate = 2; number > 1; candidate += 1)
      for (; number % candidate === 0; number /= candidate)
        result.push(candidate);

    return result;
  };

  return primefactors;
}());
