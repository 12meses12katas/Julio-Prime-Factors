(ns primefactors
   (:use clojure.test))
   
(defn generate-with-candidate [x candidate]
	(if (= x candidate)
		[candidate]
		(if (= 0 (rem x candidate))
			(concat [candidate] (generate-with-candidate (/ x candidate) candidate))
			(generate-with-candidate x (+ candidate 1))
		)
	)
	
)
   
(defn generate [x] 
	(generate-with-candidate x 2)	
)

(deftest test-two-returns-two
  (is (= [2]  (generate 2))))
 
(deftest test-three-returns-three
  (is (= [3]  (generate 3))))
  
(deftest test-four-returns-two-twice
  (is (= [2,2]  (generate (* 2 2)))))
  
(deftest test-more-than-one-factor
  (is (= [2,3]  (generate (* 2 3)))))

(deftest test-repeated-factors-etc
  (is (= [2,2,3,5]  (generate(* 2 2 3 5)))))

(run-tests)