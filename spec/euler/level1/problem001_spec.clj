(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

          (it "finds the multiples of 3 of n <= 3"
              (should= [] (multiples-of-3 0))
              (should= [] (multiples-of-3 1))
              (should= [] (multiples-of-3 2))
              (should= [] (multiples-of-3 3))
              )
          (it "finds the multiples of 3 of n >= 4 && < 7"
              (should= [3] (multiples-of-3 4))
              (should= [3] (multiples-of-3 5))
              (should= [3] (multiples-of-3 6))
              )
          (it "finds the multiples of 3 of n >= 7 && < 10"
              (should= [3 6] (multiples-of-3 7))
              (should= [3 6] (multiples-of-3 8))
              (should= [3 6] (multiples-of-3 9))
              (should= [3 6 9] (multiples-of-3 10))
              )
          (it "finds the multiples of 3 of n >= 10"
              (should= [3 6 9] (multiples-of-3 10))
              )
          (it "finds the multiples of 5 of n <= 5"
              (should= [] (multiples-of-5 0))
              (should= [] (multiples-of-5 1))
              (should= [] (multiples-of-5 2))
              (should= [] (multiples-of-5 3))
              (should= [] (multiples-of-5 4))
              (should= [] (multiples-of-5 5))
              )
          (it "finds the multiples of 5 of n > 5 && < 11"
              (should= [5] (multiples-of-5 6))
              (should= [5] (multiples-of-5 7))
              (should= [5] (multiples-of-5 8))
              (should= [5] (multiples-of-5 9))
              (should= [5] (multiples-of-5 10))
              )
          (it "finds the multiples of 5 of n >= 11"
              (should= [5 10] (multiples-of-5 11))
              )

          (it "Solves #1 for n <= 10"
              (should= 0 (sum-of-multiples-of-3-or-5 0))
              (should= 0 (sum-of-multiples-of-3-or-5 1))
              (should= 0 (sum-of-multiples-of-3-or-5 2))
              (should= 0 (sum-of-multiples-of-3-or-5 3))
              (should= 3 (sum-of-multiples-of-3-or-5 4))
              (should= 3 (sum-of-multiples-of-3-or-5 5))
              (should= 8 (sum-of-multiples-of-3-or-5 6))
              (should= 14 (sum-of-multiples-of-3-or-5 7))
              (should= 23 (sum-of-multiples-of-3-or-5 10))
              )

          (it "Solves #1 for n = 16"
              (should= 45 (sum-of-multiples-of-3-or-5 15))
              )
          (it "Solves #1 for n = 20"
              (should= 78 (sum-of-multiples-of-3-or-5 20))
              )
          (it "Solves #1 for n = 1000"
              (should= 233168 (sum-of-multiples-of-3-or-5 1000))
              )
          )

(run-specs)
