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
      (should= 1 (get-multiple [1]))
      (should= 2 (get-multiple [2]))
      (should= 6 (get-multiple [2 3]))
      (should= 4 (get-multiple [2 2]))
      (should= 30 (get-multiple [2 3 5]))
      (should= 60 (get-multiple [2 2 3 5]))
      )

  (it "Finds  the primes of n"
    (should= [2] (get-primes 2))
    (should= [3] (get-primes 3))
    (should= [2 2] (get-primes 4))
    (should= [5] (get-primes 5))
    (should= [2 3] (get-primes 6))
    (should= [7] (get-primes 7))
    (should= [2 3 5] (get-primes 30))
    (should= [2 2 3 5] (get-primes 60)))

  (it "Solves #5"
    (should= 1 (euler-5 1))
    (should= 2 (euler-5 2))
    (should= 6 (euler-5 3))
    (should= 12 (euler-5 4))
    (should= 60 (euler-5 5))
    (should= 60 (euler-5 6))
      )
  )

(run-specs)
