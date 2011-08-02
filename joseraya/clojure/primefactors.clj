(ns primefactors
   (:use clojure.test))
   
(defn generate [x] 
	(if (= 2 x) [2]
  		(if (zero? (rem x 2)) (conj (generate (/ x 2)) 2))
  	)
)

(deftest test-two-returns-two
  (is (= [2]  (generate 2))))

(deftest test-four-returns-two-twice
  (is (= [2,2]  (generate 4))))
  
(deftest test-more-than-one-factor
  (is (= [2,3]  (generate 6))))
(run-tests)