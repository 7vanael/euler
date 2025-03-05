(ns euler.level1.problem008-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem008 :refer :all]))

; https://projecteuler.net/problem=8
#_(The 4 adjacent digits that have the largest product in this
     series is 9 x 9 x 8 x 9 = 5832. Find the 13 adjacent
     digits that have the greatest product)


(describe "Euler Problem #8"

  (it "converts a number into a vector of digits"
    (should= [1] (number-to-digit-vector 1))
    (should= [1 2] (number-to-digit-vector 12))
    (should= [1 2 3 4 5] (number-to-digit-vector 12345)))

  (it "Solves #8"
    (should= 9 (euler-8 1))
    (should= 81 (euler-8 2))
    (should= 648 (euler-8 3))
    (should= 5832 (euler-8 4))
    (should= 23514624000 (euler-8 13))))