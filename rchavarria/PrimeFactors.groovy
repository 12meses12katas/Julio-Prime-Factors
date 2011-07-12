
class PrimeFactors {
    
    public def generate(int n){
        n > 1 ? computeFactorsOf(n) : []
    }
    
    private def computeFactorsOf(int n){
        def factors = []
        
        for(def candidate = 2; candidate <= n; candidate++) {
            while(isFactor(n, candidate)){
                factors << candidate
                n /= candidate
            }
        }
        
        factors
    }
    
    private def isFactor(def n, def factor){
        n % factor == 0
    }
}
