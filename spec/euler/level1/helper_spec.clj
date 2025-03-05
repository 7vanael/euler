(ns euler.level1.helper-spec
  (:require [speclj.core :refer :all]
            [euler.level1.helper :refer :all]))

(describe "Helper"
  (it "Finds all the primes of n"
    (should= [2] (get-primes 2))
    (should= [3] (get-primes 3))
    (should= [2 2] (get-primes 4))
    (should= [5] (get-primes 5))
    (should= [2 3] (get-primes 6))
    (should= [7] (get-primes 7))
    (should= [2 3 5] (get-primes 30))
    (should= [2 2 3 5] (get-primes 60)))

  (it "identifies if a number is prime"
    (should= false (prime? 1))
    (should= true (prime? 3))
    (should= false (prime? 15))
    (should= false (prime? 4))
    (should= true (prime? 5))
    (should= true (prime? 17))
    (should= true (prime? 29))
    (should= false (prime? 144))
    )
  )