var PrimeFactors = function() {
    this.generate = function(number) {
        var output = [];
        var newNumber = number;
        var posibleFactor = 2; 
        
        while (posibleFactor * posibleFactor <= newNumber) {
            if (newNumber % posibleFactor == 0) { 
                output.push(posibleFactor);
                newNumber = newNumber / posibleFactor;   
            } else {
                posibleFactor++;
            }
        }

        if (newNumber != 1) {
          output.push(newNumber);
        }

        return output;
    }
}

exports.PrimeFactors = PrimeFactors;
