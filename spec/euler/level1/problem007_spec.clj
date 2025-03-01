(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7
#_(By listing the first 6 prime numbers:
      2 3 5 7 11 13, we can see that the 6 'th prime is 13.
      What is the 10 001 'st prime number?)

(describe "Euler Problem #7"

  (it "Solves #7"
    (should= -1 (euler-7 -1)))
  )

(run-specs)
