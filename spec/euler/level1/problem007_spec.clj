(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]
    [euler.level1.helper :as helper]))

; https://projecteuler.net/problem=7
;(By listing the first 6 prime numbers:
;      2 3 5 7 11 13 , we can see that the 6 th prime is 13
;      What is the 10 001 'st prime number?)

(describe "Euler Problem #7"


  (it "Solves #7 for 1"
    (should= 2 (euler-7 1)))
  (it "Solves #7 for 3"
    (should= 3 (euler-7 2)))
  (it "Solves #7 for 2"
    (should= 5 (euler-7 3)))
  (it "Solves #7 for 4"
    (should= 7 (euler-7 4)))
  (it "Solves #7 for 5"
    (should= 11 (euler-7 5)))
  (it "Solves #7 for 6"
    (should= 13 (euler-7 6)))
  (it "Solves #7 for 10001"
    (should= 104743 (euler-7 10001)))
  )


(run-specs)
