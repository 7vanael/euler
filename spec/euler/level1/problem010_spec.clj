(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :refer :all]))

; https://projecteuler.net/problem=10
#_(The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17
       Find the sum of all the primes below 2 million)

(describe "Euler Problem #10"

  #_(it "finds the index of helper/primes of the highest prime < n"
    (should= 0 (primes-max-index 3)))

  (it "Solves #10"
    (should= 17 (euler-10 10))
    (should= 17 (euler-10 11))
    (should= 28 (euler-10 12))
    (should= 41 (euler-10 14))
    (should= 142913828922 (euler-10 2000000))
    )
  )

(run-specs)
