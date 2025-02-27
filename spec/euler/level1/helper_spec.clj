(ns euler.level1.helper-spec
  (:require [speclj.core :refer :all]
            [euler.level1.helper :refer :all]))

(describe "Prime Factors"
  (it "Finds  the primes of n"
    (should= [2] (get-primes 2))
    (should= [3] (get-primes 3))
    (should= [2 2] (get-primes 4))
    (should= [5] (get-primes 5))
    (should= [2 3] (get-primes 6))
    (should= [7] (get-primes 7))
    (should= [2 3 5] (get-primes 30))
    (should= [2 2 3 5] (get-primes 60))))