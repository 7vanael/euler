(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6
#_(The sum of the squares of the first 10 natural
       numbers is 1 ** 2 + 2 **2 + 3 **2 ... + 10 **2
       =385.
       The square of the sum of the first 10 natural
       numbers is (1 +2 +3 ... +10) ** 2 = 55 ** 2
       =3025
       The difference between the sum of squares and
       the square of sums is 3025 - 385 = 2640
       Find the difference between the sum of the squares
       and the square of the sum of the first 100 natural numbers)
(describe "Euler Problem #6"

  (it "finds the sum of squares for 1"
    (should= 1 (sum-of-squares [1])))
  (it "finds the sum of squares for 2"
    (should= 5 (sum-of-squares [1 2])))
  (it "finds the sum of squares for 3"
    (should= 14 (sum-of-squares [1 2 3])))
  (it "finds the sum of squares for 5"
    (should= 55 (sum-of-squares [1 2 3 4 5])))
  (it "finds the sum of squares for 10"
    (should= 385 (sum-of-squares [1 2 3 4 5 6 7 8 9 10])))
  (it "finds the sum of squares for 20"
    (should= 2870 (sum-of-squares [1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20])))

  (it "finds the square of sums for 1"
    (should= 1 (square-of-sums [1])))
  (it "finds the square of sums for 2"
    (should= 9 (square-of-sums [1 2])))
  (it "finds the square of sums for 3"
    (should= 36 (square-of-sums [1 2 3])))

  (it "Solves #6 for 10"
    (should= 2640 (euler-6 10)))
  (it "Solves #6 for 100"
    (should= 25164150 (euler-6 100))))

(run-specs)
