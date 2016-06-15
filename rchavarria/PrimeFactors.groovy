import java.math.* 

class PrimeFactors {
    
    public def generate(def n){
        n == 1 ? []: compute(n)
    }
    
    public def compute(def n){
        def factors = []
        
        for(def factor = 2; factor <= n; factor++){
            for(;isFactor(n, factor); n = (n / factor).toInteger()){
                factors << factor
            }
        }
        
        factors
    }
    
    private def isFactor(def n, def factor){
        def mod = n % factor
        mod == 0
    }
}
