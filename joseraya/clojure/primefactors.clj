(ns primefactors
   (:use clojure.test))
   
(defn generate [x] 
  [x]
)
(deftest test-two-returns-two
  (is (= [2]  (generate 2))))
  
(run-tests)