(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5
#_(2520 is the smallest number that can be divided by
  each of the numbers from 1 to 10 without any remainder.
  What is the smallest positive number that is evenly divisible
  by all of the numbers from 1 to 20 ?)

(describe "Euler Problem #5"

  (it "Gets multiples"
      (should= 1 (get-multiple 1))
      (should= 2 (get-multiple 2))
      (should= 6 (get-multiple 3))
      (should= 12 (get-multiple 4))
      (should= 60 (get-multiple 5))
      (should= 120 (get-multiple 6))
      )
  (it "confirms if a multiple is divisible by all factors in range 1 to n"
      (should= true (divisible-by-all? 1 1))
      (should= true (divisible-by-all? 2 2))
      (should= true (divisible-by-all? 6 3))
      (should= true (divisible-by-all? 12 4))
      (should= true (divisible-by-all? 60 5))
      (should= false (divisible-by-all? 40 5))
      )

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
