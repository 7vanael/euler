(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5
#_(2520 is the smallest number that can be divided by
    each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible
    by all of the numbers from 1 to 20 ?)

(focus-describe "Euler Problem #5"

  (it "Gets multiple"
    (should= 1 (get-multiple {1 1}))
    (should= 2 (get-multiple {2 1}))
    (should= 6 (get-multiple {2 1, 3 1}))
    (should= 4 (get-multiple {2 2}))
    (should= 30 (get-multiple {2 1, 3 1, 5 1}))
    (should= 60 (get-multiple {2 2, 3 1, 5 1})))

  (it "finds the map of max frequencies of prime numbers for 3"
    (should= {2 1, 3 1} (max-frequency-map 3)))
  (it "finds the map of max frequencies of prime numbers for 4"
    (should= {2 2, 3 1} (max-frequency-map 4)))
  (it "finds the map of max frequencies of prime numbers for 5"
    (should= {2 2, 3 1, 5 1} (max-frequency-map 5)))

  (it "Solves #5"
    (should= 1 (euler-5 1))
    (should= 2 (euler-5 2))
    (should= 6 (euler-5 3))
    (should= 12 (euler-5 4))
    (should= 60 (euler-5 5))
    (should= 60 (euler-5 6))
    (should= 2520 (euler-5 10))
    (should= 232792560 (euler-5 20))))

(run-specs)
