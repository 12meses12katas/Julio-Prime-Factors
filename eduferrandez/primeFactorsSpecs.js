var vows = require('vows'),
    assert = require('assert'),
    PrimeFactors = require('./primeFactors');

var numberFactors = [
  1,[],
  2,[2],
  3,[3],
  2 * 2, [2, 2],
  2 * 3, [2, 3],
  2 * 2 * 2, [2, 2, 2],
  3 * 3, [3, 3],
  2 * 5, [2, 5],
  11, [11],
  2 * 2 * 2, [2, 2, 2],
  2 * 3 * 5 * 7, [2, 3, 5, 7],
  2 * 3 * 5 * 7 * 11, [2, 3, 5, 7, 11]
];

var suite = vows.describe('Prime Factors');

for (var i = 0; i < numberFactors.length; i+=2) {
  var factors = numberFactors[i + 1];
  var number = numberFactors[i];
  var test = {};
  test['given number ' + number] = {
       topic: {number: number, factors: factors},
       'get its factors': function(topic) {
          assert.deepEqual(PrimeFactors.generate(topic.number), topic.factors);
       }
    }
  suite = suite.addBatch(test);
  
}
suite.run();
