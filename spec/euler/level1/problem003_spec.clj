(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3
; The prime factors of 13195 are 5, 7, 13 & 29
;What is the largest prime factor of the number 600851475143?

(describe "Euler Problem #3"
  (it "Finds  the primes of n"
      (should= [2] (get-primes 2))
      (should= [3] (get-primes 3))
      (should= [2] (get-primes 4))
      (should= [5] (get-primes 5))
      (should= [2 3] (get-primes 6))
      (should= [7] (get-primes 7))
      (should= [2 3 5] (get-primes 30))
      (should= [2 3 5] (get-primes 60)))

  (it "Removes a factor 3 from a number divisible by 3"
      (should= 1 (divide-by-factor 3 3))
      (should= 2 (divide-by-factor 6 3))
      (should= 1 (divide-by-factor 9 3))
      (should= 4 (divide-by-factor 12 3))
      (should= 5 (divide-by-factor 15 3))
      (should= 2 (divide-by-factor 18 3))
      (should= 1 (divide-by-factor 27 3)))

  (it "Removes a factor 2 from a number divisible by 2"
      (should= 1 (divide-by-factor 2 2))
      (should= 1 (divide-by-factor 4 2))
      (should= 3 (divide-by-factor 6 2))
      (should= 5 (divide-by-factor 10 2))
      (should= 7 (divide-by-factor 14 2))
      (should= 1 (divide-by-factor 16 2)))

  (it "Solves #3"
    (should= "The smallest prime is 2, please try a larger number" (euler-3 1))
    (should= 2 (euler-3 2))
    (should= 2 (euler-3 2))
    (should= 3 (euler-3 3))
    (should= 2 (euler-3 4))
    (should= 6857 (euler-3 600851475143))))

(run-specs)
